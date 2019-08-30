package DayTwoCorruptionCheckSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utility class Advent of Code
 * Day Two: Corruption Checksum
 *
 * @author Sarah Guarino
 * @version 1.0
 */

public class SpreadsheetMaker {
    private int currentRow;
    private int currentColumn;

    SpreadsheetMaker() {
        currentRow = -1;
        currentColumn = -1;
    }

    public void addRow(ArrayList<ArrayList<String>> spreadsheet) {
        currentRow++;
        spreadsheet.add(new ArrayList<>());
        currentColumn = -1;
        addColumn(spreadsheet.get(currentRow));
    }

    public void addColumn(ArrayList<String> spreadsheetRow) {
        currentColumn++;
        spreadsheetRow.add("");
    }

    public ArrayList<List<String>> buildSpreadsheet(String spreadsheetString) {
        List<String> unsplitRowsOfStrings = Arrays.asList(spreadsheetString.split("[\n]"));
        ArrayList<List<String>> spreadsheet = new ArrayList<>();
        for(String unsplitRow : unsplitRowsOfStrings) {
            spreadsheet.add(Arrays.asList(unsplitRow.split("[\t]")));
        }

        return spreadsheet;
    }
}