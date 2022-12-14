package Artık;
import java.util.Scanner;
public class Year {

    public static void main(String[] args) {
        int year;

        Scanner i = new Scanner(System.in);

        System.out.print("Bir Yıl Giriniz : ");

        year = i.nextInt();

        i.close();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println(year+" Bir artık yıldır");
            } else{
                System.out.println( year+" Bir artık yıl değildir");
            }
        } else if(year % 4 == 0){
            System.out.println(year+" Bir artık yıldır");
        } else{
            System.out.println(year+" Bir artık yıl değildir");
        }
    }
    
}
       // Hakan Çoban
       // https://app.patika.dev/hknxx