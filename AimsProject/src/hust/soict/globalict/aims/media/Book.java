package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	private static int nbBooks = 0;
	
	public Book() {
		// TODO Auto-generated constructor stub
		super();
		nbBooks++;
		setId(nbBooks);
	}
	
	public String toString() {
		String a = new String("Book - ");
		a = a + String.valueOf(getId()) + " - " + getTitle() + " - " + getCategory();
		for(String author: authors) a += " - " + author;
		a += ": " + String.valueOf(getCost()) + "$";
		return a;
	}
	private boolean contains(String authorName) {
		for (String author: authors){
			if(author.equals(authorName)) return true;
		}
		return false;
	}
	public void addAuthor(String authorName) {
		if(contains(authorName)) 
			System.out.println("Author name existed");
		else {
			authors.add(authorName);
			System.out.println("Author name is added");
		}
	}
	public void addAuthor(List<String> authorName) {
		for(String author: authorName) {
			if(contains(author)) 
				System.out.println("Author name existed");
			else {
				authors.add(author);
				System.out.println("Author name is added");
			}
		}
	}
	public void removeAuthor(String authorName) {
		if(contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Author name is removed");
		} else System.out.println("Author name is not exist");
	}
	public void removeAuthor(List<String> authorName) {
		for(String author: authorName) {
			if(contains(author)) {
				authors.remove(author);
				System.out.println("Author name is removed");
			} else System.out.println("Author name is not exist");
		}
	}
}
