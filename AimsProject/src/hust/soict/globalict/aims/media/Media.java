package hust.soict.globalict.aims.media;

interface Playable {
	public void play();
}

public abstract class Media {
	private String title;
	private int id;
	private String category;
	private float cost;

	public Media() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
//
//	public String getCategory() {
//		return category;
//	}
//
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
