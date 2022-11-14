<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserir Topico</title>

<style>

.topico {

text-align: left;
margin-top: 40px;


}


.voltar{
margin-left: 500px;
}

</style>

</head>
<body>

	<h1>${Usuario.nome}, o que está pensando? </h1>

	<div class="topico">
		<form action="servletController" method="get">
			<input type="text" name="titulo" placeholder="Titulo" required="required">
			<br><br>
			<textarea name="corpo" rows="8" cols="80" required="required"> </textarea>
			<br>
			<button type="submit" class="btn btn-primary btn-block btn-large"> Enviar </button>
			<a class="voltar" href="TelaTopicos.jsp"> Voltar </a>
			<input type="hidden" name="acao" value="submeterTopico"/>	
		</form>
	</div>



</body>
</html>