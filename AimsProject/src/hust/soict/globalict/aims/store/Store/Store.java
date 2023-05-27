package hust.soict.globalict.aims.store.Store;
import java.util.ArrayList;
import java.util.List;
import hust.soict.globalict.aims.media.Media;

public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();
	private static int MAX_SIZE = 20;
	
	public Media search(String title) {
		for(Media item: itemsInStore) {
			if(item.getTitle().equals(title)) return item;
		}
		return null;
	}
	public boolean contains(Media media) {
		for(Media item: itemsInStore) {
			if(item == media) return true;
		}
		return false;
	}
	
	public void addMedia(Media media) {
		if(contains(media)) System.out.println("Media is already in shop");
		else if(itemsInStore.size() < MAX_SIZE) {
			itemsInStore.add(media);
			System.out.println("Media is added in shop");
		} else System.out.println("Full already");
		
	}
	public void addMedia(List<Media> media) {
		for(Media med: media) {
			if(contains(med)) System.out.println("Media is already in shop");
			else if(itemsInStore.size() < MAX_SIZE) {
				itemsInStore.add(med);
				System.out.println("Media is added in shop");
			} else System.out.println("Full already");
		}
	}
	
	public void removeMedia(Media media) {
		if(!contains(media))  System.out.println("Media is not in the store");
		else {
			itemsInStore.remove(media);
			System.out.println("Media is removed from store");
		}
	}
	public void removeMedia(List<Media> media) {
		for(Media med: media) {
			if(!contains(med))  System.out.println("Media is not in the store");
			else {
				itemsInStore.remove(med);
				System.out.println("Media is removed from store");
			}
		}
	}
	
	public void printStore() {
		System.out.println("********************************Store********************************");
		for(Media item: itemsInStore) System.out.println(item.toString());
		System.out.println("*********************************************************************");
	}
}
