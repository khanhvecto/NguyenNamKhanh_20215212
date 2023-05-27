package hust.soict.globalict.aims.cart.Cart;
import java.util.ArrayList;
import java.util.List;
import hust.soict.globalict.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public void emptyCart() {
		itemsOrdered = new ArrayList<Media>();
	}
	public Media search(String title) {
		for(Media item: itemsOrdered) {
			if(item.getTitle().equals(title)) return item;
		}
		return null;
	}
	public Media search(int id) {
		for(Media item: itemsOrdered) {
			if(item.getId()==id) return item;
		}
		return null;
	}
	public void filter(String title) {
		Media item = search(title);
		if(item == null) System.out.println("Can't find item");
		else System.out.println(item.toString());
	}
	public void filter(int id) {
		Media item = search(id);
		if(item == null) System.out.println("Can't find item");
		else System.out.println(item.toString());
	}
	public int getSize() {
		return itemsOrdered.size();
	}
	public float totalCost() {
		float total_cost=0;
		for(Media item: itemsOrdered) total_cost += item.getCost();
		return total_cost;
	}
	public List<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void printCart() {
		System.out.println("********************************CART********************************");
		for(Media item: itemsOrdered) System.out.println(item.toString());
		System.out.println("********************************************************************");
	}
	
	public void searchMedia(int ID) {
		int flag = 0;
		for(Media item: itemsOrdered) {
			if(ID == item.getId()) {
				flag = 1;
				System.out.println(item.toString());
				break;
			}
		}
		if(flag == 0) System.out.println("Media not found.");
	}
	
	public void searchMedia(String title) {
		int flag = 0;
		for(Media item: itemsOrdered) {
			if(item.getTitle() == title) {
				flag = 1;
				System.out.println(item.toString());
				break;
			}
		}
		if(flag == 0) System.out.println("Media not found.");
	}
	
	public boolean contains(Media media) {
		for(Media item: itemsOrdered) {
			if(item == media) return true;
		}
		return false;
	}
	
	public void addMedia(Media media) {
		if(contains(media)) System.out.println("Media is already in cart");
		else if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println("Media is added in cart");
		} else System.out.println("Full already");
	}
	public void addMedia(List<Media> media) {
		for(Media med: media) {
			if(contains(med)) System.out.println("Media is already in cart");
			else if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
				itemsOrdered.add(med);
				System.out.println("Media is added in cart");
			} else System.out.println("Full already");		
		}
	}
	
	public void removeMedia(Media media) {
		if(!contains(media))  System.out.println("Media is not in the cart");
		else {
			itemsOrdered.remove(media);
			System.out.println("Media is removed from cart");
		}
	}
	public void removeMedia(List<Media> media) {
		for(Media med: media) {
			if(!contains(med))  System.out.println("Media is not in the cart");
			else {
				itemsOrdered.remove(med);
				System.out.println("Media is removed from cart");
			}
		}
	}
}