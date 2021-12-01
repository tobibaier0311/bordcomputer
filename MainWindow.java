package com.testcode;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {


    private com.testcode.ComputerWindowomputerWindow computerWindow = new ComputerWindowomputerWindow();
    private final JFrame container ;
    JPanel compPanel;


    public MainWindow()
    {
        container = new JFrame();
        container.setTitle("App");
        container.setSize(400, 400);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLocationRelativeTo(null);
    }

    public void Show()
    {
        InitMainWindowGUI();
        InitComputerWindowGUI();
    }


    public void InitMainWindowGUI()
    {

        //Base Panel
        compPanel = new JPanel(new GridLayout(2, 2, 30, 30));
        compPanel.setBackground(Color.WHITE);
        compPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
        compPanel.setSize(300,300);
        container.add(compPanel,BorderLayout.CENTER);


        compPanel.add(AddButtonToView("C:\\Users\\omar\\OneDrive\\Desktop\\Icons\\Computer.png","Computer",this::OnComputerButtonClicked));
        compPanel.add(AddButtonToView("C:\\Users\\omar\\OneDrive\\Desktop\\Icons\\Internet.png","Internet",this::OnInternetButtonClicked));
        compPanel.add(AddButtonToView("C:\\Users\\omar\\OneDrive\\Desktop\\Icons\\Bluetooth.png","Bluetooth",this::OnBluetoothButtonClicked));
        compPanel.add(AddButtonToView("C:\\Users\\omar\\OneDrive\\Desktop\\Icons\\Phone.png","Phone",this::OnPhoneButtonClicked));

        container.setVisible(true);
    }

    public void InitComputerWindowGUI()
    {
        computerWindow.InitGui();
    }


    public JToggleButton AddButtonToView(String iconPath,
                                         String text,
                                         ActionListener OnClickEvent)
    {
        JToggleButton tempButton = new JToggleButton();
        tempButton.setIcon(new ImageIcon(iconPath));
        tempButton.setBounds(70, 80, 50, 30);
        tempButton.setText(text);
        tempButton.addActionListener(OnClickEvent);
        return tempButton;
    }


    public void OnComputerButtonClicked(ActionEvent e) {
        computerWindow.InitComptuerChoices();
        computerWindow.Show();
//        JOptionPane.showMessageDialog(null, "Computer Button Clicked", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
    }

    public void OnInternetButtonClicked(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Internet Button Clicked", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
    }

    public void OnBluetoothButtonClicked(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Bluetooth Button Clicked", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
    }

    public void OnPhoneButtonClicked(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Phone Button Clicked", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
    }





}
