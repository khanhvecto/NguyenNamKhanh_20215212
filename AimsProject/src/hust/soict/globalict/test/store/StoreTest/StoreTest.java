package hust.soict.globalict.test.store.StoreTest;

import hust.soict.globalict.aims.store.Store.Store;
import hust.soict.gobalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvdList1[] = {dvd1, dvd2, dvd3};
		store.addDVD(dvdList1);
		DigitalVideoDisc dvdList2[] = {dvd1, dvd3};
		store.removeDVD(dvdList2);
		store.printStore();
	}
}
