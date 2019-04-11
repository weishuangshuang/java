<%@ page language="java" contentType="text/html; charset=UTF-8" 
import="java.util.List, com.thzm.eye025.bean.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel='stylesheet'  type='text/css' href='././css/bootstrap.css'>
<title>简介列表</title>
<style>
body{
padding:0;
margin:0
}
	img{
		width:100px;
		height:100px;
	}
</style>
</head>
<body>
    <table class='table table-striped table-hover'>
    	<thead>
    		<tr>
    			<th>内容</th>
    			<th>图片</th>
    			<th>图片</th>
    			<th>图片</th>
    			<th style="width:120px">发布状态</th>
    			<th style="width:200px">操作</th>
    		</tr>
    	</thead>
<%
    List<Abstract> list = (List<Abstract>)request.getAttribute("list");
    if(null != list){
    	for(int i=0;i<list.size();i++){
    	    Abstract a = list.get(i);
%>    	
    	<tr class="tr">
    		<td><%=a.getContent() %></td>
    		<%if(a.getPicture1() != null){ %>
    		<td><img src=".<%=a.getPicture1()%>"></td>
    		<%} %>
    		
    		<%if(a.getPicture2() != null){ %>
    		<td ><img src=".<%=a.getPicture2()%>"></td>
    		<%} %>
    		
    		<%if(a.getPicture3() != null){ %>
    		<td><img src=".<%=a.getPicture3()%>"></td>
    		<%} %>
    		<td><%=a.isPublishStatus()?"是":"否"%></td>
    		<td>
    			<button class="btn btn-primary" onclick="location.href='fabu?absId=<%=a.getId()%>'">发布</button>
    			<button class="btn btn-default" onclick="location.href='delAbs?absId=<%=a.getId() %>'">删除</button>
    		</td>
    	</tr>
<%
       }
    }
%>    	
    </table>
</body>
</html>