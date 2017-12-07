package DayOneInverseCaptcha;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Testing class for the Captcha Utility Class.
 *
 * @author Sarah Guarino
 * @version 1.0
 */

public class CaptchaUtilityTest {
    private CaptchaUtility captchaUtility;

    @Before
    public void setUp() {
        captchaUtility = new CaptchaUtility();
    }

    @Test
    public void integerStringReturnsSingleDigitIntegerArray() {
        String captchaString = "1122";
        ArrayList<Integer> captchaArray = captchaUtility.createIntegerList(captchaString);
        assertEquals("[1, 1, 2, 2]", captchaArray.toString());
    }

    @Test
    public void integerString1122ReturnsIntegerArray12() {
        String captchaString = "1122";
        ArrayList<Integer> captchaArray = captchaUtility.createIntegerList(captchaString);
        ArrayList<Integer> duplicateCaptchaIntegerArray = captchaUtility.createDuplicateCaptchaIntegerArray(captchaArray);

        assertEquals("[1, 2]", duplicateCaptchaIntegerArray.toString());
    }
}
