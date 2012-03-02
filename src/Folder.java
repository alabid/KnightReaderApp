import java.util.*;

/**
 * Feed class
 *
 */
public class Folder {
	private String tagName;
	private ArrayList<String> feedList;

	
	Folder(String name, ArrayList<String> feeds){
		tagName = name;
		feedList = feeds;
		}
	
	public void setName(String newName){
		tagName = newName;
	}	
		
	public String getName(){
		return tagName;
	}
	
	public ArrayList<String> getFeeds(){
		return feedList;
	}
	
	public void addFeed(String newFeed){
		feedList.add(newFeed);
	}
	
	public void deleteFeed(String delFeed){
		feedList.remove(delFeed);
		
	}
	
	
	public void print(){
		for (String item: feedList){
		System.out.println(item);
		}
		}
		
	
	
	public static void main(String[] args) {
		ArrayList<String> newlist = new ArrayList<String>();
		newlist.add("feed1");
		newlist.add("feed2");
		newlist.add("feed3");
		newlist.add("feed4");
		newlist.add("feed5");
		Folder bin = new Folder("news", newlist);
		bin.print();
		System.out.println(bin.getName());
		System.out.println("news");
		bin.addFeed("feed10");
		bin.deleteFeed("feed9");
		bin.deleteFeed("feed1");
		bin.print();
		
		

	}

}
