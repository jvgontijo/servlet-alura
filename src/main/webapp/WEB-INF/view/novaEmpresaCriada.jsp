<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>

<%-- <%
	//scriplet
	String nomeEmpresa = (String)request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%> --%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	
	<c:import url="logout-parcial.jsp"/>
	
		<c:if test="${not empty empresa }">
			Empresa ${empresa} cadastrada com sucesso!
		</c:if>
		<c:if test="${empty empresa }">
			Nenhuma empresa cadastrada.
		</c:if>
	</body>
</html>