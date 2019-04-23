package com.imooc.servlet.charset;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CharsetServlet
 */
@WebServlet("/charset/process")
public class CharsetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharsetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//对于Tomcat8.x的版本，默认get请求发送中文就是UTF-8的格式，因此无需转换
		//但是对于response，还是要进行配置
		String ename = request.getParameter("ename");
		String address = request.getParameter("address");
		System.out.println(ename + ":" + address);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(ename + ":" + address);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//方法2:
		//request.setCharacterEncoding方法用于将请求体中的字符集转换为UTF-8
		//必须写在第一行，用于post中，在get是无效的
		request.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub
		String ename = request.getParameter("ename");
		String address = request.getParameter("address");
		System.out.println(ename + ":" + address);
		//方法1:
		//通过字符串输出来控制编码
		//new String(ename.getBytes("iso-8859-1") ,目标编码);
		//String utf8Ename = new String(ename.getBytes("iso-8859-1") , "utf-8");
		//String utf8Address = new String(address.getBytes("iso-8859-1") , "utf-8");
		//System.out.println(utf8Ename + ":" + utf8Address);
	}

}
