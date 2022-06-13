package lambdas.entities;

import java.util.Comparator;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString @EqualsAndHashCode
public class Book {

	private int id;
	private String name;
	private String author;
	private Date releaseYear;
	private double price;

	public static int compareTo(Book first, Book other) {
		// ignorando maiusculas e minusculas
		int result = first.name.compareToIgnoreCase(other.name);
		
		if( result != 0 ) return result;
		else return first.releaseYear.compareTo(other.releaseYear);
	}
	
	public static class ByAuthorName implements Comparator<Book> {
		@Override
		public int compare(Book o1, Book o2) {
			return o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
		}
	}
}
