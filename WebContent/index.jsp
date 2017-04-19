<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>丢累楼谋</title>
</head>
<%
	Date date = new Date(System.currentTimeMillis()) ;
	int a = 0;
%>
现在是北京时间<%=date %>111111
<table width="100%" border="5">
  <tr>
    <td>&nbsp;<%=date %>-<%=a++ %></td>
    <td>&nbsp;<%=date %>-<%=a++ %></td>
  </tr>
  <tr>
    <td>&nbsp;<%=date %>-<%=a++ %></td>
    <td>&nbsp;<%=date %>-<%=a++ %></td>
  </tr>
  <tr>
    <td>&nbsp;<%=date %>-<%=a++ %></td>
    <td>&nbsp;<%=date %>-<%=a++ %></td>
  </tr>
</table>

<body>
</body>
</html>
