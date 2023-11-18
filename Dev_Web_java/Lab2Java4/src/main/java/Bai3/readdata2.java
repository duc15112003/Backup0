package Bai3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.tribes.util.Arrays;

/**
 * Servlet implementation class readdata2
 */
public class readdata2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readdata2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("view/Bai3/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		boolean married = (request.getParameter("married") != null);
		String country = request.getParameter("country");
		String[] hobbies = request.getParameterValues("hobbies");
		System.out.println(">>hobbies: " + Arrays.toString(hobbies));
		System.out.println(">>username: " + username);
		System.out.println(">>gender: " + gender);
		System.out.println(">>married: " + married);
		System.out.println(">>country: " + country);
		
		Map<String, String> hm 
        = new HashMap<String, String>(); 

    // Inserting pairs in above Map 
    // using put() method 
	    hm.put("R", "đọc sách"); 
	    hm.put("T", "du lịch"); 
	    hm.put("M", "âm nhạc"); 
	    hm.put("O", "khác");
		
		for(int i =0;i<hobbies.length;i++) {
			for (Map.Entry<String, String> me : hm.entrySet()) { 
				
				if(hobbies[i].equals(me.getKey())) {
	            // Printing keys 
	            System.out.println(me.getValue()); 
	        } 
			
		}
		request.getRequestDispatcher("view/Bai3/result.jsp").forward(request, response);
	}
	}

}
