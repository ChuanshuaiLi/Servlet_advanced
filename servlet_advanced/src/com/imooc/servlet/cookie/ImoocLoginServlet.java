package com.imooc.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImoocLoginServlet
 */
@WebServlet("/cookies/login")
public class ImoocLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImoocLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//一行代码，搞定所有响应乱码
		response.setContentType("text/html;charset=GBK");
		System.out.println("用户登录成功");
		//Cookie(cookie名字 , cookie值);
		Cookie cookie = new Cookie("user" , "lcs");
		//设置cookie有效期 60秒*60*24*7 设置一周有效期
		cookie.setMaxAge(60 * 60 * 24 * 7);
		//在客户端创建cookie
		response.addCookie(cookie);
		response.getWriter().println("登录已经成功");
	}

}
