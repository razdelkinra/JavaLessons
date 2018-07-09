dfgA = {
    updateQueryAndRedirect: function (key, value, uri) {
        window.location.href = dfgA.updateQuery(key, value, uri);

    },
    updateQuery: function (key, value, url) {
        if (!url) url = window.location.href;
        var re = new RegExp("([?&])" + key + "=.*?(&|#|$)(.*)", "gi"),
            hash;

        if (re.test(url)) {
            if (typeof value !== 'undefined' && value !== null)
                return url.replace(re, '$1' + key + "=" + value + '$2$3');
            else {
                hash = url.split('#');
                url = hash[0].replace(re, '$1$3').replace(/(&|\?)$/, '');
                if (typeof hash[1] !== 'undefined' && hash[1] !== null)
                    url += '#' + hash[1];
                return url;
            }
        }
        else {
            if (typeof value !== 'undefined' && value !== null) {
                var separator = url.indexOf('?') !== -1 ? '&' : '?';
                hash = url.split('#');
                url = hash[0] + separator + key + '=' + value;
                if (typeof hash[1] !== 'undefined' && hash[1] !== null)
                    url += '#' + hash[1];
                return url;
            }
            else
                return url;
        }
    },


    applyPage: function (page, uri) {
        window.location.href = dfgA.updateQuery('page', page, uri);
    },


    applyFilter: function () {
        var uri = dfgA.updateQuery('page');

        $('[data-tab="filter"]').each(function (input) {

            var val = $(this).val().trim();
            val = val.length > 0 ? val : undefined;
            uri = dfgA.updateQuery($(this).attr('name'), val, uri);
        });

        window.location.href = uri;
    }


}