package servlet;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.CRUDStub;

public class insertar {

	public static void main(String[] args) {
		try {
			CRUDStub obj=new CRUDStub();
			
			CRUDStub.Alta a=new CRUDStub.Alta();
			a.setNombre("Prueba2");
			a.setDescripcion("Descripcion2");
				
			System.out.println(obj.alta(a).get_return());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
