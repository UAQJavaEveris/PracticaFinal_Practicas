
public class Test {

	public static void main(String[] args) {
		CRUD obj=new CRUD();
		
		String a=obj.Consulta(4);
		System.out.println(a);
		
		
		System.out.println(obj.AltaSinBD());
	}

}
