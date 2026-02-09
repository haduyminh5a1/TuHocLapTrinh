package JavaNangCao.leetcode.leetcode;

public class FirstOccurenceinaString {
    public static int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        int m = haystack.length();
        int n = needle.length();
        
        if (n == 0) return 0;

        for (int i=0;i<=m-n;i++){
            int j = 0;
            while (j < n && (haystack.charAt(i+j) == needle.charAt(j))){
                j++;
            }
            if (j == n){
                return i;
            }
        }
        return -1;
    }
}
