package gui;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
 * KnightReaderFeedsListView.java
 *
 * Created on May 29, 2011, 10:39:27 AM
 */

/**
 *
 * @author Daniel
 */

/**
 * TODO:
 * We want to make sure that we can select an item in only one of the JLists
 * available.
 * define the data format that the application is going to use.
 * 
 * 
 * TODO:
 * Here comes the controller:
 * Use the controller class to switch between views. 
 * 
 * So this "basic" view (without the feedsTableViewPanel will be our core abstract class.
 * With it, it will be one of our views.
 * with the other components. It could be .....
 */


public class KnightReaderView extends JFrame {
	
	// BLOCK OF CODE DECLARING THE GRAPHIC ELEMENTS IN THE JFRAME
	// They are all declared private because we don't want any other access except
	// from the view. In order words, we are restricting access to these elements.
	
	private JButton subscribeButton, newFolderButton, refreshAllButton;
    private JButton markAllAsReadButton, searchButton;
    
    private JMenu fileMenu;
    private JMenu viewMenu;
    private JMenu sortFeedsMenu;
    private JMenu sortEntriesMenu;
    private JMenu aboutMenu;
    private JMenu editMenu;
    private JMenuBar menuBar;
    private JMenuItem newSubscriptionMenuItem;
    private JMenuItem entriesDateMenuItem;
    private JMenuItem newFolderMenuItem;
    private JMenuItem exitMenuItem;
    private JMenuItem refreshAllFeedsMenuItem;
    private JMenuItem feedTitleMenuItem;
    private JMenuItem feedDateMenuItem;
    private JMenuItem unsubscribeMenuItem;
    private JMenuItem renameFolderMenuItem;
    private JMenuItem entriesTitleMenuItem;
    private JPanel overAllPanel;
    private JPanel feedsTableViewPanel;
    private JPanel changeViewsPanel;
    private JPanel browserViewPanel;
    
    private ArrayList<DefaultListModel> listOfJListModels;
    private ArrayList<JList> listOfJLists;
 
    private JPopupMenu.Separator fileMenuSeperator;
    private JTextField searchField;
    private JTable entriesTable;
    private JScrollPane leftSideScrollPane;
    private JPanel leftSidePanel;
    private JMenuItem deleteFolderMenuItem;
    private JLabel label;
	
	// END OF DECLARATIONS
	
	

    /** 
     * Creates new form KnightReaderFeedsListView
     * 
     **/
    public KnightReaderView() {
        super("Knight Reader Application");
        initComponents(); 
        
        // initializes all the components required for the display of the 
        // first and subsequent views.
    }
    
    
    /**
     * initComponents initializes all the graphics and packs them into the frame.
     */
    private void initComponents() {

        overAllPanel = new JPanel();
        subscribeButton = new JButton();
        newFolderButton = new JButton();
        refreshAllButton = new JButton();
        markAllAsReadButton = new JButton();
        searchField = new JTextField();
        searchButton = new JButton();
        feedsTableViewPanel = new JPanel();
       
        menuBar = new JMenuBar();
        fileMenu = new JMenu();
        newSubscriptionMenuItem = new JMenuItem();
        newFolderMenuItem = new JMenuItem();
        refreshAllFeedsMenuItem = new JMenuItem();
        fileMenuSeperator = new JPopupMenu.Separator();
        exitMenuItem = new JMenuItem();
        editMenu = new JMenu();
        unsubscribeMenuItem = new JMenuItem();
        renameFolderMenuItem = new JMenuItem();
        viewMenu = new JMenu();
        sortFeedsMenu = new JMenu();
        feedTitleMenuItem = new JMenuItem();
        feedDateMenuItem = new JMenuItem();
        sortEntriesMenu = new JMenu();
        entriesTitleMenuItem = new JMenuItem();
        entriesDateMenuItem = new JMenuItem();
        aboutMenu = new JMenu();
        
        //JScrollPane leftSideBarScrollPane = new JScrollPane(leftSideBar);
        populateTable();
        
    	

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        subscribeButton.setFont(new java.awt.Font("Verdana", 0, 11));
        subscribeButton.setIcon(new ImageIcon(getClass().getResource("/subscribeImage.png"))); // NOI18N
        subscribeButton.setText("Subscribe");
        subscribeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String str = JOptionPane.showInputDialog(null, "Enter some text : ", 
            			"Roseindia.net", 1);
            	Object[] possibilities = {"ham", "spam", "yam"};
            	String s = (String)JOptionPane.showInputDialog(
            	                    null,
            	                    "Complete the sentence:\n"
            	                    + "\"Green eggs and...\"",
            	                    "Customized Dialog",
            	                    JOptionPane.PLAIN_MESSAGE,
            	                    new ImageIcon("/unreadImage.png"),
            	                    possibilities,
            	                    "ham");

            	//If a string was returned, say so.
            	if ((s != null) && (s.length() > 0)) {
            	    //setLabel("Green eggs and... " + s + "!");
            	    return;
            	}

            	//If you're here, the return value was null/empty.
            	//setLabel("Come on, finish the sentence!");
            			  else
            			  JOptionPane.showMessageDialog(null, "You pressed cancel button.", 
            			"Roseindia.net", 1);
            }
        });

        newFolderButton.setFont(new java.awt.Font("Verdana", 0, 11));
        newFolderButton.setIcon(new ImageIcon(getClass().getResource("/newFolderImage.png"))); 
        newFolderButton.setText("New Folder");
        newFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String str = JOptionPane.showInputDialog(null, "Enter some text : ", 
            			"Roseindia.net", 1);
            			  if(str != null)
            			  JOptionPane.showMessageDialog(null, "You entered the text : " + str, 
            			"Roseindia.net", 1);
            			  else
            			  JOptionPane.showMessageDialog(null, "You pressed cancel button.", 
            			"Roseindia.net", 1);
            }
        });

        refreshAllButton.setFont(new java.awt.Font("Verdana", 0, 11));
        refreshAllButton.setIcon(new ImageIcon(getClass().getResource("/refreshImage.png")));
        refreshAllButton.setText("Refresh All");

        markAllAsReadButton.setFont(new java.awt.Font("Verdana", 0, 11));
        markAllAsReadButton.setIcon(new ImageIcon(getClass().getResource("/markAllAsReadImage.png"))); 
        markAllAsReadButton.setText("Mark All As Read");
        markAllAsReadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Verdana", 0, 11));
        searchField.setHorizontalAlignment(JTextField.TRAILING);
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        searchButton.setIcon(new ImageIcon(getClass().getResource("/searchImage.png"))); 
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        
       entriesTable.setGridColor(Color.BLACK);
        entriesTable.setAutoCreateRowSorter(true);
        entriesTable.setFillsViewportHeight(true);
        entriesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane feedsTableScrollPane = new JScrollPane(entriesTable);
        
        //JTextArea textArea = new JTextArea();
        JTextPane entryInfoArea = new JTextPane();
        entryInfoArea.setContentType("text/html");
        
        /**
         * I am now going to populate the text Area with whatever stuff I need to put
         * there. Check this out!
         * 
         * Remember to put some padding within the whole textPane itself such that text won't touch the edges of the TextPane.
         */
        String title = "<p style='background-color:blue;font-size:16px;margin:6px;padding:4px;'>This is the first KnightReader Application Story!</p>";
        String date = "<p style='background-color:yellow;font-size:16px;margin:6px;padding:4px;'>May 4, 2011 73:37:37</p>";
        String dummyString = "<p><i>This is just anything! anything!! anything! For now this is dummy but soon, I mean very soon, it" +
        		"is going to become something more spectacular, more gracious, more splendid.</i><p>";
        dummyString += "<a href='http://javateamawesome.wordpress.com'>Java team awesome blog (this should be a READ MORE)</a>";
        
        entryInfoArea.setText(title + date + dummyString);
        entryInfoArea.setEditable(false);

    	JScrollPane entryInfoAreaScrollPane = new JScrollPane(entryInfoArea);
        /*
         * End of population of the table
         */
//    	browserViewPanel = new JPanel();
//    	browserViewPanel.add(new JLabel("something"));
//        changeViewsPanel = new JPanel(new CardLayout());
//        changeViewsPanel.add(feedsTableViewPanel);
//        changeViewsPanel.add(browserViewPanel);
//        
        

        GroupLayout gl_feedsTableViewPanel = new GroupLayout(feedsTableViewPanel);
        gl_feedsTableViewPanel.setHorizontalGroup(
        	gl_feedsTableViewPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_feedsTableViewPanel.createSequentialGroup()
        			.addGap(3)
        			.addGroup(gl_feedsTableViewPanel.createParallelGroup(Alignment.LEADING)
        				.addComponent(entryInfoAreaScrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        				.addComponent(feedsTableScrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_feedsTableViewPanel.setVerticalGroup(
        	gl_feedsTableViewPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_feedsTableViewPanel.createSequentialGroup()
        			.addComponent(feedsTableScrollPane, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(entryInfoAreaScrollPane, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
        );
        feedsTableViewPanel.setLayout(gl_feedsTableViewPanel);
        
        leftSideScrollPane = new JScrollPane();

        GroupLayout gl_overAllPanel = new GroupLayout(overAllPanel);
        gl_overAllPanel.setHorizontalGroup(
        	gl_overAllPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_overAllPanel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_overAllPanel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_overAllPanel.createSequentialGroup()
        					.addComponent(subscribeButton)
        					.addGap(18)
        					.addComponent(newFolderButton)
        					.addGap(18)
        					.addComponent(refreshAllButton)
        					.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
        					.addComponent(markAllAsReadButton)
        					.addGap(18)
        					.addComponent(searchField, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        					.addGap(10))
        				.addGroup(gl_overAllPanel.createSequentialGroup()
        					.addComponent(leftSideScrollPane, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(feedsTableViewPanel, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        gl_overAllPanel.setVerticalGroup(
        	gl_overAllPanel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_overAllPanel.createSequentialGroup()
        			.addGroup(gl_overAllPanel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_overAllPanel.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(gl_overAllPanel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(subscribeButton)
        						.addComponent(newFolderButton)
        						.addComponent(refreshAllButton)
        						.addComponent(markAllAsReadButton)
        						.addComponent(searchField, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        					.addGap(29))
        				.addGroup(gl_overAllPanel.createSequentialGroup()
        					.addGap(20)
        					.addComponent(searchButton)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(gl_overAllPanel.createParallelGroup(Alignment.LEADING)
        				.addComponent(feedsTableViewPanel, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        				.addComponent(leftSideScrollPane, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        
        populateLeftSidePanel();
     
        
        
    overAllPanel.setLayout(gl_overAllPanel);

        menuBar.setPreferredSize(new java.awt.Dimension(146, 25));

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Verdana", 0, 12));

        newSubscriptionMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        newSubscriptionMenuItem.setText("New Subscription...");
        fileMenu.add(newSubscriptionMenuItem);

        newFolderMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        newFolderMenuItem.setText("New Folder...");
        fileMenu.add(newFolderMenuItem);

        refreshAllFeedsMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        refreshAllFeedsMenuItem.setText("Refresh All Feeds...");
        fileMenu.add(refreshAllFeedsMenuItem);
        fileMenu.add(fileMenuSeperator);

        exitMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.setFont(new java.awt.Font("Verdana", 0, 12));

        unsubscribeMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        unsubscribeMenuItem.setText("Unsubscribe...");
        editMenu.add(unsubscribeMenuItem);

        renameFolderMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        renameFolderMenuItem.setText("Rename Folder...");
        editMenu.add(renameFolderMenuItem);

        menuBar.add(editMenu);
        
        deleteFolderMenuItem = new JMenuItem("Delete Folder...");
        deleteFolderMenuItem.setFont(new Font("Verdana", Font.PLAIN, 12));
        editMenu.add(deleteFolderMenuItem);

        viewMenu.setText("View");
        viewMenu.setFont(new java.awt.Font("Verdana", 0, 12));

        sortFeedsMenu.setText("Sort Feeds By");
        sortFeedsMenu.setFocusable(false);
        sortFeedsMenu.setFont(new java.awt.Font("Verdana", 0, 12));

        feedTitleMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        feedTitleMenuItem.setText("Title");
        sortFeedsMenu.add(feedTitleMenuItem);

        feedDateMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        feedDateMenuItem.setText("Date");
        sortFeedsMenu.add(feedDateMenuItem);

        viewMenu.add(sortFeedsMenu);

        sortEntriesMenu.setText("Sort Entries By");
        sortEntriesMenu.setFont(new java.awt.Font("Verdana", 0, 12));

        entriesTitleMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        entriesTitleMenuItem.setText("Title");
        sortEntriesMenu.add(entriesTitleMenuItem);

        entriesDateMenuItem.setFont(new java.awt.Font("Verdana", 0, 12));
        entriesDateMenuItem.setText("Date");
        sortEntriesMenu.add(entriesDateMenuItem);

        viewMenu.add(sortEntriesMenu);

        menuBar.add(viewMenu);

        aboutMenu.setText("About");
        aboutMenu.setFocusable(false);
        aboutMenu.setFont(new java.awt.Font("Verdana", 0, 12));
        menuBar.add(aboutMenu);

        setJMenuBar(menuBar);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(overAllPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(overAllPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * This function should populate the entry table with info. from the feed
     * object that is currently selected. 
     * 
     * The sequence of calls should be something like this:
     * currentSelectedFeed = feed.getSelectedFeed();
     * feedsListTable.display(currentSelectedFeed);
     * and the feedsListTable then displays info concerning the currently
     * selected feed.
     */
    private void populateTable() {
    	String[] columnNames = {"Title", "Date" };
    	// columnNames stores the names of the columns
    	// of the table that I am about to create
    	
    	//data is array of arrays that is just 
    	// test data for now.
    	
    	int year = 2009;
        int month = 0; // January
        int date = 1;
        int hour = 10;
        int minute = 10;
        int second = 30;

        Calendar cal1 = Calendar.getInstance();
        cal1.clear();

        cal1.set(Calendar.YEAR, year);
        cal1.set(Calendar.MONTH, 1);
        cal1.set(Calendar.DATE, 3);
        cal1.set(Calendar.HOUR, hour);
        cal1.set(Calendar.MINUTE, minute);
        cal1.set(Calendar.SECOND, second);

        java.util.Date utilDate = cal1.getTime();
        System.out.println(utilDate);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.clear();

        cal2.set(Calendar.YEAR, 2010);
        cal2.set(Calendar.MONTH, 0);
        cal2.set(Calendar.DATE, 7);
        cal2.set(Calendar.HOUR, 10);
        cal2.set(Calendar.MINUTE, 10);
        cal2.set(Calendar.SECOND, 40);

        java.util.Date utilDate2 = cal2.getTime();
//        System.out.println(utilDate2);
        
    	Object[][] data = {
    		    {"Kathy", utilDate},
    		    {"John", utilDate2},
    		    {"Rowing", "20-Feb-1998 17:39:35"},
    		    {"Sue", "24-Jan-1998 17:39:35"},
    		    {"Knitting", "24-Feb-2098 17:39:35"},
    		    {"Jane", "24-July-1998 17:39:35"}, 		    	    		   
    		    {"Speed reading", "24-Feb-1998 17:39:35"},
    		    {"Joe", "24-Feb-1998 17:39:35"},
    		    {"Pool","24-Feb-1998 17:39:35"}
    		};
    	try {
    		SimpleDateFormat sampleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		//System.out.println(sampleDate.format(parseTimestamp("24-July-1998 17:39:35").
    		//		getTime()));
    		
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		System.out.println("An error occurred.");
    	}
    
    	
    	GTableModel entriesTableModel = new GTableModel(data, columnNames);
    	entriesTable= new JTable(entriesTableModel);
    	entriesTableModel.addMouseListenerToHeaderInTable(entriesTable);
    	 entriesTable = new JTable(entriesTableModel);
    	entriesTable.setModel(entriesTableModel);
    	 
    	 entriesTable.setRowHeight(30);
    	 entriesTable.setFont(new Font("Verdana", 0, 12));
    	 
    	 ListSelectionModel tableSelectionModel = entriesTable.getSelectionModel();
    	 tableSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
    	 entriesTable.setSelectionModel(tableSelectionModel);
    }
    
   private  static Calendar parseTimestamp(String timestamp) {
   /*
   ** we specify Locale.US since months are in english
   */
   SimpleDateFormat sdf = new SimpleDateFormat
     ("dd-MMM-yyyy HH:mm:ss", Locale.US);
   Date d = new Date();
try {
	d = sdf.parse(timestamp);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   Calendar cal = Calendar.getInstance();
   cal.setTime(d);
   return cal;
 }
    
    /**
     * getTagsAndFeeds returns a HashMap that contains <tag, feeds>
     * where feeds is an Array of Strings of the names of feeds under a tag.
     * 
     */    
    private HashMap<String, String[]> getTagsAndFeeds() {
    	// let's assume that the model stores data that maps each tag
    	// to its list of feeds (subscriptions).
    	
    	HashMap<String, String[]> dirsAndFeeds = new HashMap<String, String[]>();
    	
    	dirsAndFeeds.put("News", new String[] {"CNN", "NPR NEWS", 
    			"NYT > SCIENCE","Al Jazeera", "ANOTHER ONE THERE" });
    	
    	dirsAndFeeds.put("For Fun", new String[] {"xkcd", "People who talk too much on the fly",
    			"Another person who talks too much",
    			"My comedy show", "The new beginning comedy show" });
    	
    	dirsAndFeeds.put("For Shizzles", new String[] {"The bbiiggle", "the latest news in sports",
    			"THE NEW BEGINNING", "JAVA TEAM AWESOME BLOG" });
    	
    	dirsAndFeeds.put("DEFAULT", new String[] {"TRYING OUT NEW THINGS",
    		"NO NEWS ALLOWED","BALBLABLABLA", "ANOTHER ONE", "THE NEW MAN",
    		"AFTER THE MAN TALKS"});
    	
    	dirsAndFeeds.put("SOMEONE", new String[] {
    			"looking for ideas", "Already found mine"
    			, "tom and jerry(why is this here?)", "ALL READ"
    	});
    	
    	
    	return dirsAndFeeds;
    }
    
    /**
     * getNumUnreadEntries returns a HashMap that stores the number of unread
     * entries for each feed.
     * 
     * todo: We must make sure that each entry has a number associated with it.
     */
    private HashMap<String, Integer> getNumUnreadEntries() {
    	
    	HashMap<String, Integer> unreadFeedEntries = new HashMap<String, Integer>();
    	unreadFeedEntries.put("CNN", 243);
    	unreadFeedEntries.put("NPR NEWS",90 );
    	unreadFeedEntries.put("NYT > SCIENCE", 890);
    	unreadFeedEntries.put("Al Jazeera", 789);
    	unreadFeedEntries.put("xkcd", 777);
    	unreadFeedEntries.put("People who talk too much on the fly", 7880);
    	unreadFeedEntries.put("Another person who talks too much", 8732);
    	unreadFeedEntries.put("My comedy show", 890);
    	unreadFeedEntries.put("The new beginning comedy show", 890);
    	unreadFeedEntries.put("The bbiiggle", 890);
    	unreadFeedEntries.put("the latest news in sports", 890);
    	unreadFeedEntries.put("JAVA TEAM AWESOME BLOG", 890);
    	unreadFeedEntries.put("TRYING OUT NEW THINGS", 890);
    	unreadFeedEntries.put("NO NEWS ALLOWED", 890);
    	unreadFeedEntries.put("tom and jerry(why is this here?)", 890);
    	unreadFeedEntries.put("THE NEW MAN", 890);
    	unreadFeedEntries.put("Already found mine", 890);
    	unreadFeedEntries.put("looking for ideas", 890);
    	unreadFeedEntries.put("BALBLABLABLA", 890);
    	unreadFeedEntries.put("AFTER THE MAN TALKS", 890);
    	unreadFeedEntries.put("THE NEW BEGINNING", 890);
    	unreadFeedEntries.put("ANOTHER ONE THERE", 890);
    	unreadFeedEntries.put("ANOTHER ONE", 890);
    	
    	unreadFeedEntries.put("ALL READ", 0); 
    	// CASE WHERE ALL THE ENTRIES
    	// IN THIS FEED HAVE ALREADY BEEN READ.
    	
    	
    	return unreadFeedEntries;
    }
    
    /*
     * getTotalNumberUnread returns the total number of entries that the 
     * user is yet to read.
     */
    private int getTotalNumberUnread() {
    	int totalUnreadEntries = 879;
    	
    	return totalUnreadEntries;
    }
    
    /*
     * checks if the feedName is too long to fit into the JList
     */
    private boolean isFeedNameTooLong(String feedName) {
    	return (feedName.length() > 18);
    }
    
    /*
     * truncates the long feedName to a shorter one.
     * And puts an ellipsis to indicate that the feedName has
     * been truncated
     */
    private String truncateLongFeedName(String feedName) {
    	if (isFeedNameTooLong(feedName)){
    		return feedName.substring(0, 18) + "...";
    		// returns the first 13(with "...") characters in feedName
    	}
    	else return feedName;
    }
    
    private void populateLeftSidePanel() {
    	  // leftSidePanel.setLayout(new GridBagLayout());
    		leftSidePanel = new JPanel();
    	   leftSidePanel.setLayout(new BoxLayout(leftSidePanel, BoxLayout.Y_AXIS));	   
    	   leftSideScrollPane.setRowHeaderView(leftSidePanel);
          leftSideScrollPane.setViewportView(leftSidePanel);
          
//          String totalUnread = "            ("+
//          Integer.toString(getTotalNumberUnread()) + ")\n\n" ;
//          JLabel latestNewsLabel = new JLabel("Latest News" + totalUnread);
//          latestNewsLabel.setHorizontalTextPosition(SwingConstants.LEFT);
//          
//          
//          latestNewsLabel.setAlignmentY(LEFT_ALIGNMENT);
//          leftSidePanel.add(latestNewsLabel);
           
          HashMap<String, String[]> tagsAndFeeds = getTagsAndFeeds();
          HashMap<String, Integer> unreadEntriesMap = getNumUnreadEntries();

  	    
  	    listOfJListModels = new ArrayList<DefaultListModel>();
	    listOfJLists = new ArrayList<JList>();
           for (Map.Entry<String, String[]> entry : tagsAndFeeds.entrySet()) {
        	    String tagName = entry.getKey();
        	    String[] feedNames = entry.getValue();
        	    leftSidePanel.setAlignmentY(LEFT_ALIGNMENT);
        	    JLabel tagNameLabel =  new JLabel(tagName);
        	    tagNameLabel.setIcon(new ImageIcon(getClass().getResource("/folderImage.png")));
        	    tagNameLabel.setAlignmentY(LEFT_ALIGNMENT);
        	    
        	    tagNameLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        	    
        	    leftSidePanel.add(tagNameLabel);
        	    
        	    String newName;

        	            	    
        	    ArrayList<String>convertedFeedNames = new ArrayList<String>();
        	    for (String name: feedNames) {

        	    	if (isFeedNameTooLong(name))
        	    		newName = truncateLongFeedName(name);
        	    	else newName = name;
        	    	
 
        	    	String formatString = ("%-25s");
	       	    	
        	    	String someString = String.format(formatString, newName);
        	    	String enter = someString + "(" + unreadEntriesMap.get(name)
	    			+ ")";
        	    	convertedFeedNames.add(enter);
        	    }
        	    
        	    DefaultListModel listModel = new DefaultListModel();
                ListSelectionModel listSelectionModel;
        	    
                for (Object name: convertedFeedNames.toArray())
               	 	listModel.addElement(name);
                
        	    JList feedNamesList = new JList(listModel);
        	    
        	    listOfJListModels.add(listModel);
        	    listOfJLists.add(feedNamesList);
        	    // need to add the list of  models and lists of lists
        	    // to a global list
        	    
        	    listSelectionModel = feedNamesList.getSelectionModel();
                listSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
              
        	    // this should add to 
        	    feedNamesList.setFixedCellHeight(30);
        	    feedNamesList.setFixedCellWidth(250);
        	    feedNamesList.setPreferredSize(new 
        	    		Dimension(100, feedNamesList.getModel().getSize() * 30));
        	    
        	    leftSidePanel.add(feedNamesList);
        	}
    }
    
    /**
     * This is called whenever something is selected in a JList.
     * @author alabid
     *
     */
    class SharedListSelectionHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) { 
            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
            
            System.out.println("something is currently selected: " + lsm);
            
	            if (!lsm.isSelectionEmpty()) {
	            	// Find out which indexes are selected.
                int minIndex = lsm.getMinSelectionIndex();
                int maxIndex = lsm.getMaxSelectionIndex();
                for (int i = minIndex; i <= maxIndex; i++) {
                    if (lsm.isSelectedIndex(i)) {
                    	  // updatePackageFields(fileIntoPackages.getPackagesHashMap().get(list.getSelectedValue()));	
                    	  //can't do it more than once!
                    	System.out.println(entriesTable.getSelectedRow());
                    }
                }
               // handle the table one too.
                	
                for (JList list: listOfJLists) {

                	System.out.println("get selected value: " + list.getSelectedValue());
                	if (list.getSelectionModel() != lsm) {
                		list.clearSelection();
                	}
                	
                }
            }
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new KnightReaderView().setVisible(true);
            }
        });
    }
}