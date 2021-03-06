package DayTwoCorruptionCheckSum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void spreadsheetIsInitialized() {
        SpreadsheetMaker spreadsheetMaker = new SpreadsheetMaker();
        String spreadsheetString = "5\t1\t9\t5\n" +
                "7\t5\t3\n" +
                "2\t4\t6\t8";

        ArrayList<List<String>> spreadsheet = spreadsheetMaker.buildSpreadsheet(spreadsheetString);

        assertEquals("[[5, 1, 9, 5], [7, 5, 3], [2, 4, 6, 8]]", spreadsheet.toString());
    }
}
