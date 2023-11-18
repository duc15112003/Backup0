package Bai4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = CookieUtils.get("username", request);
		String password = CookieUtils.get("password", request);
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.getRequestDispatcher("/Views/Bai4/bai4.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String remember = request.getParameter("remember");
		System.out.println(remember);
		// kiểm tra tài khoản đăng nhập
		if(!username.equalsIgnoreCase("poly")) {
			request.setAttribute("message", "Sai tên đăng nhập!");
		}
		else if(password.length() < 6) {
			request.setAttribute("message", "Sai mật khẩu!");
		}else {
			request.setAttribute("message", "Đăng nhập thành công!");
		// ghi nhớ hoặc xóa tài khoản đã ghi nhớ bằng cookie
		int hours = (remember == null) ? 0 : 30*24; // 0 = xóa
		CookieUtils.add("username", username, hours, response);
		CookieUtils.add("password", password, hours, response);
		request.getRequestDispatcher("/Views/Bai4/bai4.jsp").forward(request, response);
	}
	}

}
