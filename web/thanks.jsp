

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Murach's Java Servlets and JSP</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css">
    </head>
    <body>
        <h1>Thanks for joining our email list</h1>
        <p>Here is the information that you entered:</p>
        
        <%-- <label>Email:</label>
        <span>${user.firstName}</span>
        <label>First Name:</label>
        <span>${user.lastName}</span>
        <label>Last Name:</label>
        <span>${user.email}</span> --%>
        
        <jsp:useBean id="user" scope="request" class="murach.business.User"/>
        <label>Email: </label>
        <span><jsp:getProperty name="user" property="email"/></span><br>
        
        <label>First Name:</label>
        <span><jsp:getProperty name="user" property="firstName"/></span><br>
        
        <label>Last Name:</label>
        <span><jsp:getProperty name="user" property="lastName"/></span><br>
        
        
        <p>To Enter Another Email Address, Click on the Back button in your browser or the Return button shown below.</p>
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
