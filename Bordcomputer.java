import java.util.Scanner;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.EventObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bordcomputer extends SwingWindow{

	public static void main(String[] args) {
		avgSpeed avgspeed = new avgSpeed();
		Temperature temp = new Temperature();
		SystemClock clock = new SystemClock();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//Menu
		JFrame compFrame = new JFrame();
		compFrame.setTitle("Settings");
		compFrame.setSize(600, 600);
		compFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Border
		Border bo = new LineBorder(Color.blue);
		JMenuBar compBar = new JMenuBar();
		compBar.setBorder(bo);
		
		//Menu-Content
		JMenu compMenu_1 = new JMenu("Language");
		JMenuItem compItem_1 = new JMenuItem("German");
		JMenuItem compItem_2 = new JMenuItem("English");
		JMenuItem compItem_3 = new JMenuItem("Russian");
		compMenu_1.add(compItem_1);
		compMenu_1.add(compItem_2);
		compMenu_1.add(compItem_3);
		
		JMenu compMenu_2 = new JMenu("Units");
		JMenuItem compItem_4 = new JMenuItem("m/s");
		JMenuItem compItem_5 = new JMenuItem("km/h");
		compMenu_2.add(compItem_4);
		compMenu_2.add(compItem_5);
		
		//Panel
		JPanel compPanel = new JPanel(new GridLayout(2, 2, 10, 10));
		compPanel.setBackground(Color.WHITE);
		compFrame.add(compPanel);
		
		//Toggle-Buttons
		JToggleButton toggleButton_1 = new JToggleButton();
		toggleButton_1.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Icons\\Computer.png"));
		toggleButton_1.setBounds(70, 80, 100, 30);
		compPanel.add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton();
		toggleButton_2.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Icons\\Sprachen.png"));
		compPanel.add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton();
		toggleButton_3.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Icons\\Bluetooth.png"));
		compPanel.add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton();
		toggleButton_4.setIcon(new ImageIcon("C:\\Users\\kolle\\OneDrive\\Desktop\\Icons\\Phone.png"));
		compPanel.add(toggleButton_4);
				
		//Menu-Separation
		JSeparator compSep = new JSeparator();
		compMenu_1.add(compSep);
		compBar.add(compMenu_1);
		compBar.add(compMenu_2);
		compFrame.setJMenuBar(compBar);
		compFrame.setVisible(true);
		
		
		System.out.println("Press 0 and hit enter to get to the driving data:");
	
		//Menu-Switch
	while (scan.nextInt() < 9 || scan.nextInt() >= 0) {
		System.out.println("Press following Buttons: \n1: Average speed reached since the start of the journey \n2: Motor oil temperature \n3: Cooling water temperature \n4: Outside temperature \n5: Fuel consumption in l / 100km at the moment \n6: Fuel consumption in l / 100km since starting the journey \n7: Distance covered since the start of the journey in km \n8: Time passed is");
		
		int mode = scan.nextInt();
		
		switch (mode) {
		case 1:
			avgspeed.setavgSpeed();
			break;
		case 2: 
			temp.getOilTemp();
			break;
		case 3: 
			temp.getWaterTemp();
			break;
		case 4:
			temp.getTempOut();
			break;
		case 5:
			clock.getClock(args);
			break;
		case 7: 
			System.out.println(avgspeed.distance);
			break;
		default:
			System.out.println("Invalid Input");
		}
	}	
		
	System.out.println("next method here");
   }
}