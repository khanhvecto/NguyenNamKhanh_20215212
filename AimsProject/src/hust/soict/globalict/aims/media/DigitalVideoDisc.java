package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private static int nbDigitalVideoDiscs = 0;
	
//	@Override
//	public int compareTo(Media media) {
//		DigitalVideoDisc dvd = (DigitalVideoDisc) media;
//		if(this.getTitle().compareTo(dvd.getTitle()) != 0) return this.getTitle().compareTo(dvd.getTitle());
//		else if(this.getLength() > dvd.getLength()) return -1;
//		else if(this.getLength() < dvd.getLength()) return 1;
//		else return (this.getCost() > dvd.getCost() ? -1 : 1);
//	}
	
	@Override
	public String play() {
		String a = ("Playing DVD: " + this.getTitle() + "\n");
		a += ("DVD length: " + this.getLength() + "\n");
		return a;
	}
	public DigitalVideoDisc() {
		super();
		nbDigitalVideoDiscs++;
		setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	} 
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
		
	@Override
	public String toString() {
		String a = new String("DVD - ");
		a = a + String.valueOf(getId()) + " - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + String.valueOf(getLength()) + " min: " + String.valueOf(getCost()) + "$";
		return a;
	}
	public boolean isMatch(String title) {
		if(getTitle() == title) return true;
		return false;
	}
}
