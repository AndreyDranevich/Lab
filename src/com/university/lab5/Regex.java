package com.university.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Andrey on 20.10.2016.
 */

public class Regex {
    public static String isCorrectText(String reg) {
        String temp = reg;
        String ReturnString;
        Pattern p = Pattern.compile("\\*[^*].+\\*");
        Matcher m = p.matcher(reg);
        int start = 0;
        if (m.matches()) {
            ReturnString = temp.substring(start, m.start()) + "<em>" + temp.substring(m.start() + 1, m.end() - 1) + "</em>";
        } else
            ReturnString = temp;
        return ReturnString;
    }

    public static boolean isCorrectTime(String reg) {
        Pattern p = Pattern.compile("^([0-1]\\d|[2][0-3]):[0-5]\\d$");
        Matcher m = p.matcher(reg);
        return m.find();
    }

    public static boolean isCorrectGUID(String reg) {
        Pattern p = Pattern.compile("(^[0-9A-Fa-f]{8}-([0-9A-Fa-f]{4}-){3}[0-9A-Fa-f]{12}$)|" +
                "(\\{[0-9A-Fa-f]{8}-([0-9A-Fa-f]{4}-){3}[0-9A-Fa-f]{12}\\})");
        Matcher m = p.matcher(reg);
        return m.find();
    }

    public static boolean isCorrectIPV4(String reg) {
        Pattern p = Pattern.compile("(([0-1]?\\d?\\d|2[0-4]\\d|25[0-5]|0x[[0-9A-Fa-f]]{1,2}|0([1-3]?[0-7]?[0-7]?))\\.){3}" +
                "([0-1]?\\d?\\d|2[0-4]\\d|25[0-5]|0x[[0-9A-Fa-f]]{1,2}|0[1-3]?[0-7]?[0-7]?)");
        Matcher m = p.matcher(reg);
        return m.find();
    }

    public static boolean isCorrectURL(String reg) {
        Pattern p = Pattern.compile("((http|https)://)?(www\\.|sub\\.)?[a-z]+[-]?[a-z]+\\.(com|ru|ua)(:\\d{4})?" +
                "(/[a-z-!@?=.+#$%^&*_0-9]+){0,}");
        Matcher m = p.matcher(reg);
        return m.find();
    }

    public static boolean isCorrectDate(String reg) {
        Pattern p = Pattern.compile("((([0-2][1-9]|[12]0|3[01])/(0[13578]|1[02]))|(([0-2][1-9]|[123]0)/(0[469]|11))|" +
                "((([0-2][1-8]|[12]0)/02)))/[1-9]\\d{3}");
        Matcher m = p.matcher(reg);
        return m.find();
    }

    public static boolean isCorrectHtmlColours(String reg) {
        Pattern p = Pattern.compile("^#[0-9A-Fa-f]{6}$");
        Matcher m = p.matcher(reg);
        return m.find();
    }

    public static String tokens(String reg){
        List<String> itemsList = new ArrayList<String>();
        Pattern p = Pattern.compile("([a-zA-Z']+((-?[a-zA-Z'])|[a-zA-Z']*)+)|(\".+\")");
        Matcher m = p.matcher(reg);
        while (m.find()){
            itemsList.add(m.group());
        }
        String temp;
        temp = toStr(itemsList);
        return temp;
    }

    private static String toStr(List<String> arrayList){
        String temp = " ";
        for (int i=0;i<arrayList.size();i++){
            temp = temp + arrayList.get(i) + ",";
        }
        return temp;
    }

    public static boolean isCorrectIrc(String reg) {
        Pattern p = Pattern.compile("[_|^\\[\\]a-z]{2,}![a-z]+@[a-z]+(\\.[a-z]+)?\\s+PRIVMSG\\s+#[a-z]+\\s+:.+");
        Matcher m = p.matcher(reg);
        return m.find();
    }


}
