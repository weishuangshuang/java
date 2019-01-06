<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		font-family: "微软雅黑";
	}
	h1{
			font-size: 34px;
		}
</style>
</head>
<body>

	<h1>专家介绍</h1>
	
	<form action="depart" method="post" enctype="multipart/form-data">
		
		<table>
			<tr>
				<td>
					科室名称: <input type="text" name="Name">
				</td>
			</tr>
			<tr>
				<td>
					科室图片：  <input type="file" name="picture">
				</td>
			</tr>
			<tr>
				<td>
					科室介绍： <textarea rows="10" cols="50" name="content"></textarea>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"/></td>
			</tr>
		</table>
	

	</form>

</body>
</html>