package controller;

import model.Nota;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static controller.GUImain.actualizarTabla;


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


    public GUICrearNotas(JFrame frame, JTable table, ArrayList<Nota>notas) {


        GUARDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                notas.add(new Nota(String.valueOf(textFieldNOMBRE.getText()), String.valueOf(textFieldAPELLIDO.getText()), String.valueOf(textFieldNOTA.getText())));

                actualizarTabla(table);

                JOptionPane.showMessageDialog(panelCrearNotas, "Nota insertada correctamente");
                frame.dispose();



               /* JOptionPane.showMessageDialog(panelCrearNotas, "Nota creada correctamente...");
                frame.dispose();*/
            }
        });

        CANCELARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(panelCrearNotas, "¿Seguro que deseas cancelar la creacion de la nota?") == 0) {
                    frame.dispose();
                }
            }
        });
    }




    public GUICrearNotas(JFrame frame, JTable table, ArrayList<Nota>notas, Nota notaSeleccionada) {

        textFieldNOMBRE.setText(notaSeleccionada.getNombre());
        textFieldAPELLIDO.setText(notaSeleccionada.getApellido());
        textFieldNOTA.setText(notaSeleccionada.getNota());

        GUARDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                notas.remove(notaSeleccionada);
                notas.add(new Nota(String.valueOf(textFieldNOMBRE.getText()), String.valueOf(textFieldAPELLIDO.getText()), String.valueOf(textFieldNOTA.getText()) ));


                actualizarTabla(table);

                JOptionPane.showMessageDialog(panelCrearNotas, "Nota modificada correctamente");
                frame.dispose();


               /* JOptionPane.showMessageDialog(panelCrearNotas, "Nota creada correctamente...");
                frame.dispose();*/
            }
        });

        CANCELARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(panelCrearNotas, "¿Seguro que deseas cancelar la creacion de la nota?") == 0){
                    frame.dispose();
                }
            }
        });




    }



}
