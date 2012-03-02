import java.util.*;

/**
 * Feed class
 *
 */
public class Story {
	private String storyTitle;
	private String storyDate;
	
	Story(String title, String date){
		storyTitle = title;
		storyDate = date;
		}
	
	public void setStoryTitle(String newTitle){
		storyTitle = newTitle;
	}
	
	public void setDate (String newDate){
		storyDate = newDate;
	}

		
	public String getTitle(){
		return storyTitle;
	}
	
	public String getDate(){
		return storyDate;
	}
	
	
	public void print(){
		System.out.println(storyTitle + " " + storyDate + " " );
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
