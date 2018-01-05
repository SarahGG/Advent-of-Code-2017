package DayTwoCorruptionCheckSum;

import java.util.List;

/**
 * Performs Basic Mathematical Calculations
 * For Advent Of Code
 * Day Two: Corruption Checksum
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class ChecksumCalculator {
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
}
