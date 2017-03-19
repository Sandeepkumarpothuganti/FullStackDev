package com.webui;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String action = request.getParameter("action") ;
		if(action.equalsIgnoreCase("Config")) {
			
			String config = "{App:'WebUI',Version:'1.1'}" ;
			response.setContentType("text/json");
			response.setContentLength(config.length());
			response.getWriter().println(config);
		}
	}

}
