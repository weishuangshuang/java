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
		li{
			list-style: none;
		}
		.main{
			width: 800px;
			height: 400px;
			margin: 100px auto;
			box-shadow: 5px 5px 5px blue;
		}
		hr{
			margin-top: 8px;
			margin-bottom: 8px;
		}
		.information{
			width: 800px;
			height: 310px;
			border: 1px solid blue;
		}
		.p1{
			width: 100%;
			height: 35px;
			background: #436EEE;
			color: #fff;
			line-height: 35px;
			font-size: 14px;
			font-weight: bolder;
		}
		table{
			width: 100%;
		}
		.p2{
			width: 120px;
			height: 30px;
			text-align: right;
			
		}
		.p3{
			margin-top: 6px;
			margin-bottom: 7px;
		}
		td{
			border-top: 1px dashed #6495ED;
			border-right: 1px dashed #6495ED;
			font-size: 14px;
		}


		.btn{
			margin-left: 350px;
		}
	</style>
</head>
<body>
	<div class="main">
		<p>当前位置：页面 > 个人注册协议</p>
		<hr>
		<div class="information">
			<p class="p1">用户基本信息（*为必填信息）</p>
			<form action="reginfo" method="post" onsubmit="return reginfo(this)">
				<table>
					<tr>
						<td class="p2">*用户名</td>
						<td>
							<p class="p3">以字母开头，字母与数字或者下划线的组合（3-20位）</p>
							<input type="text" name="adminName">
						</td>
					</tr>
					<tr>
						<td class="p2">*密码</td>
						<td>
							<p class="p3">字母与数字或者下划线的组合（6-12位）</p>
							<input type="password" name="password">
						</td>
					</tr>
					<tr>
						<td class="p2">*确认密码</td>
						<td>
							<input type="password" name="password1">
						</td>
					</tr>
					<tr>
						<td class="p2">电子邮箱</td>
						<td>
							<input type="text">
						</td>
					</tr>
					<tr>
						<td class="p2">*密码找回问题</td>
						<td>
							<input type="text" name="pwdproblem">
						</td>
					</tr>
					<tr>
						<td class="p2">*密码找回答案</td>
						<td>
							<input type="text" name="pwdanswer">
						</td>
					</tr>
					<tr>
						<td class="p2">*验证码</td>
						<td>
							<input type="text">
						</td>
					</tr>
					<tr>
						<td><a href="reg_protocal.html"><input type="button" value="上一步" class="btn"></a></td>
						<td><input type="submit" value="下一步"></td>
					</tr>
				</table>
			</form>
		</div>

		
		
	</div>
</body>>
</html>