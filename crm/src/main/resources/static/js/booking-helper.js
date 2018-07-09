$(document).ready(function () {
    $('#checkin').datepicker({
        format: 'dd-M-yyyy'
    });
    $('#checkout').datepicker({
        format: 'dd-M-yyyy'
    });
});
var selectedLocation;
function searchLocation() {
    $("#search_input").autocomplete({
        source: function (request, response) {
            $.get("/ajaxSearchLocation", {location: $('#search_input').val()}, function (data) {
                return response($.map(data, function (value, key) {
                    return {
                        label: value.name,
                        value: value.name,
                        locationId: value.id,
                        locationType: value.type,
                        param: "id " + value.id + " name " + value.name + " type " + value.type
                    }
                }));
            });
        },
        select: function (event, ui) {
            $("#location_id_input").val(ui.item.locationId);
            $("#location_type_input").val(ui.item.locationType);
            selectedLocation = ui.item.param;
        }
    });
}

function searchHotels() {
    var hotel = {hotel: $("#dropdown").val()};
    $.ajax({
        type: "POST",
        data: {location: selectedLocation},
        url: '/ajaxSearchHotel',
        dataType: 'json',
        success: function (data) {
            $('#dropdown').find('option').remove().end();
            $('#dropdown')
                .append($("<option></option>")
                    .attr("value", 0)
                    .text("Выбрать отель"));
            $.each(data, function (i, obj) {
                $('#dropdown').append($('<option>', {
                    value: obj.id,
                    text: obj.name,
                    hotelId: obj.id
                }));
            });
            /* $('#dropdown').removeClass("form-control hidden");
             $('#dropdown').addClass("form-control ");
             $('#labelhotel').removeClass("hidden");*/
        }
    });
}

function getRoomInfo(id) {
    $.get("/hotel/details", {hotelId: id}, function (data) {
        return response($.map(data, function (value, key) {
            return {
                label: value.name,
                value: "id " + value.id
            }
        }));
    });
}

function selectHotel() {
    var selected = $("#dropdown option:selected").text();
    var selectedID = $("#dropdown option:selected");
    $("#hotel_input_id").val(selectedID.val());
    $("#hotel_name_input").val(selected);
}


function searchFacilities() {
    var popup = document.getElementById("myPopup");
    popup.classList.toggle("show");
    $('#myPopup').find('li').remove().end();
    console.log($("#hotelId").text());
    $.ajax({
        type: "POST",
        data: {hotel: $("#hotelId").text()},
        url: '/ajaxShowFacilities',
        dataType: 'json',
        success: function (data) {
            $.each(data, function (i, obj) {
                console.log(obj);
                $('#myPopup').append('<li>' + obj + '</li>');
            });
        }
    });
}

function expand_collapse(id) {
    var e = document.getElementById(id);
    var f = document.getElementById(id+"_arrows");
    if(e.style.display == 'none'){
        e.style.display = 'block';
        f.innerHTML = '↑';
    }
    else {
        e.style.display = 'none';
        f.innerHTML = '↓';
    }
}