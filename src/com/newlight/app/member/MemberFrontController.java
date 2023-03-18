package com.newlight.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("멤버 프론트 컨트롤러 실행!");
		
		String target = req.getRequestURI().substring(req.getContextPath().length());
		
		switch(target) {
		//join 페이지 고유 주소 넣어주기
		case "1" :
			//join.jsp 주소&컨트롤러 넣어주기
			req.getRequestDispatcher("").forward(req, resp);
			break;
			
		//join확인 완료 주소&컨트롤러 넣어주기
		case "2" :
			new JoinOkController().execute(req,resp);
			break;
		
		//아이디 체크 주소&컨트롤러 넣어주기
		case "3" :
			req.getRequestDispatcher("").forward(req, resp);
			break;
			
		//login 페이지 고유 주소&컨트롤러 넣어주기
		//login.jsp 주소 넣어주기
		case "4" :
			new LoginOkController().execute(req, resp);
			break;
			
		//login확인 완료 주소&컨트롤러 넣어주기
		case "5" :
			break;
			
		//로그아웃 주소&컨트롤러 넣어주기
		case "6" :
			break;
			
		//회원 정보 수정 주소&컨트롤러 넣어주기
		case "7" :
			break;
			
		//회원 정보 수정 Ok 주소&컨트롤러 넣어주기	
		case "8" :
			break;
			
		//회원 탈퇴 주소&컨트롤러 넣어주기
		case "9" :
			break;
		}
	}
	
}
