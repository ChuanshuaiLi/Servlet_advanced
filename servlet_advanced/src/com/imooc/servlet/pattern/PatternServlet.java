package com.imooc.servlet.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatternServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询员工的基本信息
		//获取当前访问的URL并将其转换为字符串
		String url = request.getRequestURL().toString();
		//将url输入到控制台
		System.out.println(url);
		//获取id，通过截取字符串方法
		String id = url.substring(url.lastIndexOf("/") + 1);
		//强制类型转换
		int eid =  Integer.parseInt(id);
		//设置字符集编码
		response.setContentType("text/html;charset=utf-8");
		//创建PrintWriter对象
		PrintWriter out = response.getWriter();
		out.println(id);
		if(eid == 1) {
			out.println("张三");
		}else if(eid == 2) {
			out.println("李四");
		}else {
			out.println("其他员工");
		}
		
	}
	
}
