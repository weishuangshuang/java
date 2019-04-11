<%@ page language="java" contentType="text/html; charset=UTF-8" session="true"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel='stylesheet'  type='text/css' href='././css/bootstrap.css'>
	<title>EyE眼科</title>
</head>
<style>

	html,body{
		height: 100%;
		width: 100%;
		margin: 0;
		padding: 0;
		background: #02a2aa;
	}
	body{
		display: flex;
		flex-direction: row;
		justify-content: center;
		align-items: center;
		
	}

	.panel-box{
		width: 600px;
		margin:0 auto;
	}
	.box{
		background: #fff;
		border-raduis:10px;
	}
	table{
		width: 100%;
		font-size: 2em;
	
		
	}
	td:nth-child(1){
		text-align: right;
	}
	td{
	font-size:16px;
		padding-top: 10px;
	}
	.input{
		width: 300px;
		margin-top: 10px;
	}
	#btn{
		font-size: 0.8em;
		margin: 10px;
		padding: 10px;
		border-radius:5px; 
	}
	.title{
	color:#fff;
	texxt-align:center
	}
	.control-label{
	margin:10px 20px 0 0
	}
	.person{
	margin-top:20px;
	color:#fff;
	text-align:right
	}
</style>


<script>
function login(f){
	var ok = true;
	var adminName = f.adminName.value;
	var rege = /^[A-Za-z]{2,20}$/;
	var adminMsg = document.getElementById("adminMsg");
	adminMsg.innerText = "";
	var passwordMsg = document.getElementById("passwordMsg");
	passwordMsg.innerText = "";
	
	if(!rege.test(adminName)){
		ok = false;
		var adminMsg = document.getElementById("adminMsg");
		adminMsg.innerText = "登录名格式错误";
	}
	
	var pwd = f.password.value;
	var reg = /^[0-9a-zA-Z]{6,12}$/;
	if(!reg.test(pwd)){
		ok = false;
		var passwordMsg = document.getElementById("passwordMsg");
		passwordMsg.innerText = "密码格式错误";
	}
	
	return ok;
}

</script>

<body>

<div class="panel-box">
	<h1 class='title'>Eye眼科后台管理系统</h1>
	<div class='box'>
		
		<form action="login" method="post" onsubmit="return login(this)">
				<table>
					<tr>
						<td> <label class="control-label" >登录名</label> </td>
						<td><input class="input form-control" type="text" name="adminName" id="adminName"></td>
						<td id="adminMsg"></td>
					</tr>
					<tr>
						<td><label class="control-label" >密码名</label> </td>
						<td><input class="input form-control" type="password" name="password" id="password"></td>
						<td id="passwordMsg"></td>
					</tr>
					<tr>
						<td colspan='2'>十天免登录<input type="checkbox" name="autologin"/></td>
						<td >
						
		<%
			String msg = (String)request.getAttribute("msg");
			if(msg != null){
				out.print(msg);	//out是自带的一个输出方法
				}
		%>
							<input class="btn btn-primary" type="submit" value="登录" id="btn">
						</td>
						
					</tr>
				</table>
			</form>
</div>
<div class='person'>访问人数： <%=application.getAttribute("count") %></div>
	
</div>
	
</body>
</html>