package mx.com.tallerJava.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Sumas {

	
	@WebMethod
	public int getSuma(int a, int b){
		return a+b;
	}
	@WebMethod
	public int getSumaTresNumeros(int a, int b, int c){
		return a+b+c;
	}
	@WebMethod
	public int getSumaArrayNum(int [] array){
		int sum=0;
		
		if (array!=null && array.length>0){
			for(int i=0;i<array.length;i++){
				sum+=array[i];
			}
		}
		return sum;
		
		
	}
	
}

