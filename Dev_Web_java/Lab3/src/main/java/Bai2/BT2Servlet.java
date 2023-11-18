package Bai2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

/**
 * Servlet implementation class BT2Servlet
 */

public class BT2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BT2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Views/BT2/bt2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DateConverter dtc = new DateConverter(new Date());
			dtc.setPattern("MM/dd/yyyy"); 
		ConvertUtils.register(dtc, Date.class);
			Staff staff = new Staff();
			BeanUtils.populate(staff, request.getParameterMap());
			request.setAttribute("bean", staff);
			System.out.println(staff.getBirthday());
			} catch (Exception e) {
			e.printStackTrace();
			}
		request.getRequestDispatcher("Views/BT2/result.jsp").forward(request, response);
	}

}
