package testVagrant;

import java.util.LinkedList;

public class Playlist 
{
	    private LinkedList<String> songs;
	    private int capacity;
	    
	    public Playlist(int capacity) 
	    {
	        this.songs = new LinkedList<>();
	        this.capacity = capacity;
	    }
	    
	    public void playSong(String song)
	    {
	        if (songs.size() >= capacity) 
	        {
	            songs.removeFirst(); // Remove the oldest song
	        }
	        songs.addLast(song); // Add the new song to the end
	    }
	    
	    public void displayPlaylist() 
	    {
	        for (String song : songs) 
	        {
	            System.out.print(song + " ");
	        }
	        System.out.println();
	    }
	    
	    public static void main(String[] args) 
	    {
	        Playlist playlist = new Playlist(3);
	        playlist.playSong("S1");
	        playlist.playSong("S2");
	        playlist.playSong("S3");
	        playlist.displayPlaylist(); // Output: S1 S2 S3
	        playlist.playSong("S4");
	        playlist.displayPlaylist(); // Output: S2 S3 S4
	        playlist.playSong("S2");
	        playlist.displayPlaylist(); // Output: S3 S4 S2
	        playlist.playSong("S1");
	        playlist.displayPlaylist(); // Output: S4 S2 S1
	    }
	

}
