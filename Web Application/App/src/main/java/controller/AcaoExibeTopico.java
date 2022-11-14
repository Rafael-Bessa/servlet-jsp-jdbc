package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Topico;
import model.TopicoDAO;



public class AcaoExibeTopico implements Acao{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("i");
		
		TopicoDAO td = new TopicoDAO();
		Topico top = td.recuperar(id);

		request.getSession().setAttribute("top", top);
		response.sendRedirect("TelaExibeTopico.jsp?i=" + id);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String i = request.getParameter("i");
//		Integer index = Integer.parseInt(i);
//		ArrayList<Forum> listaForum = (ArrayList<Forum>) request.getSession().getAttribute("lista");
//
//		Forum f = listaForum.get(index);
//		//System.out.println(f.getTitulo());
//		String nomeCriador = f.getUsuario().getNome();
//		String tituloCriador = f.getTitulo();
//		String corpoCriador = f.getCorpo();
//		
//		request.getSession().setAttribute("tituloCriador", tituloCriador);
//		request.getSession().setAttribute("nomeCriador", nomeCriador);
//		request.getSession().setAttribute("corpoCriador", corpoCriador);
//		
//		response.sendRedirect("TelaExibeTopico.jsp?i=" + index);
	}

}
