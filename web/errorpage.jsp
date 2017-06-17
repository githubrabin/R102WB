

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Type: ${pageContext.exception["class"]}</p>
        <p>Message: ${pageContext.exception.message}</p>
    </body>
</html>
