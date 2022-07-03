package aulaException;

public class meuRecurso implements AutoCloseable {
	
	public int getValue(int value) {
		if(value == 0) {
		throw new RuntimeException("Zero value");
	}
		return value;
		}
	
	public void close() throws Exception{
		System.out.println("Fechou Recurso");
	}

}
