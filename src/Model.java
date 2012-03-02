import java.io.*;
import java.util.*;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 



public class Model {
	public ArrayList<Folder> tagList = new ArrayList<Folder>();
	
	public Model(){

		try{
		String dir = System.getProperty("user.dir");
		File file = new File( dir + "/tags/");
		String[] tagFiles = file.list();

		for (String item : tagFiles) {	
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse (new File(dir + "/tags/" + item));

        NodeList nameList = doc.getElementsByTagName("Name");
        Node tagTitle = nameList.item(0);
        String title = tagTitle.getFirstChild().getNodeValue();

        NodeList listOfFeeds = doc.getElementsByTagName("Feed");
        ArrayList<String> feedList = new ArrayList<String>();
        for(int s=0; s<listOfFeeds.getLength() ; s++){
            Node feedNode = listOfFeeds.item(s);
            String feedName = feedNode.getFirstChild().getNodeValue();
            feedList.add(feedName);}
        	
        Folder newTag = new Folder(title,feedList);
		this.tagList.add(newTag);
		}
			
		
		}
		catch (SAXParseException err) {
		    System.out.println ("** Parsing error" + ", line " 
		         + err.getLineNumber () + ", uri " + err.getSystemId ());
		    System.out.println(" " + err.getMessage ());
	    }
		catch (SAXException e) {
		    Exception x = e.getException ();
		    ((x == null) ? e : x).printStackTrace ();
		}
		catch (Throwable t) {
		    t.printStackTrace ();
		}
		
	}


	
	
	public void addTag(Folder newFolder){
		tagList.add(newFolder);	
	}
	
	public ArrayList<Folder> getTags(){
		return this.tagList;	
	}

/*	
	
	public void addFeed(String newFeed, int tagIndex){
		this.tagList.set(tagIndex, this.tagList.get(tagIndex).addFeed(newFeed));
		
		
	}
	
	public ArrayList<Feed> getAllFeeds(){
		
	}
	
	public ArrayList<Feed> getTagFeeds(Folder fromTag){
		
	}

	public ArrayList<Story> getFeedStories(Feed fromFeed){
		
	}
	
	public ArrayList<Story> getUnreadStories(Feed fromFeed){
		
	}
*/	
	
	
	
	public static void main(String[] args) {
		Model model = new Model();
			ArrayList<Folder> modelList = model.getTags();
			for (Folder i:modelList){
				System.out.println(i.getName());
			}
			
//		}
		
		
	}

}