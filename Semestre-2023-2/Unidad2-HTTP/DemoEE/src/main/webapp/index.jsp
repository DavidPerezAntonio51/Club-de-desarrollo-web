<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form method="post" action="hello-servlet">
    <input type="text" name="Nombre">
    <input type="submit" value="Saludar" formaction="/DemoEE_war_exploded/hello-servlet">
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>