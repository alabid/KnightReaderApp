import org.junit.*; 
import static org.junit.Assert.*; 
import java.util.*;


public class FolderTest {

	public ArrayList<String> trialArray;	
	public Folder tag;

    @Test 
    public void testGetName() { 
    	ArrayList<String> trialArray = new ArrayList<String>();	
    	trialArray.add("trialFeed1");
    	Folder tag = new Folder("trialTag", trialArray);
    	assertEquals("Titles should be equal","trialTag", tag.getName());
    } 
    @Test 

    public void testLength() { 
    	ArrayList<String> trialArray = new ArrayList<String>();	
    	Folder tag = new Folder("trialTag", trialArray);
    	tag.addFeed("trialFeed1");
    	tag.addFeed("trialFeed2");
    	tag.addFeed("trialFeed3");
    	tag.addFeed("trialFeed4");
    	assertEquals("tag should contain 4 feeds",4, tag.getFeeds().size());
    } 



}