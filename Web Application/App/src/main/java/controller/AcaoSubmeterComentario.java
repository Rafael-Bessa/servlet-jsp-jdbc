package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comentario;
import model.ComentarioDAO;
import model.Usuario;
import model.UsuarioDAO;

public class AcaoSubmeterComentario implements Acao{
	
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String comentario = request.getParameter("comentario");
			String id_topico = request.getParameter("i");
			Usuario u = (Usuario) request.getSession().getAttribute("Usuario");
			String login = u.getLogin();
			
			UsuarioDAO ud = new UsuarioDAO();
			ud.adicionarPontos(login, 3);

			ComentarioDAO cd = new ComentarioDAO();
			cd.inserir(new Comentario(comentario, login, id_topico));
			//response.sendRedirect("servletController?acao=colocarComentarioNaPagina&i=" + id_topico);
			response.sendRedirect("TelaExibeTopico.jsp?i=" + id_topico);
			

}
}
