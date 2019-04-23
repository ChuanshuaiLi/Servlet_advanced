package com.imooc.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionIndexServlet
 */
@WebServlet("/session/index")
public class SessionIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		//��ȡsession����
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		System.out.println("sessionId:"+sessionId);
		String name = (String)session.getAttribute("name");
		
		response.getWriter().println("������ҳ����ǰ�û�Ϊ:" + name);
	}

}
