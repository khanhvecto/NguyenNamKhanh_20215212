package MainAim;

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