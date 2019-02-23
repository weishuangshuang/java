<%@ page language="java" contentType="text/html; charset=UTF-8" session="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style>
		*{
			padding: 0;
			margin: 0;
		}
		.main{
			width: 800px;
			height: 500px;
			margin: 10px auto;
			border: 1px solid;
		}
		.top{
			width: 100%;
			height: 400px;
			background: #40E0D0;
			display: flex;
			align-items: center;
			justify-content: center;
		}
		.lg{
			width: 410px;
			height: 210px;
			background: #03A89E;
		}
		.p1{
			margin-left: 7px;
			font-size: 26px;
			font-weight: bolder;
		}
		.hr{
			width: 400px;
			height: 1px;
			margin-left: 5px;
			margin-top: 5px;
			border: 1px dashed #6959CD;
		}
		.lg-l{
			display: flex;
			flex-direction: row;
			margin-left: 10px;
			margin-top: 10px;
		}
		.lg-l table input{
			margin-left: 10px;
		}
		.lg-l table{
			margin-left: 5px;
			color: #fff;
		}
		.btn{
			display: flex;
			justify-content: center;
		}
		.btn input{
			width: 40px;
			height: 25px;
		}
		.bottom{
			width: 100%;
			height: 100px;
			background: blue;
			color: #fff;
			text-align: center;
			line-height: 100px;
		}
	</style>
	
	<script>
		function login(f){
			return ture;
		}
	</script>
</head>
<body>
	<div class="main">
		<div class="top">
			<div class="lg">
				<p class="p1">用户登录</p>
				<div class="hr"></div>
				<div class="lg-l">
					<div><img src="img/logon.jpg" alt=""></div>
					<div>
						<form action="login" method="post" onsubmit="return login(this)">
							<table>
								<tr>
									<td>用户名</td>
									<td><input type="text" name="adminName" id="adminName"></td>
									<td></td>
								</tr>
								<tr>
									<td>密码</td>
									<td><input type="password" name="password" id="password"></td>
									<td>忘记密码？</td>
								</tr>
								<tr>
									<td>验证码</td>
									<td><input type="text" name="yz"></td>
									<td></td>
								</tr>
								<tr>
									<td><a href="reg_protocal.html"><input type="button" value="注册"></a></td>
									<td><input type="submit" value="登录"></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				
			</div>
		</div>


		<div class="bottom">版权所有........................</div>
	</div>
</body>
</html>