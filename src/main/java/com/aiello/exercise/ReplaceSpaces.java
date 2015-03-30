package com.aiello.exercise;



public class ReplaceSpaces {

    private static final char SPACE = ' ';
    private static final String PERCENTAGE_TWENTY = "%20";

    /**
     * Method uses a character array to return the new string
     *
     * @param str
     * @param length
     * @return
     *
     * @author Gayle Laakmann McDowell (http://www.careercup.com
     */
    public static char[] replaceSpacesUsingCharArray(char[] str, int length) {
        int spaceCount = 0, newLength;

        spaceCount = getCountOfSpaces(str, length, spaceCount);

        newLength = length + spaceCount * 2;

        char[] resultArray = new char[newLength];

        loadCharArray(str, length, newLength, resultArray);

        return resultArray;
    }

    private static void loadCharArray(char[] str, int length, int newLength, char[] resultArray) {
        for (int i = length - 1; i >= 0; i--) {
            if(str[i] == SPACE) {
                resultArray[newLength - 1] = '0';
                resultArray[newLength - 2] = '2';
                resultArray[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                resultArray[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
    }

    private static int getCountOfSpaces(char[] str, int length, int spaceCount) {
        int i;
        for(i = 0; i < length-1; i++) {
            if(str[i] == SPACE) {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    /**
     * Method uses a string buffer in order to
     * @param str
     * @return
     *
     * @author Francis Aiello
     */
    public static String replaceUsingStringBuffer(String str) {
        char[] charArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for(char c : charArray) {
            if(c == SPACE) {
                sb.append(PERCENTAGE_TWENTY);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
