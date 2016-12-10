package Clase;
import java.rmi.RemoteException;

import com.mx.tallerJava.service.*;

public class test {

	public static void main(String[] args) throws Exception {
		
		Saludos obj=new SaludosProxy();
		
		String a=obj.getSaludoByName("juan alberto put");
		
		System.out.println(a);
	}

}
