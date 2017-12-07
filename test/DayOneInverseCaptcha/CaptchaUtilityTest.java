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

    @Test
    public void IntegerArray12Returns3() {
        String captchaString = "1122";
        ArrayList<Integer> captchaArray = captchaUtility.createIntegerList(captchaString);
        ArrayList<Integer> duplicateCaptchaIntegerArray = captchaUtility.createDuplicateCaptchaIntegerArray(captchaArray);
        Integer captchaSum = captchaUtility.getCaptchaSum(duplicateCaptchaIntegerArray);

        assertEquals("3", captchaSum.toString());
    }

    @Test
    public void integerString1111ReturnsIntegerArray1111() {
        String captchaString = "1111";
        ArrayList<Integer> captchaArray = captchaUtility.createIntegerList(captchaString);
        ArrayList<Integer> duplicateCaptchaIntegerArray = captchaUtility.createDuplicateCaptchaIntegerArray(captchaArray);

        assertEquals("[1, 1, 1, 1]", duplicateCaptchaIntegerArray.toString());
    }

    @Test
    public void integerString1234ReturnsEmptyIntegerArray() {
        String captchaString = "1234";
        ArrayList<Integer> captchaArray = captchaUtility.createIntegerList(captchaString);
        ArrayList<Integer> duplicateCaptchaIntegerArray = captchaUtility.createDuplicateCaptchaIntegerArray(captchaArray);

        assertEquals("[]", duplicateCaptchaIntegerArray.toString());
    }

    @Test
    public void integerString91212129ReturnsIntegerArray9() {
        String captchaString = "91212129";
        ArrayList<Integer> captchaArray = captchaUtility.createIntegerList(captchaString);
        ArrayList<Integer> duplicateCaptchaIntegerArray = captchaUtility.createDuplicateCaptchaIntegerArray(captchaArray);

        assertEquals("[9]", duplicateCaptchaIntegerArray.toString());
    }
}
