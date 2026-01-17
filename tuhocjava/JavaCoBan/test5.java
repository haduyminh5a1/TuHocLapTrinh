import java.util.*;
public class test5 {
    public static void main(String[] args) 
    {
    int h = 0;
    int depth = 3;
    for (int i = -depth; i <= depth; i++) {
      int g = i < 0 ? -i : i;
      String ans = "" ;
      for (int j = 0; j < g; j++) ans += " ";
      for (int j = 0; j < (1+ (depth-g)*2); j++) ans += "*";
      for (int j = 0; j < g; j++) ans += " ";

      System.out.println(ans);
      
      h++;
    }
    System.out.println(h);
  }
}
