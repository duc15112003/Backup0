package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class usemap
 */
public class usemap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usemap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("fullname");
		System.out.println(name);
		String []hobbies = request.getParameterValues("hobbie");
		System.out.println(hobbies);
		String []gt = request.getParameterValues("gender");
		System.out.println(gt[0]);
		Map<String, String> hm 
        = new HashMap<String, String>(); 
		Map<String, String> gender 
        = new HashMap<String, String>();
		
    // Inserting pairs in above Map 
    // using put() method 
	    hm.put("R", "readding"); 
	    hm.put("D", "playing"); 
	    hm.put("T", "go to sleep"); 
	    
	    gender.put("male", "đàn ông"); 
	    gender.put("female", "đàn bà"); 
	    gender.put("other", "khác"); 
		
	    String key = "";
		for(int i = 0;i<hobbies.length;i++) {
			for (Map.Entry<String, String> me : hm.entrySet()) {
				if(hobbies[i].equals(me.getKey())) {
	            // Printing keys
					key +=me.getValue()+", ";
	            System.out.println(me.getValue()); 
	        } 
			
		}
			System.out.println(key);
		}
			for (Map.Entry<String, String> me1 : gender.entrySet()) {
				if(gt[0]==me1.getKey()) {
	            // Printing keys 
	            System.out.println(me1.getValue()); 
	        } 
		}
	
		request.getRequestDispatcher("form.jsp").forward(request, response);
	}

}
