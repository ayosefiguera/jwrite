package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class BaseGui extends JFrame {
	
	private PaneAreaContent textContent;
	
	public BaseGui() {

		super("Jwriter - Simple editor de texto");

		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		textContent = new PaneAreaContent();
		add(textContent, BorderLayout.CENTER);

		add(new MenuBarContent(textContent.textArea), BorderLayout.NORTH);

		setVisible(true);

	}

}
