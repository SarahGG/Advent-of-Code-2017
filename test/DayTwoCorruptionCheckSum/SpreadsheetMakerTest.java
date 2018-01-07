package DayTwoCorruptionCheckSum;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the SpreadsheetMaker Class
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class SpreadsheetMakerTest {
    @Test
    public void spreadsheetRowOneHasFiveColumns() {
        SpreadsheetMaker spreadsheetMaker = new SpreadsheetMaker();
        ArrayList<String> spreadsheetRow = new ArrayList<>();

        // there are no columns
        assertEquals(0, spreadsheetRow.size());

        spreadsheetMaker.addColumn(spreadsheetRow);
        spreadsheetMaker.addColumn(spreadsheetRow);
        spreadsheetMaker.addColumn(spreadsheetRow);
        spreadsheetMaker.addColumn(spreadsheetRow);
        spreadsheetMaker.addColumn(spreadsheetRow);

        //there is five columns
        assertEquals(5, spreadsheetRow.size());
    }

    @Test
    public void spreadsheetHasThreeRows() {
        SpreadsheetMaker spreadsheetMaker = new SpreadsheetMaker();
        ArrayList<ArrayList<String>> spreadsheet = new ArrayList<>();

        assertEquals(0, spreadsheet.size());

        spreadsheetMaker.addRow(spreadsheet);
        spreadsheetMaker.addRow(spreadsheet);
        spreadsheetMaker.addRow(spreadsheet);

        assertEquals(3, spreadsheet.size());
    }
}
