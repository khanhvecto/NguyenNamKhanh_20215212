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
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) System.out.println("Already empty");
		else {
			for(int i=0; i<qtyOrdered; i++)
				if(itemsOrdered[qtyOrdered] == disc) {
					for(int j=i; j<qtyOrdered-1; j++) 
						itemsOrdered[j] = itemsOrdered[j+1];
					break;
				}
			qtyOrdered--;
		}
	}
	public int totalCost() {
		for(int i=0; i<qtyOrdered;)
	}
}