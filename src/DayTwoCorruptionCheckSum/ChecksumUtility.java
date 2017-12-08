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
}
