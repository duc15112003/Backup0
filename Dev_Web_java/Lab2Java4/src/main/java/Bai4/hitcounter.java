package Bai4;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/*"})
public class hitcounter implements Filter {
	int count =0;
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		count++;
		arg2.doFilter(arg0, arg1);
		System.out.println(count);
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException{
		count = 0;
	}

}
