package DayTwoCorruptionCheckSum;

        import java.util.ArrayList;

/**
 * Utility class Advent of Code
 * Day Two: Corruption Checksum
 *
 * @author Sarah Guarino
 * @version 1.0
 */

public class SpreadsheetMaker {
    private int currentRow;

     SpreadsheetMaker() {
        currentRow = -1;
    }

    public void addRow(ArrayList<ArrayList<String>> spreadsheet) {
        currentRow++;
        spreadsheet.add(new ArrayList<>());
        addColumn(spreadsheet.get(currentRow));
    }

    public void addColumn(ArrayList<String> spreadsheetRow) {
        spreadsheetRow.add("");
    }
}