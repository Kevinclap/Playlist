
public class Song {

	private String title;
	private String genre;
	private String artist;
	private int duration;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Title: " + title + " Genre: " + genre + " Artist: " + artist + " Duration: " + duration;
	}

	public Song(String title, String genre, String artist, int duration) {

		this.title = title;
		this.genre = genre;
		this.artist = artist;
		this.duration = duration;
	}

}
