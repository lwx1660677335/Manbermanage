package com.contriller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.AuUser;
import com.service.AuUserService;
import com.service.AuUserServiceimpl;

@Controller
public class AuUserController {
	private  AuUserServiceimpl auUserServiceImpl;
	
	public void setAuUserServiceImpl(AuUserServiceimpl auUserServiceImpl) {
		this.auUserServiceImpl = auUserServiceImpl;
	}
	@Autowired
	private AuUserService auUserService;
	@RequestMapping(value="/login")
	public String selectall(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		List<AuUser> list=auUserService.selectall();
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		for (AuUser auUser : list) {
			System.out.println("Êä³öID"+auUser.getId());
		}
		return "index";
	}
}
