package hust.soict.globalict.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public String play() {
		String a = ("Playing track: " + this.getTitle() + "\n");
		a += ("Track length: " + this.getLength() + "\n");
		return a;
	}
	
	@Override
	public boolean equals(Object obj) {
		Track track = (Track) obj;
		return (this.title.equals(track.getTitle()) && length==track.getLength());
	}
	
	public Track() {
		// TODO Auto-generated constructor stub
		super();
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
