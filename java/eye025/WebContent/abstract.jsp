<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel='stylesheet'  type='text/css' href='././css/bootstrap.css'>
	<title>简介</title>
	<style type="text/css">
	body{
	padding:50px;}
 .table1{
		margin-bottom:20px;
		}
	 .table1 tr{
	 margin-bottom:20px;
	 }
	</style>
</head>
<body style="width:100%">
	<h1>简介</h1>
	<%=request.getAttribute("msg")==null?"":request.getAttribute("msg")%>
	<form class="form-horizontal" action="publishAbs" method="post" enctype="multipart/form-data">
		<table border="0" class="table1">
			<tr style="margin-bottom:20px;">
				<td>
					<label class="control-label" style="margin-bottom:10px">轮播图一:</label>
					<input  type="file" name="picture1">
				</td>
				<td >
					<button type="button" class="btn btn-primary" onclick="location='abstractList'">简介列表</button>
				</td>
			</tr>
			<tr style="margin-bottom:20px;">
				<td>
					<label class="control-label" style="margin-bottom:10px">轮播图二:</label>
					<input type="file" name="picture2">
				</td>
			</tr>
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">轮播图三:</label>
					<input type="file" name="picture3">
				</td>
				
			</tr>
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">简介:</label>
					<textarea  class="form-control" rows="10" cols="100" name="content"></textarea>
				</td>
				
			</tr>
			<tr>
				<td>
					<label class="control-label" style="margin-bottom:10px">发布状态:</label>
					<input type="checkbox" name="publishStatus">是
				
				</td>
				
			</tr>
			<tr>
				<td>
					<input class="btn btn-defalt" type="reset" value="清空">
					<input class="btn btn-primary" type="submit" value="发布">
				</td>
				
			</tr>
		</table>
	</form>
</body>
</html>