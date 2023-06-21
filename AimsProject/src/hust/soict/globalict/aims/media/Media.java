package hust.soict.globalict.aims.media;
import java.util.*;


public abstract class Media implements Comparable<Media>{
	private String title;
	private int id;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	@Override
	public boolean equals(Object obj) {
		Media media = (Media) obj;
		return (this.title.equals(media.getTitle()));
	}
	
	@Override
	public int compareTo(Media media) {
		if(this.cost > media.getCost()) return 1;
		else if(this.cost < media.getCost()) return -1;
		else return (this.title.compareTo(media.getTitle()));
	}
	
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
