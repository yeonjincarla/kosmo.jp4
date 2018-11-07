package com.kosmo.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthSuccessHandler implements AuthenticationSuccessHandler {
	
	/* security-context.xml  form-login 설정     */
	private String successURL; // /member/user_main	
	public void setMySetterSuccessURL(String successURL) {
		this.successURL = successURL;

	}
	@Override
	public void onAuthenticationSuccess(
			HttpServletRequest request,
			HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException 
	{
		System.out.println("AuthSuccessHandler 실행...." + successURL);
		
		HttpSession session = request.getSession();
		session.setAttribute("sess_username", authentication.getName());

		// log write
		// sms 처리 - 지난 관리자 로그인 등..
		response.setStatus(HttpServletResponse.SC_OK);
		response.sendRedirect(successURL);
	}

}
