package DayTwoCorruptionCheckSum;

import java.util.ArrayList;

/**
 * Performs Basic Mathematical Calculations
 * For Advent Of Code
 * Day Two: Corruption Checksum
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class Calculator {
    public static Integer getHighestNumber(ArrayList<String> spreadsheetRow) {
        Integer highestNumber = Integer.parseInt(spreadsheetRow.get(0));

        for(String stringNumber : spreadsheetRow) {
            Integer intNumber = Integer.parseInt(stringNumber);

            if(intNumber > highestNumber) {
                highestNumber = intNumber;
            }
        }
        return highestNumber;
    }

    public static Integer getLowestNumber(ArrayList<String> spreadsheetRow) {
        Integer lowestNumber = Integer.parseInt(spreadsheetRow.get(0));

        for(String stringNumber : spreadsheetRow) {
            Integer intNumber = Integer.parseInt(stringNumber);

            if(intNumber < lowestNumber) {
                lowestNumber = intNumber;
            }
        }
        return lowestNumber;
    }

    public static Integer getDifference(ArrayList<String> row) {
        return (getHighestNumber(row) - getLowestNumber(row));
    }

    public static Integer getChecksum(ArrayList<ArrayList<String>> spreadsheet) {
        Integer checksum = 0;

        for(ArrayList<String> row : spreadsheet) {
            checksum += (getDifference(row));
        }

        return checksum;
    }
}
