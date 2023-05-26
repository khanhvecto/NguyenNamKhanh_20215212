package hust.soict.globalict.aims.cart.Cart;
import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered=0;
	private Media itemsOrdered[] = new ArrayList<Media>();
	
	public float totalCost() {
		float total_cost=0;
		for(int i=0; i<qtyOrdered; i++) {
			total_cost += itemsOrdered[i].getCost();
			itemsOrdered[i].
		}
		return total_cost;
	}
	
	public void printCart() {
		System.out.println("********************************CART********************************");
		for(int i = 0; i<qtyOrdered; i++) {
			System.out.println((i+1) + " - " + itemsOrdered[i].toString());
		}
		System.out.println("********************************************************************");
	}
	
	public void searchDVD(int ID) {
		int flag = 0;
		for(int i=0; i<qtyOrdered; i++) {
			if(ID == itemsOrdered[i].getId()) {
				flag = 1;
				System.out.println(itemsOrdered[i].toString());
				break;
			}
		}
		if(flag == 0) System.out.println("DVD not found.");
	}
	
	public void searchDVD(String title) {
		int flag = 0;
		for(int i=0; i<qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(title)) {
				flag = 1;
				System.out.println(itemsOrdered[i].toString());
				break;
			}
		}
		if(flag == 0) System.out.println("DVD not found.");
	}
	
}