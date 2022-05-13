import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Parser parser = new Parser(" 1592 + 8  ");
        Rechnung r1 = parser.parse();
        System.out.println(r1.rechne());
        /*parser = new Parser(" 12197534 - 28836  ");
        parser.parse();
        parser = new Parser(" 122025545662 * 80000008  ");
        parser.parse();
        parser = new Parser("   19566642  /   88     ");
        parser.parse();*/
        Parser parser1 = new Parser("23-23");
        Rechnung rechnung = parser1.parse();
        System.out.println(rechnung.rechne());
        Parser parser2 = new Parser(" 30 * 3");
        System.out.println(parser2.parse().rechne());
        Parser parser3 = new Parser("                     15          /               2     ");
        System.out.println(parser3.parse().rechne());



    }
}
