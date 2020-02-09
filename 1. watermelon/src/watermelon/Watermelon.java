
package watermelon;

import java.util.Scanner;
public class Watermelon {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
	int w = s.nextInt();
	if(w<3) System.out.println("no");
        else System.out.println((w%2 == 0)?"yes" : "no");
    }
    
}
