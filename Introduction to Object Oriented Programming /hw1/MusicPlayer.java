package hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import speccheck.Specified;

/**
 * A MusicPlayer object models a simple music player application that can be tuned to play a playlist within a given variety of music categories. A range of categories indicate a certain
 * variety of music, and is indicated by the current category number. Each category has a certain number of playlists you can select from.
 * 
 * @author Emin Okic
 */

@Specified
public class MusicPlayer extends Object
{
	/**
	 * Amount the volume changes for each volumeUp or volumeDown operation set to an increment of 0.1.
	 */
	@Specified
	public static final double VOLUME_INCREMENT = 0.1;

	//Variables
	//Private
		//Playlist Variables
	private int playlist;
		//Category Variables
			//
	private int numCategories;
	private int numOfPlaylist;
	private int currentCategoryNumber;
	private int catSize;
		//Etc.
	private double volume;
	private String fileName;

	/**
	 * Constructs a player with the number of categories, size of each category and the file name containing the names of the playlists. 
	 * Initially the volume is 0.0 and current category is 0.
	 * 
	 * @param givenNumCategories
	 *            total number of Categories
	 * @param givenCategorySize
	 *            number of playlists in each Category
	 * @param givenFilename
	 *            filename containing list of names of playlists
	 */
	
	@Specified
	public MusicPlayer(int givenNumCategories, int givenCategorySize, String givenFilename)
	{
		numCategories = givenNumCategories;
		numOfPlaylist = givenCategorySize * givenNumCategories;
		catSize = givenCategorySize;
		fileName = givenFilename;
		
		volume = 0.0;
		currentCategoryNumber = 0;
	}

	/**
	 * Returns the current category number.
	 * 
	 * @return current category number
	 */
	@Specified
	public int getCategory()
	{
		return currentCategoryNumber;
	}
	
	/**
	 * Sets the category to the given category number. 
	 * If negative, the category number is set to 0, and if greater than the number of categories, the category is set to n-1, where n is the number of
	 * categories. 
	 * Once it selects a category, it then selects a random playlist from that category.
	 * 
	 * @param givenCategoryNumber
	 *            given category number to be set
	 */
	@Specified
	public void setCategory(int givenCategoryNumber)
	{
		if (givenCategoryNumber < 0) {
			currentCategoryNumber = 0;
		} else if (givenCategoryNumber > numCategories-1) {
			currentCategoryNumber = numCategories-1;
		} else {
			currentCategoryNumber = givenCategoryNumber;
		}	
	}
			
	/**
	 * Returns the name of the current playlist from the current playlist number by searching the input file.
	 * 
	 * @return playlist name for the current playlist
	 * @throws FileNotFoundException if file not found, throws exception
	 */
	@Specified
	public String getPlaylist() throws FileNotFoundException
	{
			Scanner scan = new Scanner(new File(fileName));
			for(int i=0; i<playlist; i++)
				scan.next();
				String name = scan.next();
				scan.close();
				return name;
	}

	/**
	 * Sets the playlist to the given playlist number. 
	 * If negative, the playlist number is set to 0, and if greater than the number of playlists, the playlist number is set to n-1, where n is the number of
	 * playlists. 
	 * The method also updates the category number to the category in which the new playlist is a part of.
	 * 
	 * @param givenPlaylistNumber
	 *            given playlist number to be set
	 */
	@Specified
	public void setPlaylist(int givenPlaylistNumber)
	{
		playlist = givenPlaylistNumber;
		if (givenPlaylistNumber < 0) {
			playlist = 0;
		} else if (givenPlaylistNumber > numCategories*catSize-1) {
			playlist = numCategories*catSize-1;
		}	
		currentCategoryNumber = playlist / catSize;
	}

	/**
	 * Returns the current volume.
	 * 
	 * @return current volume
	 */
	@Specified
	public double getVolume()
	{
		return volume;
	}

	/**
	 * Sets the music player to the previous category number before the current one, wrapping around to category n-1 when the current category is 0 (where n is the number of categories).
	 * Once it selects a category, it then selects a random playlist from that category (similar to setPlaylistFromCategory() method). 
	 * eg: If number of categories is 6, then a previousCategory() from category 0 should be category 5. And the new playlist will be a random playlist in category 5.
	 */
	@Specified
	public void previousCategory()
	{
		if (currentCategoryNumber <= 0) {
			currentCategoryNumber = numCategories;
			currentCategoryNumber--;
		} else if (currentCategoryNumber > 0) {
			currentCategoryNumber--;
		}
	}
	
	/**
	 * Sets the music player to the next category number before the current one, wrapping around to category 0 when the current category is n-1 (where n is the number of categories).
	 * Once it selects a category, it then selects a random playlist from that category (similar to setPlaylistFromCategory() method). 
	 * eg: If number of categories is 6, then a nextCategory() from category 5 should be category 0. And the new playlist will be a random playlist in category 0.
	 */
	@Specified
	public void nextCategory()
	{
		if (currentCategoryNumber == (numCategories - 1)) {
			currentCategoryNumber = 0;
		} else if(currentCategoryNumber < numCategories) {
			currentCategoryNumber++;
		}
	}

	/**
	 * Sets the music player to the previous playlist number before the current one within a category, wrapping around to playlist n-1 when the current playlist is 0 (where n is the number of playlists within a category). 
	 * eg: If category number is 0 and there are 6 playlists in each category, then a previousPlaylist() from playlist 0 should be playlist 5.
	 */
	@Specified
	public void previousPlaylist()
	{
		playlist--;
		if(playlist < 0){
			playlist = numOfPlaylist / catSize-1;
		}
	}
	
	/**
	 * Sets the music player to the next playlist number after the current one within a category, wrapping around to playlist 0 when the current playlist is n-1 (where n is the number of playlists within a category). 
	 * eg: If category number is 0 and there are 6 playlists in each category, then a nextPlaylist() from playlist 5 should be playlist 0.
	 */
	@Specified
	public void nextPlaylist()
	{
		playlist++;
		if(playlist>((currentCategoryNumber+1)*catSize)-1){
			playlist = currentCategoryNumber * catSize;
		} 
	}
	
	/**
	 * Decreases the volume by <code>VOLUME_INCREMENT</code>, not going below 0.0.
	 */
	@Specified
	public void volumeDown()
	{
		volume = volume - VOLUME_INCREMENT;
		volume = Math.max(volume, 0.0);
	}

	/**
	 * Increases the volume by <code>VOLUME_INCREMENT</code>, not going above 1.0.
	 */
	@Specified
	public void volumeUp()
	{
		volume = volume + VOLUME_INCREMENT;
		volume = Math.min(volume, 1.0);	}
}