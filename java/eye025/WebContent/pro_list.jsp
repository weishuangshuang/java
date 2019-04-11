
<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.List, com.thzm.eye025.bean.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet'  type='text/css' href='././css/bootstrap.css'>
</head>
<body>
<table class='table table-striped table-hover'>
    	<thead>
    		<tr>
    			<th>姓名</th>
    			<th>专家照片</th>
    			<th>专家简介</th>
    			<th>ID</th>
    		</tr>
 		</thead>
 		
 		<%
	List<Professor> pro = (List<Professor>)request.getAttribute("pro");

	if(pro != null){
		for(int i=0; i<pro.size(); i++){
			Professor a = pro.get(i);
%>
			<tr>
    		<td><%=a.getName() %></td>
    		<%if(a.getPhtot() != null){ %>
    		<td><img src=".<%=a.getPhtot()%>"></td>
    		<%} %>	
    		<td><%=a.getSummary() %></td>
    		<td><%=a.getId() %></td>	
    		</tr><br>
<% 
		}
	}
%>
    	
    	</table>

</body>
</html>