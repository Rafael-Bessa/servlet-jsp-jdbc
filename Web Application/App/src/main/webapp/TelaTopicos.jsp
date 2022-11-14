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
<title>Tela do forum</title>

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


body h2{
text-align: center;
}


.ranking{
text-align: left;
margin-left: 5px;

}

.insere{
text-align: left;
margin-left: 120px;
margin-top: -21.5px;
}

.logout{
margin-left: 1300px;
margin-top: -17px;
}

.link{
text-align: center;
}

.titulo{
text-align: center;
}

.autor{
text-align: center;
}


</style>


</head>
<body>

	<div class="forum"> 
	
	<h1> Seja bem vindo,  ${Usuario.nome} </h1>
	<br>
	
	<div class="ranking">
		<form action="servletController" method="get">
			<input type="hidden" name="acao" value="ranking"/>	
			<button type="submit" class="btn btn-primary btn-block btn-large">Ver o ranking</button>
		</form>
	</div>
	

	<div class="insere">
		<form action="servletController" method="get">
			<input type="hidden" name="acao" value="inserirtopico"/>	
			<button type="submit" class="btn btn-primary btn-block btn-large">Inserir novo tópico</button>
		</form>
	</div>
	
	<div class="logout">
		<form action="servletController" method="get">
			<input type="hidden" name="acao" value="logout"/>	
			<button type="submit" class="btn btn-primary btn-block btn-large">Sair</button>
		</form>
	</div>

	<hr>

	<h2>Tabela de Topicos</h2>
	<br>
	
	<table>
	  <tr>
	    <th class="autor">Autor (Login)</th>
	    <th class="titulo">Titulo</th>
	    <th class="link">Link para o Topico</th>
	  </tr>
	  

	  
		<%
		
		TopicoDAO td = new TopicoDAO();
		ArrayList<Topico> listagem = td.topicosCriados();
		
		for(Topico t : listagem) {
		%>
			
			
		<tr>
			<td class="autor"><%out.print(t.getLogin()); %></td>
			<td class="titulo"><%out.print(t.getTitulo());%></td>	
			<td class="link"><a href="servletController?acao=exibeTopico&i=<%out.print(t.getId());%>"> Ler Topico </a></td>
		</tr>	
			
		<%
		}
		
		%>

			
	</table>


	</div>


</body>
</html>