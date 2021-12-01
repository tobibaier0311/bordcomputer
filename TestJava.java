package com.testcode;

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


class TestJava  {
    public static  void  main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow();
                window.Show();
            }
        });
    }
}
