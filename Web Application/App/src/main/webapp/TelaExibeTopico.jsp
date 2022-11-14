<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="model.*" %>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Topico</title>

<style>

body h1{
text-align: center;
color: navy;
}

body h2{
text-align: left;

}

body h3{
margin-top: 50px;
color: red;

}

.voltar {
margin-left: 1350px;

}


</style>


</head>
<body>



<h1> Criador: ${top.login} </h1>
<a class="voltar" href="TelaTopicos.jsp"> Voltar </a>
<hr>
<h2>Titulo: ${top.titulo}</h2>

<h3>Texto: ${top.corpo}</h3>

<hr>
<h4> Comentarios: </h4>
<br>

	 <% 	
			 
		ComentarioDAO cd = new ComentarioDAO();
		String id = request.getParameter("i");
		ArrayList<Comentario> listagem = cd.ComentariosCriados(id);
			 
		 for(Comentario c : listagem) {
		  	  		 	  		 
		  	  		 	  		 
	 %>
			  
		<p><%out.print(c.getLogin());%> : <%out.print(c.getComentario()) ;%> </p>
		<hr>
			
	<%
				
	}
	
	%>	
		


<form action="servletController" method="get">
	<input type="hidden" name="acao" value="submeterComentario"/>
	<input type="hidden" name="i" value="${top.id}"/>
	<textarea name="comentario" rows="8" cols="80" required="required">Faça um comentario aqui. </textarea>
	<br>
	<button type="submit" class="btn btn-primary btn-block btn-large">Comentar</button>

</form>

</body>
</html>