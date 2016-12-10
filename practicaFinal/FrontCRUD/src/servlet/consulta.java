package servlet;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.CRUDStub;

public class consulta {
		public static void main(String[] args) {
			try {
				CRUDStub obj=new CRUDStub();
				
				CRUDStub.Consulta a=new CRUDStub.Consulta();
				a.setId(4);
					
				System.out.println(obj.consulta(a).get_return());
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
