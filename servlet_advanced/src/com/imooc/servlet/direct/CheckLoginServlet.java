package com.imooc.servlet.direct;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/direct/check")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("用户登录成功");
		//设置属性
		//request.setAttribute(属性名, 属性值);
		request.setAttribute("username", "lcs");
		
		//请求分发器，是HttpServletRequest里的方法
		//实现了请求转发的功能
		//request.getRequestDispatcher("/direct/index").forward(request, response);
		
		//响应重定向,是HttpServletResponse里的方法
		//响应重定向需要增加contextPath
		response.sendRedirect("/servlet_advanced/direct/index");
	}

}
