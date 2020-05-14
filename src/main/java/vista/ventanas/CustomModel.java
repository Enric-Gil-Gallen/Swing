package vista.ventanas;

import modelo.datos.Cliente;

import javax.swing.table.AbstractTableModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomModel extends AbstractTableModel {

private Object[] colNames ={"ID","Title", "Author", "Status", "Date Read"};
private HashSet<Cliente> data;

public CustomModel() {
    this.data = getDataForDropList();
}

public int getRowCount() {
    return data.size();
}

public int getColumnCount() {
    return colNames.length;
}

@Override
public String getColumnName(int columnIndex) {
    return (String) colNames[columnIndex];
}

@Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    // Set Values here;
}



@Override
public boolean isCellEditable(int rowIndex, int columnIndex) {
    return true;
}

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
public Class<?> getColumnClass(int columnIndex) {
    // Depending on the type of the column. Return data type;
        return null;
    }


/**
 * Populate the data from here.
 * @return LinkedHashSet<CustomClass>
 */
private HashSet<Cliente> getDataForDropList() {
    HashSet<Cliente> modelList = new  HashSet<Cliente>();
    modelList.addAll(data);
    return modelList;
}
}