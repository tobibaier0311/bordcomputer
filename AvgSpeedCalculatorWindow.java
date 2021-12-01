package com.testcode.Views;
import com.testcode.BusinessLogic.AvgSpeedCalculator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AvgSpeedCalculatorWindow {

    private  JTextField distanceTxt,timeTxt;
    private JFrame container ;
    private JFrame subContainer ;
    JPanel compPanel;

    AvgSpeedCalculator avgSpeedCalc;

    public AvgSpeedCalculatorWindow()
    {
        container = new JFrame();
        container.setTitle("AvgSpeed Calculator");
        container.setSize(400, 400);
        container.setLocationRelativeTo(null);

        avgSpeedCalc = new AvgSpeedCalculator();
    }

    public void InitGui()
    {
        compPanel = new JPanel(new GridLayout(3, 2, 30, 30));
        compPanel.setBackground(Color.WHITE);
        compPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        compPanel.setSize(300,300);
        container.add(compPanel,BorderLayout.CENTER);

        JToggleButton tempButton = new JToggleButton();
        tempButton.setBounds(0, 0, 100, 30);
        tempButton.setText("Calculate");
        tempButton.addActionListener(this::OnCalculateAvgTempButtonClicked);

        distanceTxt=new JTextField("Distance");

        timeTxt=new JTextField("Time");


        compPanel.add(distanceTxt);
        compPanel.add(timeTxt);
        compPanel.add(tempButton);
    }


    public void OnCalculateAvgTempButtonClicked(ActionEvent e) {

        double distanceValue  = 0;
        double timeValue = 0;

        try
        {
            distanceValue = Double.parseDouble( distanceTxt.getText());
            timeValue = Double.parseDouble( timeTxt.getText());
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Numbers", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }


        double result = avgSpeedCalc.getAvgSpeed(distanceValue,timeValue);
        JOptionPane.showMessageDialog(null, "AvgSpeed: " + result + " km/h", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
    }

    public void Show()
    {
        container.setVisible(true);
    }

}
