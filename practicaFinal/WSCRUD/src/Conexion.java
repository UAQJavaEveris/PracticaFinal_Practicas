
import java.sql.*;

public class Conexion {

	public Connection getConexion(){
		Connection cn=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/personajescontemporaneos";
			cn=DriverManager.getConnection(url,"root","");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return cn;
	}
	
}
