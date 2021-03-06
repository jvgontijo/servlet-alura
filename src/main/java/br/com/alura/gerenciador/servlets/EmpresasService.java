package br.com.alura.gerenciador.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Empresa> empresas = new Banco().getEmpresas();
		
//		//importado da lib gson 
//		Gson gson = new Gson();
//		String json = gson.toJson(empresas);
//	
//		//response.setContentType("text/html"); devolve html
		//exporta JSON
//		response.setContentType("application/json");
//		response.getWriter().print(json);
	
		
		//importando da lib xstream
		XStream xstream = new XStream();
		xstream.alias("empresa", Empresa.class);
		String xml = xstream.toXML(empresas);
		
		//exporta XML
		response.setContentType("application/xml");
		response.getWriter().print(xml);
				
		
	}

}
