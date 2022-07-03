package aulaException;

public class error {
	
	public static void metodoLancador(String str)throws Exception {
		if(str !=null) {
		System.out.println("  Test e  " + str);
		}else {
			throw new Exception("Deu ruim no metodo");
		}
		
	}

}
