package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import model.UsuarioDAO;

public class AcaoLogin implements Acao {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String loginDigitado = request.getParameter("login");
		String senhaDigitada = request.getParameter("senha");

		
		String nomeUsuario = new UsuarioDAO().autentificacao(loginDigitado, senhaDigitada);
		
		if (!nomeUsuario.contains("html")) {

			Usuario usuario = new UsuarioDAO().recuperar(loginDigitado);
			
			HttpSession sessao = request.getSession(true);
			sessao.setAttribute("Usuario", usuario);

			response.sendRedirect("TelaTopicos.jsp");
			
			
		
		
		} else {
			response.sendRedirect(nomeUsuario);
		}

	}

}
