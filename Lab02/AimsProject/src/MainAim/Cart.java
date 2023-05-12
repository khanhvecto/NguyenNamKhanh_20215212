package MainAim;
import java.util.*;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full");
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int i = 0;
		while(qtyOrdered<=MAX_NUMBERS_ORDERED) {
			if(qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full");
				break;
			} else if(i == dvdList.length)
				break;
			else{
				itemsOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered++;
				i++;
				System.out.println("The disc has been added");
			}
		}
	}
	
	public void addDigitalVideoDisc(String title, String category, float cost) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED)
			System.out.println("The cart is almost full");
		else {
			DigitalVideoDisc newone = new DigitalVideoDisc(title, category, cost);
			itemsOrdered[qtyOrdered] = newone;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED-1)
			System.out.println("Cant add more");
		else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) System.out.println("Already empty");
		else {
			for(int i=0; i<qtyOrdered; i++)
				if(itemsOrdered[i] == disc) {
					for(int j=i; j<qtyOrdered-1; j++) 
						itemsOrdered[j] = itemsOrdered[j+1];
					break;
				}
			qtyOrdered--;
			System.out.println("The disc has been removed");
		}
	}
	
	public float totalCost() {
		float total_cost=0;
		for(int i=0; i<qtyOrdered; i++) {
			total_cost += itemsOrdered[i].getCost();
		}
		return total_cost;
	}
}