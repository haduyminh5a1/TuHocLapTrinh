package JavaNangCao.DSAPractice.leetcode.leetcode;
import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        for (char c : s.toCharArray()){
            while (set.contains(c)){
                set.remove(result.charAt(0));
                result.deleteCharAt(0);
            }

            set.add(c);
            result.append(c);
            maxLength = Math.max(maxLength, result.length());
        }
        return maxLength;

        //Two Pointers
    /*  int left = 0;
        int right = 0; // Bắt đầu cả 2 tại điểm xuất phát
        int max = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                // Nếu chưa có: Mở rộng con trỏ bên phải
                set.add(s.charAt(right));
                right++; // "Người đi trước" tiến lên
                max = Math.max(max, right - left);
            } else {
                // Nếu trùng: Thu hẹp con trỏ bên trái
                set.remove(s.charAt(left));
                left++; // "Người đi sau" tiến lên để giải quyết xung đột
            }
        }
        return max; */

        //Sliding Window
    /*  int maxlength = 0;
        Set<Character> charset = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Nếu gặp ký tự trùng, thu hẹp cửa sổ từ bên trái cho đến khi hết trùng
            while (charset.contains(currentChar)) {
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(currentChar);
            // Cập nhật độ dài lớn nhất sau mỗi bước dịch con trỏ right
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength; */
    }
}
