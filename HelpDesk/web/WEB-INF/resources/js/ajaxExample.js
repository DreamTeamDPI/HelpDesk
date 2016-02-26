
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
    })
            .fail(function () {
                console.log("fail" + delId);
            });

    $('#myModal').modal('hide');
    deleteRow(delId);
}
////
$.fn.serializeObject = function()
{
   var o = {};
   var a = this.serializeArray();
   $.each(a, function() {
       if (o[this.name]) {
           if (!o[this.name].push) {
               o[this.name] = [o[this.name]];
           }
           o[this.name].push(this.value || '');
       } else {
           o[this.name] = this.value || '';
       }
   });
   return o;
};
///adUSer
function addUser() {
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
        console.log("success " + resp.idUser);
    })
    .fail(function () {
        console.log("fail");
    });
}
function get_params(form)
{
//    for (var i = 0; i < form.elements.length; i++)
//    {
//        alert(form.elements[i].value);
//    }
}
