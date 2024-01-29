package controller;

import model.Nota;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class GUImain {


    private static String[] nombreColumnas = {("Nombre"), ("Apellidos"), ("Nota")};
    public JTable table1;


    private JButton CREARButton;
    private JButton MODIFICARButton;
    private JButton ELIMINARButton;
    public JPanel PanelPrincipal;
    //private JTable table1;
    private JScrollPane ScrollPanel;


    static ArrayList<Nota>notas = new ArrayList<>();
    //private static ArrayList<Nota> notas;
    private Nota notasSeleccionada;






    // Metodo de actualizar tabla
    public static void actualizarTabla(JTable table) {

       String[][] data = new String[notas.size()][3];
        for(int i = 0; i < notas.size(); i++){
            String[] row = {notas.get(i).getNombre(), notas.get(i).getApellido(), notas.get(i).getNota()};
            data[i] = row;
        }

        table.setModel(new DefaultTableModel(data, nombreColumnas));
        table.setCellSelectionEnabled(false);
        table.repaint();
        table.revalidate();

    }






    public GUImain(JFrame frame) {




        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table1.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    notasSeleccionada = notas.get(row);
                }
            }
        });

        table1.setModel(new DefaultTableModel(nombreColumnas, 0));
        actualizarTabla(table1);


        CREARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JFrame frameForm = new JFrame();
                frameForm.setContentPane(new GUICrearNotas(frameForm, table1, notas).panelCrearNotas);
                frameForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameForm.pack();
                frameForm.setVisible(true);
                frameForm.setBounds(500,100,250,350);
                frameForm.setResizable(false);


            }
        });

        MODIFICARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (notasSeleccionada == null){
                    JOptionPane.showMessageDialog(frame, "Debes seleccionar una nota");
                } else {
                    JFrame frameForm = new JFrame();
                    frameForm.setContentPane(new GUICrearNotas(frameForm, table1, notas, notasSeleccionada).panelCrearNotas);
                    frameForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frameForm.pack();
                    frameForm.setBounds(500,100,250,350);
                    frameForm.setVisible(true);
                    notasSeleccionada = null;
                    frameForm.setResizable(false);
                }




            }
        });


        ELIMINARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(frame, "Seguro que quieres eliminar esta nota?") == 0){
                    notas.remove(notasSeleccionada);
                    actualizarTabla(table1);
                    notasSeleccionada = null;
                } else {

                }




            }
        });







    }


    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }



}
