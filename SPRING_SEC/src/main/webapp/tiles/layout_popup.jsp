<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><tiles:getAsString name="title" /></title>
</head>
<body>
팝업레이아웃~~~<br>
<table border=0 cellpadding=0 cellspacing=1 width="100%">
	<tr>
		<td>
			<tiles:insertAttribute name="body"/>
		</td>
	</tr>
</table>
</body>
</html>



