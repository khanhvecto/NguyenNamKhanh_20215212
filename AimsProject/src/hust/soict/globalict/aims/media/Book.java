package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	private boolean checkAuthorExist(String authorName) {
		for (String author: authors){
			if(author.equals(authorName)) return true;
		}
		return false;
	}
	public void addAuthor(String authorName) {
		if(checkAuthorExist(authorName)) 
			System.out.println("Author name existed");
		else {
			authors.add(authorName);
			System.out.println("Author name is added");
		}
	}
	public void removeAuthor(String authorName) {
		if(checkAuthorExist(authorName)) {
			authors.remove(authorName);
			System.out.println("Author name is removed");
		} else System.out.println("Author name is not exist");
	}
}
