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
                        <th>Имя</th>
                        <th>Фамилия</th>
                        <th>Отчество</th>
                        <th>Пароль</th>
                        <th>Логин</th>
                        <th>Номер телефона</th>
                        <th>E-mail</th>
                        <th>Роль</th>
                        
			<c:forEach var="user" items="${departList}" varStatus="status">
                            <tr>
                                <td>${user.idUser}</td>
                                <td>${user.firstName}</td>
                                <td>${user.lastName}</td>
                                <td>${user.patronomic}</td>
                                <td>${user.password}</td>
                                <td>${user.login}</td>
                                <td>${user.numberPhone}</td>
                                <td>${user.email}</td>
                                <td>${user.roleidRole.nameRole}</td>
                                   
                            </tr>
			</c:forEach>	        	
        	</table>
           
        </div>
    </body>
</html>
