package project2; 

import javax.swing.table.AbstractTableModel;

/**
 * 
 * @author EliF
 * A table model used to handle the column and row data for the JTable used in GradeUI
 */
public class SimpleTableModel extends AbstractTableModel {
    public int rowLength = 0;
    public final String[] columnNames = {
        "Name",
        "QZ01",
        "QZ02",
        "QZ03",
        "QZ04",
        "QZ05",
        "T-Quiz",
        "AS01",
        "AS02",
        "AS03",
        "AS04",
        "AS05",
        "T-ASS",
        "Exam01",
        "Exam02",
        "Attend",
        "Project",
        "Grade",
        "Letter"
    };
    
    private final Object[][] rowData;
	
    public SimpleTableModel(int rowLength)	{
        this.rowLength = rowLength;
        rowData = new Object[rowLength][columnNames.length];

    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    @Override
    public int getRowCount() { return rowData.length; }
    @Override
    public int getColumnCount() { return columnNames.length; }
    
    @Override
    public Object getValueAt(int row, int col) {
        return rowData[row][col];
    }
    
    @Override
    public boolean isCellEditable(int row, int col)	{ return false; }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        rowData[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
