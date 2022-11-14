package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletController")
public class servletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametroAcao = request.getParameter("acao");

		if (parametroAcao.equals("login")) {
			AcaoLogin al = new AcaoLogin();
			al.executa(request, response);
		}
		

		if (parametroAcao.equals("cadastro")) {
			AcaoCadastro ac = new AcaoCadastro();
			ac.executa(request, response);
		}
		

		if (parametroAcao.equals("logout")) {
			AcaoLogout alo = new AcaoLogout();
			alo.executa(request, response);
		}
	
		if(parametroAcao.equals("inserirtopico")) {
			
			AcaoInserirTopico ait = new AcaoInserirTopico();
			ait.executa(request, response);
		}
		
		if(parametroAcao.equals("submeterTopico")) {
			
			AcaoSubmeterTopico ast = new AcaoSubmeterTopico();
			ast.executa(request, response);
		}
		
		if(parametroAcao.equals("exibeTopico")) {
			AcaoExibeTopico aet = new AcaoExibeTopico();
			aet.executa(request, response);
		}
		
		if(parametroAcao.equals("submeterComentario")) {
			AcaoSubmeterComentario ac = new AcaoSubmeterComentario();
			ac.executa(request, response);
		}
		
		if(parametroAcao.equals("ranking")) {
			AcaoRanking ar = new AcaoRanking();
			ar.executa(request, response);
		}
	

	}

}
