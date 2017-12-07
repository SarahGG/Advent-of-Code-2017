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

    public ArrayList<Integer> createDuplicateCaptchaIntegerArray(ArrayList<Integer> captchaArray) {
        ArrayList<Integer> duplicateCaptchaIntegerArray = new ArrayList<>();

        for(int i = 0; i < captchaArray.size(); i++) {
            if((i + 1) == captchaArray.size()) {
                if(captchaArray.get(0).equals(captchaArray.get(i))) {
                    duplicateCaptchaIntegerArray.add(captchaArray.get(i));
                }
            } else {
                if (captchaArray.get(i).equals(captchaArray.get(i + 1))) {
                    duplicateCaptchaIntegerArray.add(captchaArray.get(i));
                }
            }
        }

        return duplicateCaptchaIntegerArray;
    }

    public Integer getCaptchaSum(ArrayList<Integer> duplicateCaptchaIntegerArray){
        Integer captchaSum = 0;

        for(int i =0; i < duplicateCaptchaIntegerArray.size(); i++) {
            captchaSum += duplicateCaptchaIntegerArray.get(i);
        }

        return captchaSum;
    }
}
