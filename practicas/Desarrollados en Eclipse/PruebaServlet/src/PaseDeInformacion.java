

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaseDeInformacion
 */
@WebServlet("/PaseDeInformacion")
public class PaseDeInformacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PaseDeInformacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre1=request.getParameter("nombre1");
        String pais1=request.getParameter("pais1");
        
        String nombre2=request.getParameter("nombre2");
        String pais2=request.getParameter("pais2");
        
        String nombre3=request.getParameter("nombre3");
        String pais3=request.getParameter("pais3");
		
        request.setAttribute("nombre1", nombre1);
        request.setAttribute("nombre2", nombre2);
        request.setAttribute("nombre3", nombre3);
        
        request.setAttribute("pais1",pais1);
        request.setAttribute("pais2",pais2);
        request.setAttribute("pais3",pais3);
        
        request.getRequestDispatcher("Form1.jsp").forward(request, response);
		
		try (PrintWriter out = response.getWriter()) {
            
            
		       
	        response.setContentType("text/html;charset=UTF-8");
	            
	            
	            //TODO output your page here. You may use following sample code. 
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet PaseDeInformacion</title>");            
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<h1>Nombre1: " + nombre1 + "</h1>");
	            out.println("<h1>Pais1: " + pais1 + "</h1>");
	            out.println("<h1>Nombre2: " + nombre2 + "</h1>");
	            out.println("<h1>Pais2: " + pais2 + "</h1>");
	            out.println("<h1>Nombre3: " + nombre3 + "</h1>");
	            out.println("<h1>Pais3: " + pais3 + "</h1>");
	            out.println("</body>");
	            out.println("</html>");
	        
	        }
		
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
