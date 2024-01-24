package controller;

import model.Nota;
import model.modeloTablaNota;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class GUImain {


    private JButton CREARButton;
    private JButton MODIFICARButton;
    private JButton ELIMINARButton;
    private JPanel PanelPrincipal;
    private JTable table1;
    private JScrollPane ScrollPanel;


    static ArrayList<Nota>notas = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUImain");
        frame.setContentPane(new GUImain().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(500,100,700,500);
        frame.setVisible(true);

        actualizarTabla(new GUImain().table1, notas);


        new GUImain().table1.setPreferredScrollableViewportSize(new Dimension(700,500));

    }

    // Metodo de actualizar tabla

    public static void actualizarTabla(JTable table1, ArrayList<Nota> notas) {

        table1.setModel(new modeloTablaNota(notas));
        table1.getColumnModel().getColumn(0).setPreferredWidth(0);
    }



    public GUImain() {


        CREARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                modeloTablaNota modeloTablaNota = new modeloTablaNota(notas);

                JFrame frameCrearUsuario = new JFrame();
                frameCrearUsuario.setVisible(true);
                frameCrearUsuario.setContentPane(new GUICrearNotas().panelCrearNotas);
                frameCrearUsuario.setBounds(500,100,250,350);

                //modeloTablaNota.agregarUsuario();



















            }
        });






    }





}
