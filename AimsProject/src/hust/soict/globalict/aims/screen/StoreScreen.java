package hust.soict.globalict.aims.screen;
import javax.swing.*;
import hust.soict.globalict.aims.store.Store.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.media.*;
import java.util.*;
import java.util.Scanner;

public class StoreScreen extends JFrame{
	private Store store;
	private Cart cart = new Cart();
	private static Scanner scan = new Scanner(System.in);
	private static int choice;
	private static String inputString;
	private static int inputInt;
	
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
	
	public StoreScreen(Store store) {
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		ButtonListener btnListener = new ButtonListener();
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.addActionListener(btnListener);
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CV"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		JMenu smCart = new JMenu("View Cart");
		menu.add(smCart);
		smCart.addActionListener(btnListener);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100, 500));
		cart.setMaximumSize(new Dimension(100, 50));
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for(int i=0; i<9; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
			center.add(cell);
		}
		
		return center;
	}
	
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent e) {
			String button = e.getActionCommand();
			if(button.equals("Update Store")) {
				//add a media to or remove a media from the store
				Media media = createMedia();
				if(media == null) {
					System.out.println("Can't create Media");
				}
				System.out.println("What do u want to do:\n1. Add media\t2. Remove media");
				choice = scan.nextInt();
				if(choice == 1) store.addMedia(media);
				else if(choice == 2) store.removeMedia(media);
				else System.out.println("Wrong format");
			} else if(button.equals("View Cart")) {
				cart.printCart();
			}
		}
	}
}
