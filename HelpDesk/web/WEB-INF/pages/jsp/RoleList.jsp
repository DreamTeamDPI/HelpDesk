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
	        	<th>id</th>
                        <th>Название</th>
                        
                        
			<c:forEach var="role" items="${roleList}" varStatus="status">
                            <tr>
                                <td>${role.idRole}</td>
                                <td>${role.nameRole}</td>
                                
                                   
                            </tr>
			</c:forEach>	        	
        	</table>
           
        </div>
    </body>
</html>
