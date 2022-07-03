import java.util.ArrayList;

public class Album {
	public final String name;
	public final int year;
	public final Artist artist;
	private final ArrayList<Song> tracks = new ArrayList<>();

	public Album(String name, int year, Artist artist) {
		this.name = name;
		this.year = year;
		this.artist = artist;
	}

	public void addTrack(Song song) {
		this.tracks.add(song);
	}

	public Song getTrack(int num) {
		return tracks.get(num - 1);
	}
}