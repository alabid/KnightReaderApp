import java.util.*;

/**
 * Feed class
 *
 */
public class Feed {
	private String feedTitle;
	private String feedUrl;
	private String lastTime;
	private ArrayList<Story> feedEntries = new ArrayList<Story>();
	
	Feed(String title, String url, String last , ArrayList<Story> entries){
		feedTitle = title;
		feedUrl = url;
		lastTime = last;
		feedEntries = entries;
	}
	
	public void setFeedTitle(String newTitle){
		feedTitle = newTitle;
	}
	
	public void setUrl(String newUrl){
		feedUrl = newUrl;
	}

	public void setLast(String newLast){
		lastTime = newLast;
	}

	public void addStory(Story newStory){
		feedEntries.add(newStory);
	}
		
	public String getUrl(){
		return feedUrl;
	}
	
	public String getTitle(){
		return feedTitle;
	}
	
	public String getLastTime(){
		return lastTime;
	}

	public ArrayList<Story> getEntries(){
		return feedEntries;
	}
	
	public void print(){
		System.out.println(feedTitle + " " + feedUrl + " "  + lastTime + " ");
/*		for (String[] info : details){	
			for(String item : info){
				System.out.print(item + " ");
			}
			System.out.println();
		}*/
		
	}
	
	
	public static void main(String[] args) {
//		Story story1 = new Story("blah1", "blah2");
//		ArrayList<Story> storyList = new ArrayList<Story>();
//		storyList.add(story1);
//		Feed feed1 = new Feed("Pearls Before Swine", "http://feeds.feedburner.com/comicsdotcomrss_pearls_before_swine", "2011-05-31 18:15:41", storyList);
//		System.out.println(feed1.getTitle());
//		System.out.println(feed1.getEntries());

	}

}
