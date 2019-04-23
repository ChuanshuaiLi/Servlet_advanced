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
		//��ѯԱ���Ļ�����Ϣ
		//��ȡ��ǰ���ʵ�URL������ת��Ϊ�ַ���
		String url = request.getRequestURL().toString();
		//��url���뵽����̨
		System.out.println(url);
		//��ȡid��ͨ����ȡ�ַ�������
		String id = url.substring(url.lastIndexOf("/") + 1);
		//ǿ������ת��
		int eid =  Integer.parseInt(id);
		//�����ַ�������
		response.setContentType("text/html;charset=utf-8");
		//����PrintWriter����
		PrintWriter out = response.getWriter();
		out.println(id);
		if(eid == 1) {
			out.println("����");
		}else if(eid == 2) {
			out.println("����");
		}else {
			out.println("����Ա��");
		}
		
	}
	
}