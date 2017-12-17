import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class SongTestD {

	public static void main(String args[]) {
		ArrayList<Song> playlist = new ArrayList<Song>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			System.out.println("Enter the title: ");
			String title = sc.nextLine();
			System.out.println("Enter the genre: ");
			String genre = sc.nextLine();
			System.out.println("Enter the artist: ");
			String artist = sc.nextLine();
			System.out.println("Enter the song duration: ");
			int duration = sc.nextInt();
			sc.nextLine();

			Song anotherSong = new Song(title, genre, artist, duration);

			/* This is how elements should be added to the array list */
			playlist.add(anotherSong);

			/* Displaying array list elements */
			//System.out.println("This is your current playlist:" + playlist);
			
			System.out.println("This is your current playlist:");
			
			for (Song song : playlist) {
				System.out.println("Title:" + song.getTitle());
			}

		}
		sc.close();
	}
}