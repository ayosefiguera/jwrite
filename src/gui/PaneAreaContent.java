package gui;

import java.awt.BorderLayout;
import java.nio.ByteOrder;

import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PaneAreaContent extends JPanel{
	
	public JTextPane textArea;
	
	public PaneAreaContent() {
		setLayout(new BorderLayout());
		textArea = new JTextPane();
		add(textArea, BorderLayout.CENTER);
	}
	
}
