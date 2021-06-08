package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

class MenuBarContent extends JPanel {
	
	private JMenuBar menuBar = new JMenuBar();
	private JTextPane textArea;

	public MenuBarContent(JTextPane textArea) {
		
		this.textArea = textArea;
		
		setLayout(new FlowLayout());

		JMenu fontText = new JMenu("Fuente");

		JMenuItem serifFont = new JMenuItem("Serif");
		JMenuItem ubuntuFont = new JMenuItem("Ubuntu");
		JMenuItem z003Font = new JMenuItem("Z003");

		fontText.add(serifFont);
		fontText.add(ubuntuFont);
		fontText.add(z003Font);


		serifFont.addActionListener(new MenuManager());

		JMenu styleText = new JMenu("Estilo");

		JMenuItem boldStyle = new JMenuItem("Negrita");
		JMenuItem italicStyle = new JMenuItem("Cursiva");

		styleText.add(boldStyle);
		styleText.add(italicStyle);

		JMenu sizeText = new JMenu("Tamaño");

		JMenuItem size_10 = new JMenuItem("10");
		JMenuItem size_12 = new JMenuItem("12");
		JMenuItem size_14 = new JMenuItem("14");
		JMenuItem size_18 = new JMenuItem("18");
		JMenuItem size_20 = new JMenuItem("20");
		JMenuItem size_24 = new JMenuItem("24");

		sizeText.add(size_10);
		sizeText.add(size_12);
		sizeText.add(size_14);
		sizeText.add(size_18);
		sizeText.add(size_20);
		sizeText.add(size_24);

		menuBar.add(fontText);
		menuBar.add(styleText);
		menuBar.add(sizeText);


		add(menuBar);
		
		
		//textArea = new JTextPane();
		
		//add(textArea, BorderLayout.CENTER);

	}

	private class MenuManager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.setFont(new Font("Serif", Font.PLAIN, 12));

		}

	}
}
