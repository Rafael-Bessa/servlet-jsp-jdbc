package controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Topico;
import model.TopicoDAO;
import model.Usuario;
import model.UsuarioDAO;



public class AcaoSubmeterTopico implements Acao{
	
	public static ArrayList<Topico> lista = new ArrayList<>();

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String titulo = request.getParameter("titulo");
		String corpo = request.getParameter("corpo");
		Usuario u = (Usuario) request.getSession().getAttribute("Usuario");
		String login = u.getLogin();
		
		UsuarioDAO ud = new UsuarioDAO();
		ud.adicionarPontos(login, 10);
		
		TopicoDAO td = new TopicoDAO();
		td.inserir(new Topico(titulo, corpo, login));
		//response.sendRedirect("servletController?acao=colocarTopicoNaPagina");
		response.sendRedirect("TelaTopicos.jsp");
		

//		Usuario usuario = new UsuarioDAO().recuperar(loginDigitado);
//		
//		HttpSession sessao = request.getSession();
//		sessao.setAttribute("Usuario", usuario);
//		response.sendRedirect("TelaTopicos.jsp");
//		
		
		
		
		
		
		
		
	
//		String titulo = request.getParameter("titulo");
//		String corpo = request.getParameter("corpo");
//		
//		Topico forum = new Topico(titulo, corpo, (Usuario) request.getSession().getAttribute("Usuario"));
//		
//		lista.add(forum);
//		
//		request.getSession().setAttribute("lista", lista);
//		request.getSession().setAttribute("tamanholista", lista.size());
//		
//
//		response.sendRedirect("TelaTopicos.jsp");

	}

}
