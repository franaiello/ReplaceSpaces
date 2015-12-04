package com.aiello.exercise;



public class ReplaceSpaces {

    private static final char SPACE = ' ';
    private static final String PERCENTAGE_TWENTY = "%20";

    /**
     * Method uses a character array to return the new string
     *
     * @param str
     * @return
     *
     * @author Gayle Laakmann McDowell (http://www.careercup.com)
     */
    public static char[] replaceSpacesUsingCharArray(String str) {
        int spaceCount;

        char[] charArray = str.toCharArray();

        spaceCount = getCountOfSpaces(charArray);

        char[] resultArray = loadCharArray(charArray, spaceCount);

        return resultArray;
    }

    /**
     * Walks through each character in char array and replaces each
     * space with '%20'
     * @param charArray
     * @param spaceCount
     * @return
     */
    private static char[] loadCharArray(char[] charArray, int spaceCount) {
        // We need to replace each space in original character array with replacement
        // '%20' but given we already have one space then we multiply by two in
        // order to take into account that space ' ' eliminates the '%' and leaves
        // the '20' hence the resulting times (spaceCount * 2)
        int newLength = charArray.length + (spaceCount * 2);

        char[] resultArray = new char[newLength];

        for (int i = 0, index=0; i<=charArray.length - 1; i++) {
            if(charArray[i] == SPACE) {
                resultArray[index++] = '%';
                resultArray[index++] = '2';
                resultArray[index++] = '0';
            } else {
                resultArray[index] = charArray[i];
                index++;
            }
        }
        return resultArray;
    }



    /**
     * Returns the number of spaces found in character array
     * @param charArray
     * @return
     */
    private static int getCountOfSpaces(char[] charArray) {
        int spaceCount=0;
        for(int i = 0; i < charArray.length-1; i++) {
            if(charArray[i] == SPACE) {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    /**
     * Method uses a string buffer in order to replace spaces ' ' with a '%20'
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
