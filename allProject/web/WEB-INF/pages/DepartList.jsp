<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            
        	<table border="1">
	        	<th>id</th><th>Департамент</th><th>Edit</th><th>Delete</th>
			<c:forEach var="depart" items="${departList}" varStatus="status">
                            <tr>
                                <td>${depart.idDepartment}</td>
                                <td>${depart.name}</td>
                                <td>
                                    <a href="editdepart?id=${depart.idDepartment}">Edit</a>
                                </td>  
                                        
                                <td>
                                    <a href="deletedepart?id=${depart.idDepartment}">Delete</a>
				</td>        
                            </tr>
			</c:forEach>	        	
        	</table>
            <a href="newdepart">Add</a>
        </div>
    </body>
</html>
