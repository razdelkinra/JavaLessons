LNode = function (lnode, basePath) {

    var controlPath = basePath;
    var that = this;
    var controls = {};

    var leftNode,
        rightNode;


    initializeControls(lnode);


    setId(lnode.id);
    setName(lnode.name);
    setValue(lnode.value);
    setType(lnode.type.$name);
    setLeftNode(lnode.leftNode ? new LNode(lnode.leftNode, controlPath + '.leftNode') : null);
    setRightNode(lnode.rightNode ? new LNode(lnode.rightNode, controlPath + '.rightNode') : null);

    this.getNode = function () {
        return controls.node;
    };

    this.delete = function () {

        if (that.left && that.parent)
            that.parent.setLeftNode(LNode.prototype.getNone(controlPath));

        if (that.right && that.parent)
            that.parent.setRightNode(LNode.prototype.getNone(controlPath));

    };

    this.setLeftNode = function () {
        setLeftNode.apply(this, arguments);
    };

    this.setRightNode = function () {
        setRightNode.apply(this, arguments);
    };


    function initializeControls(lnode) {

        controls.node = document.createElement('div');
        controls.node.lnode = that;
        controls.node.innerHTML =
            "<div class=\"lnode\"> \
                <div class=\"lnode_content\"> \
                    <select class=\"lnode_type\"> \
                        <option value=NONE >NONE</option> \
                        <option value=OR >OR</option> \
                        <option value=AND >AND</option> \
                        <option value=NOT >NOT</option> \
                        <option value=FORM_DATA_PARAMETER >FORM_DATA_PARAMETER</option> \
                        <option value=BODY_PARAMETER >BODY_PARAMETER</option> \
                        <option value=FORM_ATTRIBUTE >FORM_ATTRIBUTE</option> \
                        <option value=QUERY_DATA_PARAMETER >QUERY_DATA_PARAMETER</option> \
                        <option value=HEADER_PARAM >HEADER_PARAM</option> \
                        <option value=URL >URL</option> \
                        <option value=METHOD >METHOD</option> \
                    </select> \
                    <input type=\"hidden\" class=\"lnode_id\" /> \
                    <input type=\"text\" class=\"lnode_name\" /> \
                    <input type=\"text\" class=\"lnode_value\" /> \
                    <input type=\"button\" class=\"lnode_button_delete\" value=\"Delete\" /> \
                </div> \
                <div class=\"lnode_childs lnode_child_left\"> \
                </div> \
                <div class=\"lnode_childs lnode_child_right\"> \
                </div> \
            </div>";

        controls.id = controls.node.querySelector(".lnode_id");
        controls.id.name = controlPath + ".id";


        controls.value = controls.node.querySelector(".lnode_value");
        controls.value.name = controlPath + ".value";

        controls.name = controls.node.querySelector(".lnode_name");
        controls.name.name = controlPath + ".name";

        controls.type = controls.node.querySelector(".lnode_type");
        controls.type.name = controlPath + ".type";


        controls.content = controls.node.querySelector(".lnode_content");
        controls.child = controls.node.querySelector(".lnode_childs");

        controls.leftChild = controls.node.querySelector(".lnode_child_left");
        controls.rightChild = controls.node.querySelector(".lnode_child_right");

        controls.delete_button = controls.node.querySelector(".lnode_button_delete");


        //set names

        controls.type.addEventListener('change', function (e) {
            setType(e.target.value);
            setName(null);
            setValue(null);
        });

        controls.delete_button.addEventListener('click', function (e) {
            that.delete();
        });


    }

    function setId(value) {
        controls.id.value = value;
        controls.id.disabled = value ? false : true;

    }

    function setName(value) {
        controls.name.value = value;

    }

    function setValue(value) {
        controls.value.value = value;

    }

    function setType(value) {

        controls.type.value = value;

        if (value == 'OR' || value == 'AND' || value == 'NOT') {
            $(controls.name).hide();
            $(controls.value).hide();
        } else {
            $(controls.name).show();
            $(controls.value).show();
        }


        if (!canHasLeftChild(value) && controls.leftNode)
            setLeftNode(null);


        if (!canHasRightChild(value) && controls.rightNode)
            setRightNode(null);

        if (canHasLeftChild(value) && !controls.leftNode)
            setLeftNode(LNode.prototype.getNone(controlPath + ".leftNode"));

        if (canHasRightChild(value) && !controls.rightNode)
            setRightNode(LNode.prototype.getNone(controlPath + ".rightNode"));

        if (canHasLeftChild(value) || canHasRightChild(value))
            $(controls.delete_button).show();
        else
            $(controls.delete_button).hide();
    }


    function setLeftNode(value) {

        if (leftNode)
            controls.leftChild.removeChild(controls.leftNode);

        controls.leftNode = value ? value.getNode() : null;
        leftNode = value;

        if (controls.leftNode) {
            controls.leftChild.appendChild(controls.leftNode);

            leftNode.parent = that;
            leftNode.left = true;
            leftNode.right = false;
        }


    }

    function setRightNode(value) {

        if (rightNode)
            controls.rightChild.removeChild(controls.rightNode);

        controls.rightNode = value ? value.getNode() : null;
        rightNode = value;

        if (controls.rightNode) {
            controls.rightChild.appendChild(controls.rightNode);

            rightNode.parent = that;
            rightNode.left = false;
            rightNode.right = true;
        }

    }


    function canHasLeftChild(type) {
        return ["OR", "AND", "NOT"].indexOf(type) >= 0;
    }

    function canHasRightChild(type) {
        return ["OR", "AND"].indexOf(type) >= 0;
    }


};

LNode.prototype.getNone = function (controlPath) {


    return new LNode({
        id: null,
        value: null,
        name: null,
        type: {$name: 'NONE'}
    }, controlPath)
};

LNode.config = function (o) {

    if (o.nodeTypes && o.nodeTypes && Array.isArray(o.nodeTypes)) {
        LNode.prototype.nodeTypes = o.nodeTypes;

        var optionsStr = "";

        for (var i = 0; i < o.nodeTypes.length; i++) {
            optionsStr += "<option value=\"" + o.nodeTypes[i] + "\" >" + o.nodeTypes[i] + "</option>"
        }

    }

};

