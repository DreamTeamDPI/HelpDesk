//Delete Row in UserList
var delId;
function clickme(id) {
    delId = id;
    console.log("groupId" + id);
    $('#myModal').modal('show');
}
function clickme2(id) {
    delId = id;
    console.log("groupId" + id);
    $('#myModal_Add').modal('show');
}
function deleteRow(id){	
	var row = document.getElementById(id);
	row.parentNode.removeChild(row);
}
function delUser(){
    var url = "UserList/del";
    console.log("groupId" + delId + "  " + url);  
    $.get(url, {id: delId}, function (resp) {
    }).done(function () {
        console.log("secces" + delId);  
    })
    .fail(function () {
        console.log("fail" + delId);  
    });
$('#myModal').modal('hide');
deleteRow(delId);
}
