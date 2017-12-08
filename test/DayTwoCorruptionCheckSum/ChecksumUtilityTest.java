package DayTwoCorruptionCheckSum;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test class for the ChecksumUtility Class
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class ChecksumUtilityTest {
    public ChecksumUtility checksumUtility;

    @Before
    public void setUp() {
        checksumUtility = new ChecksumUtility();
    }

    @Test
    public void checksumStringReturnsArrayOfStrings() {
        String spreadsheet = "5 1 9 5\n" +
                "7 5 3\n" +
                "2 4 6 8";
        List<String> checksumStringArray = checksumUtility.getSpreadsheetRows(spreadsheet);
        assertEquals("[5 1 9 5, 7 5 3, 2 4 6 8]", checksumStringArray.toString());
    }
}
