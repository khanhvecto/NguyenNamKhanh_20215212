package hust.soict.globalict.aims.media;

public abstract class Disc extends Media{
	private int length;
	private String director;
	
	public Disc() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
