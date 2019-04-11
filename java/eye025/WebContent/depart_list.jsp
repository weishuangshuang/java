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
    			<th>科室名称</th>
    			<th>科室封面</th>
    			<th>科室介绍</th>
    		</tr>
 		</thead>
<%
	List<Department> depart = (List<Department>)request.getAttribute("depart");

	if(depart != null){
		for(int i=0; i<depart.size(); i++){
			Department a = depart.get(i);
%>
			<tr>
    		<td><%=a.getName() %></td>
    		<%if(a.getPictuer() != null){ %>
    		<td><img src=".<%=a.getPictuer()%>"></td>
    		<%} %>	
    		<td><%=a.getConten() %></td>	
    		</tr><br>
<% 
		}
	}
%>
</table>
</body>
</html>