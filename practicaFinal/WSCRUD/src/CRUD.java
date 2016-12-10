
import java.sql.*;

public class CRUD {

	public String AltaSinBD(){
		return "pruebaExitosaAltaBD";
	}

	public String BajaSinBD(){
		return "pruebaExitosBajaBD";
	}
	
	public String ModificacionSinBD(){
		return "pruebaExitosaModificacionBD";
	}
	
	public String ConsultaSinBD(){
		return "pruebaExitosaConsultaBD";
	}
	
	
	
	public String Alta(String nombre, String descripcion){
		try {
			Conexion cn=new Conexion();
			Connection cc=cn.getConexion();
			
			PreparedStatement pst=cc.prepareStatement("INSERT INTO personajes (nombre,descripcion) VALUES ('"+nombre+"','"+descripcion+"')");
			
			pst.executeUpdate();
			
			cc.close();
			return "Se ingreso correctamente";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Algo salio mal";
		
	}
	
	public String Baja(int id){
		
		try {
			Conexion cn=new Conexion();
			Connection cc=cn.getConexion();
			
			PreparedStatement pst=cc.prepareStatement("DELETE FROM personajes WHERE idPersonaje = '"+id+"'");
			
			pst.executeUpdate();
			
			cc.close();
			return "Se borro correctamente";
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Algo salio mal";
		
	}
	
	public String Modificacion(int id, String nombre, String descripcion){
		try {
			Conexion cn=new Conexion();
			Connection cc=cn.getConexion();
			
			PreparedStatement pst=cc.prepareStatement("UPDATE personajes SET nombre='"+nombre+"',descripcion='"+descripcion+"' WHERE idPersonaje = '"+id+"'");
			
			pst.executeUpdate();
			
			cc.close();
			return "Se modifico correctamente";
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Algo salio mal";
		
	}
	
	public String Consulta(int id){
		
		try {
			ResultSet fila=null;
			String nombre="",descripcion="";
			Conexion cn=new Conexion();
			Connection cc=cn.getConexion();
			
			
			PreparedStatement pst=cc.prepareStatement("SELECT * FROM personajes WHERE idPersonaje = '"+id+"'");
			
			fila=pst.executeQuery();
			
			while (fila.next()){
				nombre=fila.getString("nombre");
				descripcion=fila.getString("descripcion");
			}
			
			cc.close();
			return "El nombre es: "+nombre+" la descripcion es: "+descripcion;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return "Algo salio mal";
		
		
	}
}
