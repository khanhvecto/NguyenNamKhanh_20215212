package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public void play() {
		for(Track track: tracks) {
			track.play();
		}
	}
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
		super();
	}
	public String getArtist() {
		return artist;
	}
	
	public boolean checkTrack(Track trackName) {
		for(Track track: tracks) {
			if(track.equals(trackName)) return true;
		}
		return false;
	}
	public void addTrack(Track trackName) {
		if(checkTrack(trackName)) System.out.println("Track is existed");
		else {
			tracks.add(trackName);
			System.out.println("Track is added");
		}
	}
	public void removeTrack(Track trackName) {
		if(checkTrack(trackName)) {
			tracks.remove(trackName);
			System.out.println("Track is removed");
		} else System.out.println("Track is not existed");
	}
	public int getLength() {
		int length=0;
		for(Track track: tracks) {
			length += track.getLength();
		}
		return length;
	}
}
