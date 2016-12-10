package org.apache.ws.axis2;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

public class test {

	public static void main(String[] args) throws RemoteException {
		CRUDStub obj=new CRUDStub();
		
		CRUDStub.Consulta a=new CRUDStub.Consulta();
		a.setId(4);
			
		System.out.println(obj.consulta(a).get_return());
		
	}

}
