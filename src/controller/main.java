package controller;

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("GUImain");
        frame.setContentPane(new GUImain(frame).PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,100,700,500);
        frame.setVisible(true);
        frame.setResizable(false);

        //actualizarTabla(new GUImain().table1, notas);


        new GUImain(frame).table1.setPreferredScrollableViewportSize(new Dimension(700,500));




    }
}


