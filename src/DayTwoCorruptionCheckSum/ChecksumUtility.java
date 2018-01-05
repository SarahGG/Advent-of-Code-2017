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
public class ChecksumUtility {
    public List<String> getSpreadsheetRows(String spreadsheet) {
        return Arrays.asList(spreadsheet.split("\n"));
    }

    public ArrayList<List<String>> getSpreadsheetColumns(List<String> checksumStringArray) {
        ArrayList<List<String>> spreadsheetStringArray = new ArrayList<>();

        for(String arrayRow : checksumStringArray) {
            spreadsheetStringArray.add(Arrays.asList(arrayRow.split("\\s+")));
        }

        return spreadsheetStringArray;
    }
}