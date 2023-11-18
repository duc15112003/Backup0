package Bai3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.io.File;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

/**
 * Servlet implementation class TTNV
 */

@WebServlet("/ttnc")
@MultipartConfig
public class TTNV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TTNV() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Views/Bai3/bai3.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String hobbies[] = request.getParameterValues("hobbies");
			DateTimeConverter dtc = new DateConverter(new Date());
			dtc.setPattern("dd/MM/yyyy"); 
			ConvertUtils.register(dtc, Date.class);
			Staff1 staff = new Staff1();
			File dir = new File(request.getServletContext().getRealPath("/files"));
			if (!dir.exists()) {
				dir.mkdirs();
			}
			Part photo = request.getPart("photo_file");
			File photoFile = new File(dir, photo.getSubmittedFileName());
			photo.write(photoFile.getAbsolutePath());
			staff.setPhoto(photoFile.getName());

			BeanUtils.populate(staff, request.getParameterMap());
			String st = new SimpleDateFormat("dd/MM/YYYY").format(staff.getBirthday());
			String hobby = staff.isHobby(hobbies);
			staff.setHobbies(hobby);
			System.out.println(hobby);
			request.setAttribute("bean", staff);
			request.setAttribute("date",st);
			} catch (Exception e) {
			e.printStackTrace();
			}
		request.getRequestDispatcher("/Views/Bai3/result.jsp").forward(request, response);
	}

}
