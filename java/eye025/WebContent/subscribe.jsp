<%@page import="com.thzm.eye025.service.SubscribeService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.List, com.thzm.eye025.bean.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel='stylesheet'  type='text/css' href='././css/bootstrap.css'>
	<style>
	body{
		font-family: "微软雅黑";
		}
		h1{
			font-size: 34px;
			margin-left: 200px;
		}
		div{
			width: 500px;
			height: 500px;
			text-align: right;
		}
		
	</style>
</head>
<body>
	 <table class='table table-striped table-hover'>
    	<thead>
    		<tr>
    			<th>姓名</th>
    			<th>联系电话</th>
    			<th>电子邮件</th>
    			<th>性别</th>
    			<th>年龄</th>
    			<th>预约日期</th>
    			<th>病情简介</th>
    			<th>预约项目</th>
    		</tr>
    	</thead>
	<%
	request.setAttribute("subs", SubscribeService.listAll());
	
	List<Subscribe> subs = (List<Subscribe>)request.getAttribute("subs");

	if(subs != null){
		for(int i=0; i<subs.size(); i++){
			Subscribe a = subs.get(i);
%>
			<tr>
    		<td><%=a.getName() %></td>
    		<td><%=a.getConnect() %></td>	
    		<td><%=a.getEmail() %></td>
    		<td><%=a.getGender() %></td>
    		<td><%=a.getItem() %></td>
    		<td><%=a.getDate() %></td>
    		<td><%=a.getDescription() %></td>
    		<td><%=a.getProject() %></td>
   
    		</tr><br>
<% 
		}
	}
%>
</table>
</body>
</html>