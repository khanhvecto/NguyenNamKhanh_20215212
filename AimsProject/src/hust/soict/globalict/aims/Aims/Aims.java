package hust.soict.globalict.aims.Aims;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store.Store;
import java.util.Scanner;
import java.util.Collections;

public class Aims {
	private static Scanner scan = new Scanner(System.in);
	private static int choice;
	private static String inputString;
	private static int inputInt;
	private static Store store = new Store();
	private static Cart cart = new Cart();
	private static Media item;
	
	public static Media createMedia() {
		System.out.println("What type of media u want to create:\n1. DVD\t2. Book\t3. CD");
		choice = scan.nextInt();
		scan.nextLine();
		switch(choice) {
		case 1:
			DigitalVideoDisc dvd = new DigitalVideoDisc();
			//Enter attribute (title, category, director, length, cost)
			System.out.print("Title: ");
			inputString = scan.nextLine();
			dvd.setTitle(inputString);
			System.out.print("Category: ");
			inputString = scan.nextLine();
			dvd.setCategory(inputString);
			System.out.print("Director: ");
			inputString = scan.nextLine();
			dvd.setDirector(inputString);
			System.out.print("Length: ");
			inputInt = scan.nextInt();
			dvd.setLength(inputInt);
			System.out.print("Cost: ");
			float inputFloat = scan.nextFloat();
			dvd.setCost(inputFloat);
			
			return dvd;
		case 2:
			Book book = new Book();
			//Enter attribute (title, category, authors, cost)
			System.out.print("Title: ");
			inputString = scan.nextLine();
			book.setTitle(inputString);
			System.out.print("Category: ");
			inputString = scan.nextLine();
			book.setCategory(inputString);
			System.out.print("Number of authors: ");
			inputInt = scan.nextInt();
			scan.nextLine();
			for(int i=1; i<=inputInt; i++) {
				System.out.print("Enter author: ");
				inputString = scan.nextLine();
				book.addAuthor(inputString);
			}
			System.out.print("Cost: ");
			inputFloat = scan.nextFloat();
			book.setCost(inputFloat);
			
			return book;
		case 3: 
			CompactDisc cd = new CompactDisc();
			//Enter attribute (title, category, artist, length, cost)
			System.out.print("Title: ");
			inputString = scan.nextLine();
			cd.setTitle(inputString);
			System.out.print("Category: ");
			inputString = scan.nextLine();
			cd.setCategory(inputString);
			System.out.print("Artist: ");
			inputString = scan.nextLine();
			cd.setArtist(inputString);
			System.out.print("Cost: ");
			inputFloat = scan.nextFloat();
			cd.setCost(inputFloat);
			//You can add more tracks here for more detail
			System.out.print("Number of tracks: ");
			int nbTracks = scan.nextInt();
			scan.nextLine();
			for(int i=1; i<= nbTracks; i++) {
				Track track = new Track();
				System.out.print("Input title: ");
				inputString = scan.nextLine();
				track.setTitle(inputString);
				System.out.print("Input length: ");
				inputInt = scan.nextInt();
				scan.nextLine();
				track.setLength(inputInt);
				cd.addTrack(track);
			}
			
			return cd;
		default: return null;
		}
	}
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			//Display all items in store
			store.printStore();
			
			storeMenu();
			break;
		case 2:
			//add a media to or remove a media from the store
			Media media = createMedia();
			if(media == null) {
				System.out.println("Can't create Media");
				showMenu();
				return;
			}
			System.out.println("What do u want to do:\n1. Add media\t2. Remove media");
			choice = scan.nextInt();
			if(choice == 1) store.addMedia(media);
			else if(choice == 2) store.removeMedia(media);
			else System.out.println("Wrong format");
			showMenu();
			break;
		case 3:
			//Display infor of current cart
			cart.printCart();
			
			cartMenu();
			break;
		case 0: break;
		default: 
			System.out.println("Wrong format");
			showMenu();
			break;
		}
	}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		choice = scan.nextInt();
		scan.nextLine();
		switch(choice) {
		case 1:
			// Enter title of media and display infor
			System.out.print("Enter title: ");
			inputString = scan.nextLine();
			item = store.search(inputString);
			if(item == null) {
				System.out.println("Item doesn't exist");
				store.printStore();
				storeMenu();
				return;
			}
			System.out.println(item.toString());
			
			mediaDetailsMenu();
			break;
		case 2:
			//Add to cart, check validity
			System.out.print("Enter title: ");
			inputString = scan.nextLine();
			item = store.search(inputString);
			if(item==null) {
				System.out.println("Item doesn't exist");
				store.printStore();
				storeMenu();
				return;
			}
			cart.addMedia(item);
			
			//Display number of items in cart
			System.out.println("There're " + cart.getSize() + " items in current cart");
			
			store.printStore();
			storeMenu();
			break;
		case 3: 
			//Play media, check validity
			System.out.print("Enter title: ");
			inputString = scan.nextLine();
			item = store.search(inputString);
			if(item==null) {
				System.out.println("Item doesn't exist");
				store.printStore();
				storeMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("Book")) {
				System.out.println("Can't play this");
				store.printStore();
				storeMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("CompactDisc")) {
				CompactDisc cd = (CompactDisc) item;
				cd.play();
				store.printStore();
				storeMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("DigitalVideoDisc")) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) item;
				dvd.play();
				store.printStore();
				storeMenu();
				return;
			}
		case 4:
			//Display infor of current cart
			cart.printCart();
			
			cartMenu();
			return;
		case 0:
			showMenu();
			break;
		default: 
			System.out.println("Wrong format");
			storeMenu();
			return;
		}
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		choice = scan.nextInt();
		scan.nextLine();
		switch(choice) {
		case 1:
			cart.addMedia(item);
			store.printStore();
			storeMenu();
			return;
		case 2:
			if(item.getClass().getSimpleName().equals("Book")) {
				System.out.println("Can't play this");
				System.out.println(item.toString());
				mediaDetailsMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("CompactDisc")) {
				CompactDisc cd = (CompactDisc) item;
				cd.play();
				System.out.println(item.toString());
				mediaDetailsMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("DigitalVideoDisc")) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) item;
				dvd.play();
				System.out.println(item.toString());
				mediaDetailsMenu();
				return;
			}
		case 0:
			storeMenu();
			return;
		default:
			System.out.println("Wrong format");
			System.out.println(item.toString());
			mediaDetailsMenu();
			return;
		}
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		choice = scan.nextInt();
		scan.nextLine();
		switch(choice) {
		case 1: 
			// Choose filter by id or title
			System.out.println("U can choose filter by:\n1. id\t2. title");
			choice = scan.nextInt();
			scan.nextLine();
			if(choice == 1) {
				System.out.print("Input id: ");
				inputInt = scan.nextInt();
				cart.filter(inputInt);
				cart.printCart();
				cartMenu();
				return;
			} else if(choice == 2){
				System.out.print("Input title: ");
				inputString = scan.nextLine();
				cart.filter(inputString);
				cart.printCart();
				cartMenu();
				return;
			} else {
				System.out.println("Wrong format.");
				cart.printCart();
				cartMenu();
				return;
			}
		case 2:
			// Sort by title or cost
			System.out.println("U can choose sort by:\n1. title\t2. cost");
			choice = scan.nextInt();
			if(choice == 1) {
				Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
				cart.printCart();
				cartMenu();
				return;
			} else if(choice == 2){
				Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
				cart.printCart();
				cartMenu();
				return;
			} else {
				System.out.println("Wrong format.");
				cart.printCart();
				cartMenu();
				return;
			}
		case 3:
			//Remove by title
			System.out.print("Input title of media to remove: ");
			inputString = scan.nextLine();
			Media removeItem = cart.search(inputString);
			cart.removeMedia(removeItem);
			cart.printCart();
			cartMenu();
			return;
		case 4:
			System.out.print("Input title of media to play: ");
			inputString = scan.nextLine();
			item = cart.search(inputString);
			if(item == null) {
				System.out.println("Can't find item");
				cart.printCart();
				cartMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("Book")) {
				System.out.println("Can't play this");
				cart.printCart();
				cartMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("CompactDisc")) {
				CompactDisc cd = (CompactDisc) item;
				cd.play();
				cart.printCart();
				cartMenu();
				return;
			}
			if(item.getClass().getSimpleName().equals("DigitalVideoDisc")) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) item;
				dvd.play();
				cart.printCart();
				cartMenu();
				return;
			}
			System.out.println("Can't find item");
			cart.printCart();
			cartMenu();
			return;
		case 5:
			// Notify user, empty current cart
			System.out.println("An order is created");
			cart.emptyCart();
			cart.printCart();
			showMenu();
			return;
		case 0:
			showMenu();
			return;
		default: 
			System.out.println("Wrong format");
			cart.printCart();
			cartMenu();
			return;
		}
	}
	public static void main(String[] args) {
		showMenu();
	}
}
