package servlet;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.CRUDStub;

public class eliminar {

	public static void main(String[] args) {
		try {
			CRUDStub obj=new CRUDStub();
			
			CRUDStub.Baja a=new CRUDStub.Baja();
			a.setId(5);
				
			System.out.println(obj.baja(a).get_return());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
