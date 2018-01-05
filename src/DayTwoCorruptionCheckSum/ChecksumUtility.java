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

    public Integer getHighestNumber(List<String> spreadsheetRow) {
        Integer highestNumber = Integer.parseInt(spreadsheetRow.get(0));

        for(String stringNumber : spreadsheetRow) {
            Integer intNumber = Integer.parseInt(stringNumber);

            if(intNumber > highestNumber) {
                highestNumber = intNumber;
            }
        }
        return highestNumber;
    }

    public Integer getLowestNumber(List<String> spreadsheetRow) {
        Integer lowestNumber = Integer.parseInt(spreadsheetRow.get(0));

        for(String stringNumber : spreadsheetRow) {
            Integer intNumber = Integer.parseInt(stringNumber);

            if(intNumber < lowestNumber) {
                lowestNumber = intNumber;
            }
        }
        return lowestNumber;
    }
}
