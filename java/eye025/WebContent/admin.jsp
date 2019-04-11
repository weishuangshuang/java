<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.thzm.eye025.bean.*, java.util.List"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet'  type='text/css' href='././css/bootstrap.css'>
<link rel='stylesheet'  type='text/css' href='././css/NewFile.css'>
<title>首页</title>
<style>
		body{
		margin:0;
		padding:0
		}
	.header{
		height: : 100px;
		color: white;
		font-weight: bolder;
		text-align: center;
		font-size: 40px;
		line-height: 100px;
		background: #02a2aa;
	}
	.center{
		height: 500px;
		display: flex;
		flex-direction: row;
	}
	.footer{
		height: 40px;
		line-height: 40px;
		background: black;
		color: white;
		text-align: center;
	}
	.sidebar{
		background: #fff;
		width: 200px;
		border-right:1px solid #eee
	}
	.sidebar ul{
		list-style-type:none
	}
	.sidebar ul li{
		line-height:50px;
		padding-left:50rpx;
	}
	.sidebar ul li a{
		text-decoration:none;
		color:#333
	}
	.content{
		width: 100%;
	}
</style>
</head>
<body>

<div>
	
	<div class="header">
		EYE眼科医院网站信息管理系统 
	</div>
	<div style="background:black; color:white;">
<%
	Sysadmin user = (Sysadmin)session.getAttribute("userInfo");
		if(user != null){
	 		 out.print("你好:" + user.getName());
		  
%>
       <button  type="button" onclick="location='./logout'">退出</button>
       <div style="float:right;">
       当前在线人数:
       <%
       List<Sysadmin> list  = (List<Sysadmin>)application.getAttribute("adminList");	
       for(int i=0; i<list.size(); i++){
    	   Sysadmin u = list.get(i);
    	   out.print(u.getName()+ "&nbsp;");
       }
       %>
       </div>
	</div>
	<div class="center">
		<div class="sidebar">
			<ul>
				<li><a href="abstract.jsp" target="content">医院简介</a></li>
				<li><a href="department.jsp" target="content">科室管理</a></li>
				<li><a href="professor.jsp" target="content">专家管理</a></li>
				<li><a href="subscribe.jsp" target="content">预约介绍</a></li>
<%if(user.isSuperAdmin()){
%>  
	    	    <li><a href="sysadmin.html" target="content">管理员管理</a></li>
<%    	
	      }
      }
%>	
			</ul>
		</div>
		<iframe name="content" src="abstract.jsp" frameborder="0" class="content"></iframe>

	</div>
		
	<div class="footer">
		天汇智码
	</div>

</div>

</body>
</html>