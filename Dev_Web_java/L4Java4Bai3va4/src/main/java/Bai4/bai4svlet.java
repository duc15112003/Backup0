package Bai4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class bai4svlet
 */
@WebServlet("/bai4svlet")
public class bai4svlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai4svlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Product> items = new ArrayList<Product>();
			
		Product it	= new Product("Nokia 2020", "nokia.png", 500, 0.1);
		Product it0	= new Product("Samsung Xyz", "samsung.png", 700, 0.15);
		Product it1	= new Product("iPhone Xy", "iphone.png", 900, 0.25);
		Product it2	= new Product("Sony Erricson", "sony.png", 55, 0.3);
		Product it3	= new Product("Seamen", "seamen.png", 70, 0.5);
		Product it4	= new Product("Oppo 2021", "oppo.png", 200, 0.2);
		
		items.add(it);
		items.add(it1);
		items.add(it2);
		items.add(it3);
		items.add(it4);
		
			
		request.setAttribute("items", items);
		request.getRequestDispatcher("view/bai4/sanpham.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
