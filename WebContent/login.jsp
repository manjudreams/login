<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div align="center">
   <h3>Employee Login Form</h3>
     <form action="<%=request.getContextPath()%>/login" method="post">
       <table style="with:100">
         <tr>
         <td>username</td>
         <td><input type="text" name="username"></td>
         </tr>
         <tr>
         <td>password</td>
         <td><input type="password" name="password"></td>
         </tr>
       </table>
       <input type="submit" name="submit">
      </form>
  </div>
</body>
</html>