<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.*" %>
<%@ page import="java.util.List" %>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de Ranking</title>

<style>


table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

.forum h1 {
text-align: center;
color: #00008b;
}


.voltar {
margin-left: 1350px;

}


body h2 {
text-align: center;

}

</style>


</head>
<body>

	<div class="forum"> 
	
	<h1> Ranking </h1>
	<a class ="voltar" href="TelaTopicos.jsp"> <b> Voltar </b></a>

	<hr>

	<h2>Tabela de Pontos</h2>
	<br>
	
	<table>
	  <tr>
	    <th>Nome</th>
	    <th>Login</th>
	    <th>Pontos</th>
	  </tr>
	  
	  <%
		UsuarioDAO ud = new UsuarioDAO();
		List<Usuario> lista = ud.ranking();
		
		for(Usuario u : lista) {

	 %>

		<tr>
			<td><%out.print(u.getNome()); %></td>
			<td><%out.print(u.getLogin());%></td>	
			<td><%out.print(u.getPontos());%></td>
		</tr>	
			
		<%
		}
		
		%>

			
	</table>


	</div>


</body>
</html>