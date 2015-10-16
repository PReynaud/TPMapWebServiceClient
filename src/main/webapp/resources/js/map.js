/**
 * Created by Pierre on 08/10/2015.
 */
var map;
var geocoder;

function initMap(country) {
    geocoder = new google.maps.Geocoder();

    map = new google.maps.Map(document.getElementById('map'), {
        zoom: 4,
        mapTypeId: google.maps.MapTypeId.HYBRID
    });

    var countryName = $(".countryName").val();

    geocoder.geocode( { 'address': countryName}, function(results, status) {
        if (status == google.maps.GeocoderStatus.OK) {
            map.setCenter(results[0].geometry.location);
            var marker = new google.maps.Marker({
                map: map,
                position: results[0].geometry.location
            });
        } else {
            alert("Geocode was not successful for the following reason: " + status);
        }
    });
};

