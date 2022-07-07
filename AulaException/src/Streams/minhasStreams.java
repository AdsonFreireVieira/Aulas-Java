package Streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class minhasStreams {
	public static void main(String[] args) {
		
		List<Integer> lista= new ArrayList<Integer>();
		
		lista=Arrays.asList(0,4,4,8,89,9,9,7,3,2,7,8,1);
		lista.stream(); // Transforma em fluxo de dados
	                      
		               //
	       // .filter(e-> e<5)  // filtra elemntos menor que cinco
		                 //.distinct()      // Elimina duplicados
		             //.limit(3)      // somente 3 primeiros
		             //  .skip(2)       // pula  ele,entos
 	// 	.forEach(e-> System.out.println("Elemento "+e));
		
		//Long Elementos = lista.stream().count();
		
		Integer elementos = lista.stream()
				.filter(e-> e % 2==0 )
				.distinct()
				.mapToInt(Integer:: intValue )
				.sum();
		System.out.println(elementos);
		
		
	
	}

}
