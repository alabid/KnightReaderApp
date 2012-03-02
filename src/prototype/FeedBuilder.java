package prototype;


import java.net.URL;
import java.net.MalformedURLException;

import it.sauronsoftware.feed4j.FeedParser;
import it.sauronsoftware.feed4j.bean.Feed;
import it.sauronsoftware.feed4j.bean.FeedHeader;
import it.sauronsoftware.feed4j.bean.FeedItem;

import it.sauronsoftware.feed4j.FeedIOException;
import it.sauronsoftware.feed4j.FeedXMLParseException;
import it.sauronsoftware.feed4j.UnsupportedFeedException;


/**
 * A prototype class for building Feed objects. 
 * 
 * Currently uses the old version of feed4j; therefore, Feed objects
 * and FeedItem objects won't necessarily have date information.
 * 
 * The date information they do have will be in the form of
 * Date objects.
 * 
 * @author Michael Domingues
*/
public abstract class FeedBuilder {

	/**
	 * Builds a Feed object from the given urlString and returns it.
	 * 
	 * If errors are encountered, an empty Feed will be returned
	 * with its title set to a specific message.
	 * 
	 * @param   urlString  A String containing a valid URL.
	 * @return  feed       A Feed object.
	 */
	public static Feed buildFeed(String urlString) {
		try {
			URL url = new URL(urlString);
			Feed feed = FeedParser.parse(url);
			FeedHeader header = feed.getHeader();
			// Set the feed's link back to the feed's actual URL.
			header.setLink(url);
			return feed;
		}
		catch (MalformedURLException e) {
			Feed feed = new Feed();
			FeedHeader header = new FeedHeader();
			header.setTitle("Malformed URL");
			feed.setHeader(header);
			return feed;
		}
		catch (FeedIOException e) {
			Feed feed = new Feed();
			FeedHeader header = new FeedHeader();
			header.setTitle("IO Error");
			feed.setHeader(header);
			return feed;			
		}
		catch (FeedXMLParseException e) {
			Feed feed = new Feed();
			FeedHeader header = new FeedHeader();
			header.setTitle("Parse Error");
			feed.setHeader(header);
			return feed;			
		}
		catch (UnsupportedFeedException e) {
			Feed feed = new Feed();
			FeedHeader header = new FeedHeader();
			header.setTitle("Unsupported Feed");
			feed.setHeader(header);
			return feed;			
		}
	}
	
	/**
	 * Tests the buildFeed method on a known good RSS feed.
	 * 
	 * @return void
	*/
	public static void main(String[] args) {
		
		String urlString = "http://www.xkcd.com/rss.xml";
		Feed feed = buildFeed(urlString);
		FeedHeader header = feed.getHeader();
		
		// Print some basic information about the feed.
		System.out.println(header.getTitle());
		System.out.println("Feed URL: " + header.getLink());
		System.out.println("================\n");
		
		// Print the items enclosed in the feed.
		int numItems = feed.getItemCount();
		for (int i = 0; i < numItems; i++) {
			FeedItem item = feed.getItem(i);
			System.out.println("Title: " + item.getTitle());
			System.out.println("Publication Date: " + item.getPubDate());
			System.out.println("Link: " + item.getLink());
			System.out.println("Text Description: " + item.getDescriptionAsText());
			System.out.println("HTML Description: " + item.getDescriptionAsHTML());
			System.out.print("\n");
		}
	}
}
