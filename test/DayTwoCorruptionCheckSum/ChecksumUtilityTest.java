package DayTwoCorruptionCheckSum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the ChecksumUtility Class
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class ChecksumUtilityTest {
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
    public void checksumStringReturnsArrayOfStrings() {
        assertEquals("[5 1 9 5, 7 5 3, 2 4 6 8]", checksumStringArray.toString());
    }

    @Test
    public void checksumArrayOfRowsReturnsArrayOfRowsAndColumns() {
        assertEquals("[[5, 1, 9, 5], [7, 5, 3], [2, 4, 6, 8]]", checksumStringArrayArray.toString());
    }
}
