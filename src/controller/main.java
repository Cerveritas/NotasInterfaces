package controller;

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Mis Notas");
        frame.setContentPane(new GUImain(frame).PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,100,700,500);
        frame.setVisible(true);
        frame.setResizable(true);

        //actualizarTabla(new GUImain().table1, notas);


        new GUImain(frame).table1.setPreferredScrollableViewportSize(new Dimension(700,500));




    }
}


