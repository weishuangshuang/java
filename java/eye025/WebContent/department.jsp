<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet'  type='text/css' href='././css/bootstrap.css'>
<title>Insert title here</title>

<style>
	body{
		font-family: "微软雅黑";
		margin:50px;
	}
	h1{
			font-size: 30px;
		}
		.table1{
		margin-bottom:20px;
		}
	
</style>
</head>
<body>

	<h1>科室介绍</h1>

	<form class="form-horizontal" action="depart" method="post" enctype="multipart/form-data">
		
		<table class="table1">
			<tr>
				<td >
					<label class="control-label" style="margin-bottom:10px">科室名称:</label>
					 <input class="form-control" type="text" name="Name">
				</td>
				<td>
					<button class="btn btn-primary" type="button" onclick="location='departmentList'">简介列表</button>
				</td>
			</tr>
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">科室图片:</label>
					<input  type="file" name="picture">
				</td>
			</tr>
			<tr>
				<td>
				<label class="control-label" style="margin-bottom:10px">科室介绍:</label>
				<textarea class="form-control" rows="10" cols="50" name="content"></textarea>
				</td>
			</tr>
			<tr >
				<td><input style="margin-top:40px" class="btn btn-primary" type="submit" value="提交"/></td>
			</tr>
		</table>
	

	</form>

</body>
</html>