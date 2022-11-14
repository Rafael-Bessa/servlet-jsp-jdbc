package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import model.UsuarioDAO;

public class AcaoCadastro implements Acao{

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loginDigitado = request.getParameter("login");
		String senhaDigitada = request.getParameter("senha");
		String emailDigitado = request.getParameter("email");
		String nomeDigitado = request.getParameter("nome");

		UsuarioDAO ud = new UsuarioDAO();
		ud.inserir(new Usuario(loginDigitado, emailDigitado, nomeDigitado, senhaDigitada, 0));

		Usuario usuario = new UsuarioDAO().recuperar(loginDigitado);
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("Usuario", usuario);
		response.sendRedirect("TelaTopicos.jsp");
	
	}

}
