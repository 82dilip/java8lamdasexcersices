package com.insightfullogic.java8.examples.chapter2;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;

import javax.swing.*;

public class CaptureCompileError extends JPanel {
	
	public CaptureCompileError() {
		
		
		String name = getUserName();
	    // Uncommenting below line for the below listener should cause a compile error:
	    // name = formatUserName(name);
	    button = new JButton("Demo");
	    button.setVerticalTextPosition(AbstractButton.CENTER);
	    button.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
	    button.setMnemonic(KeyEvent.VK_D);
	    button.setActionCommand("disable");
	    button.addActionListener(event -> {System.out.println("hi " + name);
	    
	    });
	    add(button);
	    /*Consumer<String> str = names -> {
	        	                               System.out.println("hi " + names);
	        	                            };
	    str.accept(name);*/
	    
	        
	}

    private JButton button;

    public static void error() {
    	
    	JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        CaptureCompileError newContentPane = new CaptureCompileError();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        
    }

    private String formatUserName(String name) {
        return name.toLowerCase();
    }

    private String getUserName() {
        return "RICHARD";
    }
    
    public static void main(String[] args) {
		CaptureCompileError.error();
	}
}
