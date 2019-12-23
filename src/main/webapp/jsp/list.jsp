<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 引入form表单标签库 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%-- <!-- 引入jQuery -->
<script type="text/javascript"
	src="<%=path%>/static/js/jquery-1.12.4.min.js"></script>
<!-- 引入样式 -->
<link
	href="<%=path%>/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="<%=path%>/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	 --%>

 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<form action="<%=path%>/list.do" method="post">
	<input type="hidden" name="pageNum">
</form>
<body>
	<table>
  <tr>
    <th>编号</th>
    <th>车牌号</th>
    <th>车辆类型</th>
    <th>经度</th>
    <th>纬度</th>
    <th>违法时间</th>
    <th>违法人</th>
    <th>手机号</th>
    <th>违法原因</th>
    <th>单双号</th>
    <th>违法地点</th>
  </tr>
  <c:forEach items="${page.list }" var="s">
  <tr>
    <td>${s.id }</td>
    <td>${s.carnum }</td>
    <td><c:if test="${s.lx eq'A' }">A类摩托车</c:if>
    <c:if test="${s.lx eq'C' }">小汽车</c:if>
    <c:if test="${s.lx eq'B' }">B类摩托车</c:if>
    </td>
    <td>${s.j }</td>
    <td>${s.w }</td>
    <td>${s.sj }</td>
    <td>${s.name }</td>
    <td>${s.phone }</td>
    <td>${s.yy }</td>
    <td>${s.num }</td>
    <td>${s.address }</td>
  </tr>
  </c:forEach>
  <tr>
  	<td colspan="20" >
  		<input type="button" value="首页" onclick="fy(1)" name="c" >
  		<input type="button" value="上一页	" onclick="fy(${page.pageNum==1?1:page.pageNum-1})" name="c" >
  		<input type="button" value="下一页" onclick="fy(${page.pageNum==page.lastPage?page.lastPage:page.pageNum+1})" name="c">
  		<input type="button" value="尾页" onclick="fy(${page.lastPage})" name="c">
  	</td>
  </tr>
</table>

</body>
<script type="text/javascript">
function fy(p) {
	$("[name=pageNum]").val(p)
	$("form").submit()
}
</script>
</html>