package com.stringbuffer.ConcatenateStrings;

public class ConcatenateStrings {
	public static String ofArray(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
