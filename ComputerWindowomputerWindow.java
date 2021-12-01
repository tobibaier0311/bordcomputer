package com.testcode;

import com.testcode.Views.AvgSpeedCalculatorWindow;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerWindowomputerWindow {


    private JFrame container ;
    private JFrame subContainer ;
    JPanel compPanel;

    AvgSpeedCalculatorWindow avgSpeedCalculatorWindow;

    public ComputerWindowomputerWindow()
    {
        container = new JFrame();
        container.setTitle("Computer Choices");
        container.setSize(400, 400);
        container.setLocationRelativeTo(null);

        avgSpeedCalculatorWindow = new AvgSpeedCalculatorWindow();
        avgSpeedCalculatorWindow.InitGui();
    }

    public void InitGui()
    {
        compPanel = new JPanel(new GridLayout(2, 2, 30, 30));
        compPanel.setBackground(Color.WHITE);
        compPanel.setBorder(new EmptyBorder(40, 50, 40, 50));
        compPanel.setSize(300,300);
        container.add(compPanel,BorderLayout.CENTER);
    }



    public void InitComptuerChoices()
    {
        compPanel.removeAll();
        compPanel.add(AddButtonToView("C:\\Users\\kolle\\OneDrive\\Desktop\\Icons\\Computer.png","AvgSpeed",this::OnAvgSpeedButtonClicked));
        compPanel.add(AddButtonToView("C:\\Users\\kolle\\OneDrive\\Desktop\\Icons\\Computer.png","Temperature",this::OnTemperatureButtonClicked));
    }


    public JToggleButton AddButtonToView(String iconPath,
                                         String text,
                                         ActionListener OnClickEvent)
    {
        JToggleButton tempButton = new JToggleButton();
        tempButton.setIcon(new ImageIcon(iconPath));
        tempButton.setBounds(80, 80,50,50);
        tempButton.setText(text);
        tempButton.addActionListener(OnClickEvent);
        return tempButton;
    }


    public void OnAvgSpeedButtonClicked(ActionEvent e) {
        avgSpeedCalculatorWindow.Show();
    }

    public void OnTemperatureButtonClicked(ActionEvent e) {
        return;
    }


    public void Show()
    {
        container.setVisible(true);
    }

}
