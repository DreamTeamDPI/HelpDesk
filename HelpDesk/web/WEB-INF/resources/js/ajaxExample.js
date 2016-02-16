
function clickme() {
    var url = window.location.href + "/time";
    $.get(url, {name: "name"}, function (resp) {
        alert(resp);
       // var obj = JSON.parse(resp);
        //alert("data   " + obj.firstName);
    }).done(function () {
        alert("second success");
    })
            .fail(function () {
                alert(window.location.href + "/time");
            })
            .always(function () {
                alert("finished");
            });
}
