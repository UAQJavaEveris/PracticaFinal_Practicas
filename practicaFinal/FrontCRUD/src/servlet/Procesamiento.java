package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.CRUDStub;
/**
 * Servlet implementation class Procesamiento
 */
public class Procesamiento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
    public Procesamiento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String instruccion=request.getParameter("instruccion");
		
		
		switch (instruccion){
			case "INSERTAR":
				String nombre=request.getParameter("nombre");
				String descripcion=request.getParameter("descripcion");
				
				System.out.println("insertado");
				break;
			case "ELIMINAR":
				String id=request.getParameter("id");
				
				System.out.println("eliminado");
				break;
			case "MODIFICAR":
				String idM=request.getParameter("id");
				String nombreM=request.getParameter("nombre");
				String descripcionM=request.getParameter("descripcion");
				
				System.out.println("modificado");
				break;
			case "CONSULTAR":
				String idC=request.getParameter("id");
				int idINT=Integer.parseInt(idC);
				
				
				System.out.println("consultado");
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
