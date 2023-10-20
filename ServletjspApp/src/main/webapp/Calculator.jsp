<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Hello I am a jsp page");
String myName="Shreya Ganguly";
%>
<div align="center">
    <h2>
        <form action="CalculatorServlet" method="post">
        It is developed by <%=myName%>
        <br/><br/>
        Enter First Operand:<input type="text" name="operand1" value=""/>
        <br/><br/>
        Enter Second Operand:<input type="text" name="operand2" value=""/>
        <br/><br/>
        Pick Math Operator:<input type="text" name="operator" list="operatorList"/>
        <datalist id="operatorList">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="x">x</option>
            <option value="/">/</option>
        </datalist>
    
        <br/><br/>
        <button type="submit">Submit</button>    
        <br/><br/>
        </form>
    </h2>
</div>
</body>
</html>