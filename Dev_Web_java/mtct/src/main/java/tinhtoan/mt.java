package tinhtoan;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;




/**
 * Servlet implementation class mt
 */
@WebServlet({"/hello","/cong","/tru","/nhan","/chia"})
public class mt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String t1 = config.get("a", request);
		String t2 = config.get("b", request);
		request.setAttribute("s1", t1);
		request.setAttribute("s2", t2);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s = request.getRequestURI();
		String num1 = request.getParameter("a");
		String num2 = request.getParameter("b");
		double so1 = Double.parseDouble(num1);
		double so2 = Double.parseDouble(num2); 
		if(s.contains("cong")) {
			System.out.println(so1+so2);
			request.setAttribute("kq", so1+so2);
			config.add("a", num1, response);
			config.add("b", num2, response);
			
		}else if(s.contains("tru")) {
			System.out.println(so1-so2);
			request.setAttribute("kq", so1-so2);
			config.add("a", num1, response);
			config.add("b", num2, response);
		}else if(s.contains("nhan")) {
			System.out.println(so1*so2);
			request.setAttribute("kq", so1*so2);
			config.add("a", num1, response);
			config.add("b", num2, response);
		}else {
			System.out.println(so1/so2);
			request.setAttribute("kq", so1/so2);
			config.add("a", num1, response);
			config.add("b", num2, response);
		}
		doGet(request, response);

	}
	
	service

}
