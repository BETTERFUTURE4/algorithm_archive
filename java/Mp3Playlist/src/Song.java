public class Song {
	public final String name;
	public final Artist artist;
	public final Album album;

	public Song(String name, Artist artist, Album album) {
		this.name = name;
		this.artist = artist;
		this.album = album;
	}

	public String toString() {
		return name + " - " + artist.name + "\n"
			+ album.name + "(" + album.year + ")";
	}
}
