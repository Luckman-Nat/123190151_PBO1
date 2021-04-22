package bangunGeometri;

import java.util.Scanner;

public class Cek {
    String Data,nol;
    int angka;
    Scanner input = new Scanner(System.in);
    int data(){
        try{
            Data= input.nextLine();
            angka = Integer.parseInt(Data);
        }
        catch (NumberFormatException error) {
            System.out.println(error.getMessage() + " Sebaiknya input angka saja");
        }
        if(Data.equals("0"))
        {
            System.out.println(" Sebaiknya input besar lebih dari 0");
        }
        return angka;
    }

}
