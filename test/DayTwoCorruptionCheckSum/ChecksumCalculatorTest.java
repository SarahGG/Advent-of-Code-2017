package DayTwoCorruptionCheckSum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the ChecksumCalculator Class
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class ChecksumCalculatorTest {
    private  ChecksumUtility checksumUtility;
    private String spreadsheet;
    private List<String> checksumStringArray;
    private ArrayList<List<String>> checksumStringArrayArray;


    @Before
    public void setUp() {
        checksumUtility = new ChecksumUtility();
        spreadsheet = "5 1 9 5\n" +
                "7 5 3\n" +
                "2 4 6 8";
        checksumStringArray = checksumUtility.getSpreadsheetRows(spreadsheet);
        checksumStringArrayArray = checksumUtility.getSpreadsheetColumns(checksumStringArray);
    }

    @Test
    public void highestNumbersFromEachRowAreNineSevenAndEight() {
        ArrayList<Integer> highestNumbers = new ArrayList<>();

        for (List<String> rows : checksumStringArrayArray) {
            highestNumbers.add(ChecksumCalculator.getHighestNumber(rows));
        }

        assertEquals("[9, 7, 8]", highestNumbers.toString());
    }

    @Test
    public void lowestNumbersFromEachRowAreOneThreeAndTwo() {
        ArrayList<Integer> lowestNumbers = new ArrayList<>();

        for(List<String> rows : checksumStringArrayArray) {
            lowestNumbers.add(ChecksumCalculator.getLowestNumber(rows));
        }

        assertEquals("[1, 3, 2]", lowestNumbers.toString());
    }
}
