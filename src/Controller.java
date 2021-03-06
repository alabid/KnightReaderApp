import java.io.*;
import java.util.*;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class Controller {	
	public void makeDir(String dirName){		
		try{
  		String newDir =dirName;
  		new File(newDir).mkdir();
  		} 
  		catch (Exception e){
  		System.err.println("Error: " + e.getMessage());
  		}
	}

	public String fileNamer(String fileTitle, String destination){
		String dir = System.getProperty("user.dir");
		String fileName = fileTitle.replaceAll(" ","");
		String filePath = dir + destination + fileName + ".xml";
		return filePath;	
	}

	public void deleteXml(String xmlName){
		File file = new File(xmlName);
	   
    	if (!file.exists())
    		  throw new IllegalArgumentException(xmlName + " does not exist");

    	if (!file.canWrite())
    		  throw new IllegalArgumentException("cannot delete:" + xmlName + "xml");

    	boolean success = file.delete();

    	if (!success)
    		  throw new IllegalArgumentException("deletion failed");

	}

	private Document buildDocument() throws ParserConfigurationException {

            DocumentBuilderFactory docfac = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docfac.newDocumentBuilder();
            Document document = docBuilder.newDocument();
            return document;
	}
	
	private Transformer transformerBuilder() throws TransformerConfigurationException {
			//transform
            TransformerFactory transfac = TransformerFactory.newInstance();
            Transformer transformer = transfac.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			return transformer;
	}
	
	private String XmlStringMaker(Document document, Transformer transformer) throws TransformerException {
			//make xml string
            StringWriter stringwriter = new StringWriter();
            StreamResult end = new StreamResult(stringwriter);
            DOMSource start = new DOMSource(document);
            transformer.transform(start, end);
            String xmlString = stringwriter.toString();
            System.out.println("Here's the xml:\n\n" + xmlString);
			return xmlString;	
	}
	
	private void XmlFileWriter(File file, String xmlString){
			try { 
			BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			bufferedwriter.write(xmlString);
			bufferedwriter.flush();
			bufferedwriter.close();
			
			} catch (Exception e) {
            System.out.println(e);
        }

	}    


	public void generateFolderXml(Folder tag){

	  try {

            Document doc = this.buildDocument();

      		Node root = doc.createElement("Tag");
			doc.appendChild(root);			
			Node tagName = doc.createElement("Name");
			root.appendChild(tagName);
			tagName.appendChild(doc.createTextNode(tag.getName()));

			Node feed;			
			ArrayList<String> feedList = tag.getFeeds();
			
			for (String item : feedList){	
			feed = doc.createElement("Feed");
      		root.appendChild(feed);  
      		feed.appendChild(doc.createTextNode(item));
			}

			//transform
            Transformer trans = this.transformerBuilder();

			//make xml string
            String xmlString = this.XmlStringMaker(doc, trans);

            //print xml
            System.out.println("Here's the xml:\n\n" + xmlString);

			//make xml file
			String dir = System.getProperty("user.dir");
			String fileName = tag.getName().replaceAll(" ","");
			File file = new File( dir + "/tags/" + fileName + ".xml");
			this.XmlFileWriter(file, xmlString);

        } catch (Exception e) {
            System.out.println(e);
        }
		}

	public void generateFeedXml(Feed feed){

	  try {
            Document doc = this.buildDocument();
      		Node root = doc.createElement("Feed");
			doc.appendChild(root);			
			Node feedTitle = doc.createElement("Title");
			root.appendChild(feedTitle);
			feedTitle.appendChild(doc.createTextNode(feed.getTitle()));
			Node lastTime = doc.createElement("LastTime");
			root.appendChild(lastTime);
			lastTime.appendChild(doc.createTextNode(feed.getLastTime()));
			Node url = doc.createElement("URL");
			root.appendChild(url);
			url.appendChild(doc.createTextNode(feed.getUrl()));

			Node entry;
			Node date;
			Node title;
			
			ArrayList<Story> entryList = feed.getEntries();
			
			for (Story item : entryList){	
			entry = doc.createElement("Entry");
      		root.appendChild(entry);  
      		date = doc.createElement("Date");
      		entry.appendChild(date);
      		date.appendChild(doc.createTextNode(item.getDate()));
      		title = doc.createElement("Title");
      		entry.appendChild(title);
      		title.appendChild(doc.createTextNode(item.getTitle()));
			}

			//transform
            Transformer trans = this.transformerBuilder();

			//make xml string
            String xmlString = this.XmlStringMaker(doc, trans);

            //print xml
            System.out.println("Here's the xml:\n\n" + xmlString);

			//make xml file
			String dir = System.getProperty("user.dir");
			String fileName = feed.getTitle().replaceAll(" ","");
			
			File file = new File( dir + "/data/" + fileName + ".xml");
			this.XmlFileWriter(file, xmlString);
	
        } catch (Exception e) {
            System.out.println(e);
        }

		}


    public static void main (String args[]) {
    	
    	
    	Controller mainController = new Controller();
    	mainController.makeDir("data");
    	mainController.makeDir("tags");

    	ArrayList<String> newlist1 = new ArrayList<String>();
		newlist1.add("feed1");
		newlist1.add("feed2");
		newlist1.add("feed3");
		newlist1.add("feed4");
		newlist1.add("feed5");
		Folder bin1 = new Folder("news", newlist1);
		mainController.generateFolderXml(bin1);

		ArrayList<String> newlist2 = new ArrayList<String>();
		newlist2.add("blah1");
		newlist2.add("blah2");
		newlist2.add("blah3");
		newlist2.add("blah4");
		Folder bin2 = new Folder("fun", newlist2);
		mainController.generateFolderXml(bin2);

		ArrayList<String> newlist3 = new ArrayList<String>();
		Folder bin3 = new Folder("sports", newlist3);
		mainController.generateFolderXml(bin3);
		
		
//		mainController.deleteXml(mainController.fileNamer(bin.getName(), "/tags/"));
    	
    }
    
    }

	
	
	
	


