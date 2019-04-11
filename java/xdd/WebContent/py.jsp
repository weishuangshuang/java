<%@ page language="java" contentType="text/html; charset=UTF-8" session="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style>
		table{
			margin: 10px auto;
			border: 1px solid #7EC0EE;
		}
		td{
			width: 550px;
			height: 10px;
			border: 1px solid #7EC0EE;
		}
		.a{
			width: 250px;
			height: 10px;
		}
		.btn{
			display: block;
			width: 60px;
			height: 25px;
			background: blue;
			margin: auto;
		}
	</style>
</head>
<body>
	<form action="py" method="post">
	<table>
		<tr>
			<td class="a">*博客名称</td>
			<td><input type="text" name="blogName"></td>
		</tr>
		<tr>
			<td class="a">昵称</td>
			<td><input type="text" name="nickName"></td>
		</tr>
		<tr>
			<td class="a">个人头像</td>
			<td><input type="file" name="photo"></td>
		</tr>
		<tr>
			<td class="a">描述</td>
			<td><textarea cols="20" rows="2" name="description"></textarea></td>
		</tr>
		<tr>
			<td class="a">公告</td>
			<td><textarea cols="20" rows="2" name="affiche"></textarea></td>
		</tr>
		<tr>
		<input type="submit" value="确认">
		</tr>
	</table>
	</form>
	
</body>
</html>