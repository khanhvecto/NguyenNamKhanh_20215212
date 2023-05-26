package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private static int nbDigitalVideoDiscs = 0;
	
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}

	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public String toString() {
		String a = new String("DVD - ");
		a = a + title + " - " + category + " - " + director + " - " + String.valueOf(length) + ": " + String.valueOf(cost) + "$";
		return a;
	}
	public boolean isMatch(String title) {
		if(this.title == title) return true;
		return false;
	}
}
