package hust.soict.globalict.aims.store.Store;

import hust.soict.gobalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_SIZE];
	private int size = 0;
	private static int MAX_SIZE = 20;
	public void addDVD(DigitalVideoDisc dvd[]) {
		for(int i=0; i<dvd.length; i++, size++) {
			itemsInStore[size] = dvd[i];
		}
		System.out.println("DVDs have been added.");
	}
	
	public void removeDVD(DigitalVideoDisc dvd[]) {
		if(size == 0) {
			System.out.println("Store is already empty.");
		} else {
			for(int i =0; i<dvd.length; i++) {
				for(int j=0; j<size; j++) {
					if(itemsInStore[j] == dvd[i]) {
						for(int k=j; k<size-1; k++) {
							itemsInStore[k] = itemsInStore[k+1];
						}
						itemsInStore[size-1] = null;
						size--;
						break;
					}
				}
				if(size == 0) break;
			}
		}
	}
	
	public void printStore() {
		System.out.println("********************************Store********************************");
		for(int i = 0; i<size; i++) {
			System.out.println((i+1) + " - " + itemsInStore[i].toString());
		}
		System.out.println("*********************************************************************");
	}
}
