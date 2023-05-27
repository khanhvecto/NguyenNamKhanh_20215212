package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	private static int nbCompactDiscs = 0;
	
	@Override
	public void play() {
		for(Track track: tracks) {
			track.play();
		}
	}
	@Override
	public String toString() {
		String a = new String("CD - ");
		a = a + String.valueOf(getId()) + " - " + getTitle() + " - " + getCategory() + " - " + artist + " - " + String.valueOf(getLength()) + " min: " + String.valueOf(getCost()) + "$";
		return a;
	}
	public CompactDisc() {
		// TODO Auto-generated constructor stub
		super();
		nbCompactDiscs++;
		setId(nbCompactDiscs);
	}
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public boolean contains(Track trackName) {
		for(Track track: tracks) {
			if(track.equals(trackName)) return true;
		}
		return false;
	}
	public void addTrack(Track trackName) {
		if(contains(trackName)) System.out.println("Track is existed");
		else {
			tracks.add(trackName);
			System.out.println("Track is added");
		}
	}
	public void removeTrack(Track trackName) {
		if(contains(trackName)) {
			tracks.remove(trackName);
			System.out.println("Track is removed");
		} else System.out.println("Track is not existed");
	}
	
	@Override
	public int getLength() {
		int length=0;
		for(Track track: tracks) {
			length += track.getLength();
		}
		return length;
	}
}
