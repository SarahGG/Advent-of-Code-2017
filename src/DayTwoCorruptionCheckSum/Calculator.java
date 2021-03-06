package DayTwoCorruptionCheckSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Performs Basic Mathematical Calculations
 * For Advent Of Code
 * Day Two: Corruption Checksum
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class Calculator {
    public static Integer getHighestNumber(List<String> spreadsheetRow) {
        Integer highestNumber = Integer.parseInt(spreadsheetRow.get(0));

        for(String stringNumber : spreadsheetRow) {
            Integer intNumber = Integer.parseInt(stringNumber);

            if(intNumber > highestNumber) {
                highestNumber = intNumber;
            }
        }
        return highestNumber;
    }

    public static Integer getLowestNumber(List<String> spreadsheetRow) {
        Integer lowestNumber = Integer.parseInt(spreadsheetRow.get(0));

        for(String stringNumber : spreadsheetRow) {
            Integer intNumber = Integer.parseInt(stringNumber);

            if(intNumber < lowestNumber) {
                lowestNumber = intNumber;
            }
        }
        return lowestNumber;
    }

    public static Integer getDifference(List<String> row) {
        return (getHighestNumber(row) - getLowestNumber(row));
    }

    public static Integer getChecksum(ArrayList<List<String>> spreadsheet) {
        Integer checksum = 0;

        for(List<String> row : spreadsheet) {
            checksum += (getDifference(row));
        }

        return checksum;
    }
}
