KnightReader
============

Authors
-------
Daniel Alabi, Amy Becker, Michael Domingues

Date
----
Spring 2011

PROGRAM OVERVIEW
----------------
	
KnightReader is a RSS feed reader that allows users to subscribe to and manage their favorite feeds.  KnightReaderApp makes use of the MVC design pattern, in which a Model class contains the feed and folder data, the View Class displays the feeds to the user in a clear way and offers various options to the user, and the Controller class responds to the user input.


HOW TO
------

* To run KnightReader, run the Java application KnightReaderApp, which can be found in src/core/ directory.
	
* Once running, you can click on the Subscribe, New Folder, and Refresh All buttons to add, organize, or update your feeds.
	
* You can also use the File, Edit, and About Menus to access these features, in addtion to deleting feeds and folders and renaming folders.
	
* (If you are subscribed any) click on a feed in the left pane to display the feed's entries in the main panel, then click on an entry title to view it.
	
* If a feed (in the left panel) is chosen you can use the search bar to find feed entries whose titles contain specific words.
	
* To exit the program, choose File>Exit (do not use control-Q or quit from the apple menu).


WORKING FEATURES
----------------
<b>(Design Features)</b>
<ul>
<li>MVC design pattern</li>
<li>Observer design pattern (Model = subject, controller = observer)</li>
<li>JUnit Tests for all Core classes</li>
<li>XML used for saving user data</li>

<b>(Program features)</b>
<li>Automatically updates feed view with new feeds regularly<li>
<li>Search (by keyword)</li>
<li>Sort (by title or date)</li>
<li>Add/Delete/Rename Folder</li>
<li>Subscribe/Unsubscribe to Feed</li>
