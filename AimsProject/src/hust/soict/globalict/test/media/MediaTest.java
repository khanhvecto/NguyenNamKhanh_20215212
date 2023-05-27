package hust.soict.globalict.test.media;
import hust.soict.globalict.aims.media.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MediaTest {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		
		//Create some media
		DigitalVideoDisc DVD1 = new DigitalVideoDisc("Tom and Jerry", "animation", "Darrell Van Citters", 60, 22.6f);
		DigitalVideoDisc DVD2 = new DigitalVideoDisc("Tom and Jerry", "test", "test", 59, 22.6f);
		DigitalVideoDisc DVD3 = new DigitalVideoDisc("Tom and Jerry", "test", "test", 59, 22.4f);
		DigitalVideoDisc DVD4 = new DigitalVideoDisc("Test name", "test", "test", 58, 22.6f);
		Book book1 = new Book();
		book1.addAuthor("Brian W. Kernighan");
		book1.setCategory("Programming");
		book1.setCost(54f);
		book1.setTitle("The C programming language");
		CompactDisc CD1 = new CompactDisc();
		CD1.setTitle("My Savior");
		CD1.setCategory("Music");
		CD1.setArtist("Carrie Underwood");
		Track track1 = new Track();
		track1.setLength(35);
		CD1.addTrack(track1);
		CD1.setCost(30.1f);
		Book book2 = new Book();
		book2.addAuthor("test");
		book2.setCategory("test");
		book2.setCost(54f);
		book2.setTitle("Test book");
		Book book3 = new Book();
		book3.addAuthor("test");
		book3.setCategory("test");
		book3.setCost(55f);
		book3.setTitle("The C programming language");
		
		mediae.add(CD1);
		mediae.add(DVD1);
		mediae.add(book1);
		mediae.add(book2);
		mediae.add(book3);
		mediae.add(DVD3);
		mediae.add(DVD2);
		mediae.add(DVD4);
		
		for(Media m: mediae) System.out.println(m.toString());
		
		// Test comparator
		Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
		System.out.println("\nSort by title-cost: ");
		for(Media m: mediae) System.out.println(m.toString());
		
		Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
		System.out.println("\nSort by cost-title: ");
		for(Media m: mediae) System.out.println(m.toString());
		
		// Test Comparable interface
		Collections.sort(mediae);
		System.out.println("\nSort by comparable: ");
		for(Media m: mediae) System.out.println(m.toString());
		
		// Test for sorting DVDs
//		List<DigitalVideoDisc> DVDs = new ArrayList<DigitalVideoDisc>();
//		DigitalVideoDisc DVD2 = new DigitalVideoDisc("Tom and Jerry", "test", "test", 59, 22.6f);
//		DigitalVideoDisc DVD3 = new DigitalVideoDisc("Tom and Jerry", "test", "test", 59, 22.4f);
//		DigitalVideoDisc DVD4 = new DigitalVideoDisc("Test name", "test", "test", 58, 22.6f);
//		DVDs.add(DVD1);
//		DVDs.add(DVD3);
//		DVDs.add(DVD2);
//		DVDs.add(DVD4);
//		Collections.sort(DVDs);
//		System.out.println("\nDVD sort: ");
//		for(DigitalVideoDisc dvd: DVDs) System.out.println(dvd.toString());
	}
}