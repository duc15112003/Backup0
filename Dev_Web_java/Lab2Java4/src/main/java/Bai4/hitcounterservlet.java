package Bai4;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Servlet implementation class hitcounterservlet
 */
public class hitcounterservlet extends HttpServlet {
	int count = 0;
	Path path = Paths.get("C:\\Users\\DUC\\Desktop\\test.txt");
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hitcounterservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (Exception e) {
			System.err.println("không thể loadding");
		}
		
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		doGet(arg0, arg1);
		System.out.println(arg0.getMethod());
		System.out.println(count);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("count", count);
		req.getRequestDispatcher("view/Bai4/demso.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			Files.write(path, String.valueOf(count).getBytes(),StandardOpenOption.WRITE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
