package servlet;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.CRUDStub;

public class modificar {

	public static void main(String[] args) {
		try {
			CRUDStub obj=new CRUDStub();
			
			CRUDStub.Modificacion a=new CRUDStub.Modificacion();
			a.setNombre("PruebaMOD2");
			a.setDescripcion("DescripcionMOD2");
			a.setId(1);
				
			System.out.println(obj.modificacion(a).get_return());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
