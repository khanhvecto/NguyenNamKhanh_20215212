package hust.soict.globalict.test.cart.CartTest;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.gobalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		// Create a new cart
		Cart cart = new Cart();
		
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		//Remove disc from the cart
		cart.removeDigitalVideoDisc(dvd2);
		
		// Test the print method
		cart.printCart();
		System.out.print("Find item id 2: ");
		cart.searchDVD(2);
		System.out.print("Find item id 3: ");
		cart.searchDVD(3);
		System.out.print("Find item title The Lion King: ");
		cart.searchDVD("The Lion King");
	}
}
