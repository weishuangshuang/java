<%@ page language="java" contentType="text/html; charset=UTF-8"
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
		margin:50px;
	}
		h1{
			font-size: 30px;
		}
		
	</style>
</head>
<body>
	<h1>专家介绍</h1>

	<form  class="form-horizontal" action="pro" method="post" enctype="multipart/form-data">
		<table class="table1">
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">专家姓名：</label>
					<input class="form-control" type="text" name="Name">
				</td>
				<td>
					<button class="btn btn-primary" type="button" onclick="location='professorList'">简介列表</button>
				</td>
			</tr>
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">专家照片：</label>
					<input type="file" name="picture">
				</td>
			</tr>
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">专家介绍：</label>
					<textarea class="form-control" rows="10" cols="50" name="content"></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">专家ID：</label>
					<input class="form-control" type="text" name="id">
				</td>
			</tr>
			<tr>
				<td><input style="margin-top:40px" class="btn btn-primary" type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>

</body>
</html>