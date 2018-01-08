package DayTwoCorruptionCheckSum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the ChecksumCalculator Class
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class CalculatorTest {
    private String spreadsheetString;

    @Before
    public void setUp() {
        spreadsheetString = "5 1 9 5\n" +
                "7 5 3\n" +
                "2 4 6 8";
    }

    @Test
    public void highestNumbersFromEachRowAreNineSevenAndEight() {
        SpreadsheetMaker spreadsheetMaker = new SpreadsheetMaker();
        ArrayList<ArrayList<String>> spreadsheet = spreadsheetMaker.buildSpreadsheet(spreadsheetString);
        ArrayList<Integer> highestNumbers = new ArrayList<>();

        for (ArrayList<String> rows : spreadsheet) {
            highestNumbers.add(Calculator.getHighestNumber(rows));
        }

        assertEquals("[9, 7, 8]", highestNumbers.toString());
    }

    @Test
    public void lowestNumbersFromEachRowAreOneThreeAndTwo() {
        SpreadsheetMaker spreadsheetMaker = new SpreadsheetMaker();
        ArrayList<ArrayList<String>> spreadsheet = spreadsheetMaker.buildSpreadsheet(spreadsheetString);
        ArrayList<Integer> lowestNumbers = new ArrayList<>();

        for(ArrayList<String> rows : spreadsheet) {
            lowestNumbers.add(Calculator.getLowestNumber(rows));
        }

        assertEquals("[1, 3, 2]", lowestNumbers.toString());
    }
}
