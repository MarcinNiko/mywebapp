<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="test/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
I love Java
<form action="add">
    <input type="text" name="t1"><br>
    <input type="text" name="t2"><br>
    <input type="submit">
</form>
Result is : <%= request.getAttribute("result") %><br>
Result is : ${result}
</body>
</html>