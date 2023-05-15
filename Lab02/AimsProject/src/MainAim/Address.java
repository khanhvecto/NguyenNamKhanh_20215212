package MainAim;

public class Address {
	private DigitalVideoDisc address1;
	private DigitalVideoDisc address2;
	
	public Address(DigitalVideoDisc d1, DigitalVideoDisc d2) {
		this.address1 = d1;
		this.address2 = d2;
	}
	public DigitalVideoDisc getAddress1() {
		return address1;
	}
	public DigitalVideoDisc getAddress2() {
		return address2;
	}
}