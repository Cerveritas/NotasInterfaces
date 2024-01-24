package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class modeloTablaNota extends AbstractTableModel {

    private List<Nota> notas;

    public modeloTablaNota(List<Nota> notas){
        super();
        this.notas = notas;
    }



    private enum columnasModeloNota{
        NOMBRE("nombre"),
        APELLIDO("apellido"),
        NOTA("nota");

        final String header;

        columnasModeloNota(String header){
            this.header = header;
        }

    }


    @Override
    public int getRowCount() {
        return notas.size();
    }

    @Override
    public int getColumnCount() {
        return columnasModeloNota.values().length;
    }

    @Override
    public String getColumnName(int column){
        return columnasModeloNota.values()[column].header;
    }



    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Nota nota = notas.get(rowIndex);
        switch (columnasModeloNota.values()[columnIndex]){

            case NOMBRE:
                return nota.getNombre();

            case APELLIDO:
                return nota.getApellido();

            case NOTA:
                return nota.getNota();

            default:
                throw new RuntimeException("NO EXISTE LA COLUMNA "+columnIndex);
        }

    };

    public void agregarUsuario(Nota nota) {
        notas.add(nota);
        fireTableDataChanged();
    }



}
