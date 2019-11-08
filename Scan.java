package quiz;

import java.util.Scanner;

public class Scan {

    public char Answer() {
        System.out.println("Poprosze o odpowiednie odpowiedzi( pamietaj to sa pojedyncze znaki): (a , b , c , d )  !");
        		Scanner scan = new Scanner(System.in);
        			char answer = scan.next().charAt(0);
        return answer;
    }
}