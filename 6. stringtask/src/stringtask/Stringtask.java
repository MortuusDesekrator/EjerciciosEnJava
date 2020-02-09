
package stringtask;
import java.util.*;
public class Stringtask {

  public static void main(String[] args) {
         	Scanner sc = new Scanner(System.in);
	String s=sc.next();    
    s=s.toLowerCase();
    s=s.replaceAll("[aeiouy]","");
   System.out.println(s.replaceAll("(.)",".$1"));
    
    }
    
}