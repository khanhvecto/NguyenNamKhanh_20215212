package hust.soict.globalict.test.disc.TestPassingParameter;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("JungLe");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
//		Address newaddress = swap(jungleDVD, cinderellaDVD);
//		jungleDVD = newaddress.getAddress1();
//		cinderellaDVD = newaddress.getAddress2();
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("ciderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd Title: " + jungleDVD.getTitle());
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
//	public static Address swap(DigitalVideoDisc d1, DigitalVideoDisc d2) {
//		return new Address(d2, d1);
//	}
}