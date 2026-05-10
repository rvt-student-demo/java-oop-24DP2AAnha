package rvt;
import java.util.Scanner;

public class chap100 {
    public static void main(String[] args) {
        while (true) {

            String sdali = "";
            int dalitajs = 0;

            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Ievadi skaitli, kuru dalīt: ");
            sdali = scanner.nextLine();
            if (sdali.startsWith("q")) {
                scanner.close();
                break;                
            }

            int sdali2;

            try {
                sdali2 = Integer.parseInt(sdali);
            } 
            
            catch (NumberFormatException nfe) { 
                System.out.println("Jus nepareizus datus");
                System.out.println("ludzu meiginiet velreiz");
                continue;
            }

            System.out.print("Ievadi dalītāju: ");
            try {
                dalitajs = Integer.valueOf(scanner.nextLine());
                System.out.println(sdali2 + " / " + dalitajs + " ir " + sdali2 / dalitajs);
            } 
            
            catch (ArithmeticException ae) {
                System.out.println("tu nevari izdalit" + sdali2 + " ar " + dalitajs );
                continue;
            }
        }
    }

}

