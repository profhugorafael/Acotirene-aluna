package lambdas.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lambdas.entities.Book;
import lambdas.entities.Book.ByAuthorName;

public class App {

	static List<Integer> lista = new ArrayList<>();
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		List<Book> lista = new ArrayList<>();

		try {
			lista.add( new Book(1, "a", "euthor", sdf.parse("2002") , 22.30) );
			lista.add( new Book(2, "b", "author", sdf.parse("1999") , 22.30) );
			lista.add( new Book(3, "b", "buthor", sdf.parse("2002") , 22.30) );
			lista.add( new Book(4, "e", "author", sdf.parse("2099") , 22.30) );
			lista.add( new Book(5, "c", "futhor", sdf.parse("1002") , 22.30) );
			lista.add( new Book(6, "c", "author", sdf.parse("2002") , 22.30) );
			lista.add( new Book(7, "d", "buthor", sdf.parse("4002") , 22.30) );
			lista.add( new Book(8, "e", "cuthor", sdf.parse("2002") , 22.30) );
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}

		ByAuthorName criteria = new Book.ByAuthorName();
		
		// Predicate: recebe e retorna verdadeiro/falso
		// Action: recebe e retorna void
		// Function: <T, ...> -> retorna <R>
		
		// Function<Book, Integer> minhaFuncao = (livro) -> livro.getId();
		List<Integer> convertidos;

			
		convertidos = lista.stream()
					   .filter( livro -> {
						   try { return livro.getReleaseYear().after(sdf.parse("2000"));
						   } catch (ParseException e) { return false; }
					   	  } 
					   ) .map( (livro) -> livro.getId() )
					     .collect(Collectors.toList());
			
			
		convertidos.forEach(System.out::println);
		
		lista.sort(criteria);
		
		lista.forEach(System.out::println);
				
	}
	
	
//	public static Integer converteIntString(Book book) {
	//	return book.getId();
	//}
	
}
