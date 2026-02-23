package JavaNangCao.leetcode.leetcode;

public class ExcelSheetColumnTitle_RecursionVer {
    public static String convertToTitle(int columnNumber){
        if (columnNumber == 0) return "";
        columnNumber--;
        return convertToTitle(columnNumber / 26) + (char) ('A' + (columnNumber % 26));
    }
}
