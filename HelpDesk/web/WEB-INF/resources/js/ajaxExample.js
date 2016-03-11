
//Delete Row in UserList
var delId;
function clickme(id) {
    delId = id;
    console.log("groupId" + id);
    $('#myModal').modal('show');
}
function deleteRow(id) {
    var row = document.getElementById(id);
    row.parentNode.removeChild(row);
}
function delUser() {
    var url = "UserList/del";
    console.log("groupId" + delId + "  " + url);
    $.get(url, {id: delId}, function (resp) {
    }).done(function () {
            console.log("success" + delId);
            deleteRow(delId);
        })
        .fail(function () {
            console.log("fail" + delId);
        });

    $('#myModal').modal('hide');

}
///adUSer
function addUser() {
    $('#myModalBox').modal('hide');
    //var formData = $("#addForm").serializeObject();
    //setTimeout(5000);
    //var form = $("#addForm").serializeArray();
    var url = "UserList/add";
    //var form = JSON.stringify($("#addForm").serializeJSON());
    console.log();

    var form = $("#addForm").serialize();
//    var formData = JSON.stringify(jQuery('#addForm').serializeObject());
//    var formjs = JSON.stringify(form);
    //console.log(form.firstName);
    console.log(form);
    $.get(url, form, function () {
        })
        .done(function (resp) {
            console.log("success " + resp);
        })
        .fail(function () {
            console.log("fail");
        });
}


function edit(t)
{
    $('#myModalBox').modal('show');
    var url = "UserList/editId";
    console.log(t);
    $.get(url, {id: t}, function (resp) {

        })
        .done(function (resp) {
            console.log("success " + resp);
            $("#idUser").val(resp.idUser);
            $("#lastName").val(resp.lastName);
            $("#firstName").val(resp.firstName);
            $("#login").val(resp.roleidRole);

        })
        .fail(function (resp) {
            console.log(resp);
            console.log("fail");

        });



}

function sort() {
    var num = $("#numRole").val();
    var url = "UserList/sort";
    console.log(num);
    console.log(url);
    $.get(url, {i: num}, function (resp) {
        })
        .done(function (resp) {
            var $response = $(resp);


            var table = $response.filter('.simple-little-table');
            var list = $response.filter('.bot-navigation');
            var size = $response.filter("#secondStepInfoTab");

            console.log(size.text());

            $(".simple-little-table").remove();
            $(".bot-navigation").remove();
            $(".marh").append(table);
            $(".marh").append(list);

            $("#secondStepInfoTab").remove();
            var ul = $("#firstStepInfoTab");

            //  console.log(ul);
            ul.after(size);


        })
        .fail(function (resp) {
            console.log("fail");
        });
}