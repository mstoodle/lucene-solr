package de.lanlab.larm.gui;

/*
	This simple extension of the java.awt.Frame class
	contains all the elements necessary to act as the
	main window of an application.
 */

import java.awt.*;
import java.awt.event.ActionListener;
//import com.sun.java.swing.*;

public class FetcherFrame extends Frame
{
	public FetcherFrame()
	{
		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		
		//{{INIT_CONTROLS
		setLayout(new BorderLayout(0,0));
		setSize(800,600);
		setVisible(false);
		openFileDialog1.setMode(FileDialog.LOAD);
		openFileDialog1.setTitle("�ffnen");
		//$$ openFileDialog1.move(24,312);
		mainPanelWithBorders.setLayout(new BorderLayout(0,0));
		add("Center", mainPanelWithBorders);
		mainPanelWithBorders.setBounds(0,0,800,600);
		northBorder.setLayout(null);
		mainPanelWithBorders.add("North", northBorder);
		northBorder.setBackground(java.awt.Color.lightGray);
		northBorder.setBounds(0,0,800,3);
		southBorder.setLayout(null);
		mainPanelWithBorders.add("South", southBorder);
		southBorder.setBackground(java.awt.Color.lightGray);
		southBorder.setBounds(0,597,800,3);
		westBorder.setLayout(null);
		mainPanelWithBorders.add("West", westBorder);
		westBorder.setBackground(java.awt.Color.lightGray);
		westBorder.setBounds(0,3,3,594);
		eastBorder.setLayout(null);
		mainPanelWithBorders.add("East", eastBorder);
		eastBorder.setBackground(java.awt.Color.lightGray);
		eastBorder.setBounds(797,3,3,594);
		mainPanel.setLayout(new BorderLayout(0,3));
		mainPanelWithBorders.add("Center", mainPanel);
		mainPanel.setBackground(java.awt.Color.lightGray);
		mainPanel.setBounds(3,3,794,594);
		upperPanel.setLayout(new GridLayout(1,2,0,0));
		mainPanel.add("North", upperPanel);
		upperPanel.setBounds(0,0,794,150);
		preferencesPanel.setLayout(null);
		upperPanel.add(preferencesPanel);
		preferencesPanel.setBounds(0,0,397,150);
		startURLlabel.setText("Start-URL");
		preferencesPanel.add(startURLlabel);
		startURLlabel.setBounds(12,0,121,24);
		startURL.setText("uni-muenchen.de");
		preferencesPanel.add(startURL);
		startURL.setBounds(132,0,133,24);
		startButton.setLabel("Start");
		preferencesPanel.add(startButton);
		startButton.setFont(new Font("Dialog", Font.BOLD, 12));
		startButton.setBounds(288,36,99,24);
		restrictToLabel.setText("Restrict host to");
		preferencesPanel.add(restrictToLabel);
		restrictToLabel.setBounds(12,36,121,28);
		preferencesPanel.add(restrictTo);
		restrictTo.setBounds(133,36,133,24);
		logPanel.setLayout(new BorderLayout(0,0));
		upperPanel.add(logPanel);
		logPanel.setBounds(397,0,397,150);
		logPanel.add("Center", logList);
		logList.setBackground(java.awt.Color.white);
		logList.setBounds(0,0,397,150);
		lowerPanel.setLayout(new GridLayout(1,3,3,3));
		mainPanel.add("Center", lowerPanel);
		lowerPanel.setBounds(0,153,794,441);
		urlQueuePanel.setLayout(new BorderLayout(0,0));
		lowerPanel.add(urlQueuePanel);
		urlQueuePanel.setBounds(0,0,196,441);
		urlQueueLabel.setText("URLQueue");
		urlQueuePanel.add("North", urlQueueLabel);
		urlQueueLabel.setBounds(0,0,196,23);
		urlQueuePanel.add("Center", urlQueueList);
		urlQueueList.setBackground(java.awt.Color.white);
		urlQueueList.setBounds(0,23,196,418);
		urlThreadPanel.setLayout(new BorderLayout(0,0));
		lowerPanel.add(urlThreadPanel);
		urlThreadPanel.setBounds(199,0,196,441);
		urlThreadLabel.setText("URLThreads");
		urlThreadPanel.add("North", urlThreadLabel);
		urlThreadLabel.setBounds(0,0,196,23);
		urlThreadPanel.add("Center", urlThreadList);
		urlThreadList.setBackground(java.awt.Color.white);
		urlThreadList.setBounds(0,23,196,418);
		docQueuePanel.setLayout(new BorderLayout(0,0));
		lowerPanel.add(docQueuePanel);
		docQueuePanel.setBounds(398,0,196,441);
		docQueueLabel.setText("DocQueue");
		docQueuePanel.add("North", docQueueLabel);
		docQueueLabel.setBounds(0,0,196,23);
		docQueuePanel.add("Center", docQueueList);
		docQueueList.setBackground(java.awt.Color.white);
		docQueueList.setBounds(0,23,196,418);
		docThreadPanel.setLayout(new BorderLayout(0,0));
		lowerPanel.add(docThreadPanel);
		docThreadPanel.setBounds(597,0,196,441);
		docThreadLabel.setText("DocThreads");
		docThreadPanel.add("North", docThreadLabel);
		docThreadLabel.setBounds(0,0,196,23);
		docThreadPanel.add("Center", docThreadList);
		docThreadList.setBackground(java.awt.Color.white);
		docThreadList.setBounds(0,23,196,418);
		setTitle("LARM - Fetcher");
		//}}
		
		//{{INIT_MENUS
		menu1.setLabel("Datei");
		menu1.add(newMenuItem);
		newMenuItem.setEnabled(false);
		newMenuItem.setLabel("Neu");
		newMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_N,false));
		menu1.add(openMenuItem);
		openMenuItem.setLabel("�ffnen...");
		openMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_O,false));
		menu1.add(saveMenuItem);
		saveMenuItem.setEnabled(false);
		saveMenuItem.setLabel("Speichern");
		saveMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_S,false));
		menu1.add(saveAsMenuItem);
		saveAsMenuItem.setEnabled(false);
		saveAsMenuItem.setLabel("Speichern unter...");
		menu1.add(separatorMenuItem);
		separatorMenuItem.setLabel("-");
		menu1.add(exitMenuItem);
		exitMenuItem.setLabel("Beenden");
		mainMenuBar.add(menu1);
		menu2.setLabel("Bearbeiten");
		menu2.add(cutMenuItem);
		cutMenuItem.setEnabled(false);
		cutMenuItem.setLabel("Ausschneiden");
		cutMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_X,false));
		menu2.add(copyMenuItem);
		copyMenuItem.setEnabled(false);
		copyMenuItem.setLabel("Kopieren");
		copyMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_C,false));
		menu2.add(pasteMenuItem);
		pasteMenuItem.setEnabled(false);
		pasteMenuItem.setLabel("Einf�gen");
		pasteMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_V,false));
		mainMenuBar.add(menu2);
		menu3.setLabel("Hilfe");
		menu3.add(aboutMenuItem);
		aboutMenuItem.setLabel("Info...");
		mainMenuBar.add(menu3);
		//$$ mainMenuBar.move(0,312);
		setMenuBar(mainMenuBar);
		//}}
		
		//{{REGISTER_LISTENERS
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		openMenuItem.addActionListener(lSymAction);
		exitMenuItem.addActionListener(lSymAction);
		aboutMenuItem.addActionListener(lSymAction);
		startButton.addActionListener(lSymAction);
		//}}
	}
	
	public FetcherFrame(String title)
	{
		this();
		setTitle(title);
	}
	
    /**
     * Shows or hides the component depending on the boolean flag b.
     * @param b  if true, show the component; otherwise, hide the component.
     * @see java.awt.Component#isVisible
     */
    public void setVisible(boolean b)
	{
		if(b)
		{
			setLocation(50, 50);
		}	
		super.setVisible(b);
	}
	
	static public void main(String args[])
	{
		try
		{
			//Create a new instance of our application's frame, and make it visible.
    		(new FetcherFrame()).setVisible(true);
		}
		catch (Throwable t)
		{
			System.err.println(t);
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
	
	public void addNotify()
	{
		// Record the size of the window prior to calling parents addNotify.
		Dimension d = getSize();
		
		super.addNotify();
	
		if (fComponentsAdjusted)
			return;
	
		// Adjust components according to the insets
		setSize(getInsets().left + getInsets().right + d.width, getInsets().top + getInsets().bottom + d.height);
		Component components[] = getComponents();
		for (int i = 0; i < components.length; i++)
		{
			Point p = components[i].getLocation();
			p.translate(getInsets().left, getInsets().top);
			components[i].setLocation(p);
		}
		fComponentsAdjusted = true;
	}
	
	// Used for addNotify check.
	boolean fComponentsAdjusted = false;
	
	//{{DECLARE_CONTROLS
	java.awt.FileDialog openFileDialog1 = new java.awt.FileDialog(this);
	java.awt.Panel mainPanelWithBorders = new java.awt.Panel();
	java.awt.Panel northBorder = new java.awt.Panel();
	java.awt.Panel southBorder = new java.awt.Panel();
	java.awt.Panel westBorder = new java.awt.Panel();
	java.awt.Panel eastBorder = new java.awt.Panel();
	java.awt.Panel mainPanel = new java.awt.Panel();
	java.awt.Panel upperPanel = new java.awt.Panel();
	java.awt.Panel preferencesPanel = new java.awt.Panel();
	java.awt.Label startURLlabel = new java.awt.Label();
	java.awt.TextField startURL = new java.awt.TextField(30);
	java.awt.Button startButton = new java.awt.Button();
	java.awt.Label restrictToLabel = new java.awt.Label();
	java.awt.TextField restrictTo = new java.awt.TextField();
	java.awt.Panel logPanel = new java.awt.Panel();
	java.awt.List logList = new java.awt.List(8);
	java.awt.Panel lowerPanel = new java.awt.Panel();
	java.awt.Panel urlQueuePanel = new java.awt.Panel();
	java.awt.Label urlQueueLabel = new java.awt.Label();
	java.awt.List urlQueueList = new java.awt.List(5);
	java.awt.Panel urlThreadPanel = new java.awt.Panel();
	java.awt.Label urlThreadLabel = new java.awt.Label();
	java.awt.List urlThreadList = new java.awt.List(4);
	java.awt.Panel docQueuePanel = new java.awt.Panel();
	java.awt.Label docQueueLabel = new java.awt.Label();
	java.awt.List docQueueList = new java.awt.List(4);
	java.awt.Panel docThreadPanel = new java.awt.Panel();
	java.awt.Label docThreadLabel = new java.awt.Label();
	java.awt.List docThreadList = new java.awt.List(4);
	//}}
	
	//{{DECLARE_MENUS
	java.awt.MenuBar mainMenuBar = new java.awt.MenuBar();
	java.awt.Menu menu1 = new java.awt.Menu();
	java.awt.MenuItem newMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem openMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem saveMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem saveAsMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem separatorMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem exitMenuItem = new java.awt.MenuItem();
	java.awt.Menu menu2 = new java.awt.Menu();
	java.awt.MenuItem cutMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem copyMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem pasteMenuItem = new java.awt.MenuItem();
	java.awt.Menu menu3 = new java.awt.Menu();
	java.awt.MenuItem aboutMenuItem = new java.awt.MenuItem();
	//}}
	
	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == FetcherFrame.this)
				FetcherFrame_WindowClosing(event);
		}
	}
	
	void FetcherFrame_WindowClosing(java.awt.event.WindowEvent event)
	{
		// to do: code goes here.
			 
		FetcherFrame_WindowClosing_Interaction1(event);
	}


	void FetcherFrame_WindowClosing_Interaction1(java.awt.event.WindowEvent event)
	{
		try {
			// QuitDialog Create and show as modal
			(new QuitDialog(this, true)).setVisible(true);
		} catch (Exception e) {
		}
	}

	
	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == openMenuItem)
				openMenuItem_ActionPerformed(event);
			else if (object == aboutMenuItem)
				aboutMenuItem_ActionPerformed(event);
			else if (object == exitMenuItem)
				exitMenuItem_ActionPerformed(event);
			else if (object == startButton)
				startButton_ActionPerformed(event);
		}
	}
	
	void openMenuItem_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
		openMenuItem_ActionPerformed_Interaction1(event);
	}


	void openMenuItem_ActionPerformed_Interaction1(java.awt.event.ActionEvent event)
	{
		try {
			// OpenFileDialog Create and show as modal
		    int		defMode         = openFileDialog1.getMode();
		    String	defTitle        = openFileDialog1.getTitle();
		    String defDirectory     = openFileDialog1.getDirectory();
		    String defFile          = openFileDialog1.getFile();

		    openFileDialog1 = new java.awt.FileDialog(this, defTitle, defMode);
		    openFileDialog1.setDirectory(defDirectory);
		    openFileDialog1.setFile(defFile);
		    openFileDialog1.setVisible(true);
		} catch (Exception e) {
		}
	}


	void aboutMenuItem_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
		aboutMenuItem_ActionPerformed_Interaction1(event);
	}


	void aboutMenuItem_ActionPerformed_Interaction1(java.awt.event.ActionEvent event)
	{
		try {
			// AboutDialog Create and show as modal
			(new AboutDialog(this, true)).setVisible(true);
		} catch (Exception e) {
		}
	}
	
	
	void exitMenuItem_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
		exitMenuItem_ActionPerformed_Interaction1(event);
	}


	void exitMenuItem_ActionPerformed_Interaction1(java.awt.event.ActionEvent event)
	{
		try {
			// QuitDialog Create and show as modal
		    (new QuitDialog(this, true)).setVisible(true);
		} catch (Exception e) {
		}
	}


	public void startButton_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
	}
	 
	public void addUrlQueueItem(String item)
	{
		urlQueueList.add(item);
	}
	
	public void removeUrlQueueItem(String item)
	{
		urlQueueList.remove(item);
	}
	public void addDocQueueItem(String item)
	{
		docQueueList.add(item);
	}
	
	public void removeDocQueueItem(String item)
	{
		docQueueList.remove(item);
	}
	
	public synchronized int addUrlThreadItem(String item)
	{
		urlThreadList.add(item);
		return urlThreadList.getItemCount();
	}

	public synchronized int addUrlThreadItem(String item, int pos)
	{
		urlThreadList.add(item,pos);
		return urlThreadList.getItemCount();
	}
	
	public void replaceUrlThreadItem(String item, int index)
	{
		urlThreadList.replaceItem(item,index);
	}
	
	public synchronized int addDocThreadItem(String item)
	{
		docThreadList.add(item);
		return docThreadList.getItemCount();
	}

	public void replaceDocThreadItem(String item, int index)
	{
		docThreadList.replaceItem(item,index);
	}
	
	
		
	public void addLogEntry(String entry)
	{
		logList.add(entry);
		logList.makeVisible(logList.getItemCount()-1);
	}
	
	public void clearLog()
	{
		logList.removeAll();
	}
	
	public void addStartButtonListener(ActionListener a)
	{
		startButton.addActionListener(a);
	}
	
	public String getRestrictTo()
	{
	   return restrictTo.getText();
	}
	public void setRestrictTo(String restrictTo)
	{
	   this.restrictTo.setText(restrictTo);
	}
	public String getStartURL()
	{
	   return startURL.getText();
	}
    public void setStartURL(String startURL)
    {
        this.startURL.setText(startURL);
    }	

    //public void setInfoText(String text)
    //{
    //    thi
    //}
}

