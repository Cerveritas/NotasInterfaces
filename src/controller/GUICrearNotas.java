package controller;

import model.Nota;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUICrearNotas {
    public JPanel panelCrearNotas;
    public JTextField textFieldNOMBRE;
    public JTextField textFieldAPELLIDO;

    public JLabel LABELnotaTitulo;
    public JTextField textFieldNOTA;
    public JButton GUARDARButton;
    public JButton CANCELARButton;
    public JLabel LABELnombre;
    public JLabel LABELapellido;
    public JLabel LABELnota;



    public static void main(String[] args) {

        JFrame frame = new JFrame("GUICrearNotas");
        frame.setContentPane(new GUICrearNotas().panelCrearNotas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    private static List<Nota>notas;


    public GUICrearNotas(){

        GUARDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                String nombre = textFieldNOMBRE.getText();
                String apellido = textFieldAPELLIDO.getText();
                String nota = textFieldNOTA.getText();

                Nota nota1 = new Nota(nombre, apellido, nota);


             

                JOptionPane.showMessageDialog(panelCrearNotas, "Nota creada correctamente...");







            }
        });




    }


}
