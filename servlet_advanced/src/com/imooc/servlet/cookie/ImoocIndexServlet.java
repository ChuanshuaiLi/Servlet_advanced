package com.imooc.servlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImoocIndexServlet
 */
@WebServlet("/cookies/index")
public class ImoocIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImoocIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//һ�д��룬�㶨������Ӧ����
		response.setContentType("text/html;charset=GBK");
		//request.getCookies()�û���ȡ���е�Cookie
		Cookie[] cs = request.getCookies();
		if(cs == null) {
			response.getWriter().println("�û���δ��¼");
			return;
		}
		String user = null;
		for(Cookie c : cs) {
			System.out.println(c.getName() + ":" + c.getValue());
			if(c.getName().equals("user")) {
				user = c.getValue();
				break;
			}
		}
		
		if(user == null) {
			response.getWriter().println("�û���δ��¼");
		}else {
			response.getWriter().println("�û��Ѿ���¼");
			//���л��в���
			response.getWriter().println("</br>");
			response.getWriter().println("user:" + user);
		}
	}

}