import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class MenuGUI extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGUI frame = new MenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		//Menu
		JFrame compFrame = new JFrame();
		compFrame.setTitle("Settings");
		compFrame.setSize(600, 600);
		compFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		compFrame.getContentPane().setLayout(new GridLayout(2,1));

		//Border
		Border bo = new LineBorder(Color.blue);
		JMenuBar compBar = new JMenuBar();
		compBar.setBorder(bo);
		
		//Panel
		JPanel compPanel = new JPanel(new GridLayout(2, 2, 4, 4));
		compPanel.setBackground(Color.WHITE);
		compFrame.getContentPane().add(compPanel);
		
		//Toggle-Buttons
		JToggleButton toggleButton_1 = new JToggleButton();
		toggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		toggleButton_1.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Software-Enigneering\\Bordcomputer\\img\\Computer.png"));
		compPanel.add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton();
		toggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toggleButton_2.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Software-Enigneering\\Bordcomputer\\img\\Languages.png"));
		compPanel.add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton();
		toggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toggleButton_3.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Software-Enigneering\\Bordcomputer\\img\\Bluetooth.png"));
		compPanel.add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton();
		toggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toggleButton_4.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Software-Enigneering\\Bordcomputer\\img\\Phone.png"));
		compPanel.add(toggleButton_4);
	}
}
