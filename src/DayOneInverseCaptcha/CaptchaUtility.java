package DayOneInverseCaptcha;

import java.util.ArrayList;

/**
 * Performs captcha operations on a captcha string.
 *
 * @author Sarah Guarino
 * @version 1.0
 */

public class CaptchaUtility {
    public ArrayList<Integer> createIntegerList(String captchaString) {
        ArrayList<Integer> captchaList = new ArrayList<>();

        for(int i = 0; i < captchaString.length() ; i++) {
            captchaList.add(Integer.parseInt(Character.toString(captchaString.charAt(i))));
        }

        return captchaList;
    }
}
