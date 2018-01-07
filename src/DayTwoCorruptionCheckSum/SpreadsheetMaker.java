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

    public ArrayList<ArrayList<String>> buildSpreadsheet(String spreadsheetString) {
        ArrayList<ArrayList<String>> spreadsheet = new ArrayList<>();

        addRow(spreadsheet);

        for(int i = 0; i < spreadsheetString.length(); i++) {
            String currentChar = Character.toString(spreadsheetString.charAt(i));

            if(currentChar.matches("[0-9]")) {
                String currentNumber = "" +
                        spreadsheet.get(currentRow).get(currentColumn) +
                        currentChar;

                spreadsheet.get(currentRow).set(currentColumn, currentNumber);
            } else if(currentChar.matches("[\n]")){
                addRow(spreadsheet);
            } else {
                addColumn(spreadsheet.get(currentRow));
            }
        }

        return spreadsheet;
    }
}