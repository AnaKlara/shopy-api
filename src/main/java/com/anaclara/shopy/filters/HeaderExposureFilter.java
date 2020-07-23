package com.anaclara.shopy.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;


// filtro responsável por expor o eader location para as requisições
@Component
public class HeaderExposureFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletResponse res = (HttpServletResponse) response;// casting
		res.addHeader("access-control-expose-headers", "location");
		chain.doFilter(request, response); // encaminha a resposta para retornar ao fluxo que ela estava
	}

	@Override
	public void destroy() {
	}
}