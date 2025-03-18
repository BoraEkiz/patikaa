import java.util.Scanner;

public class sayiyuvarlama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lütfen bir sayı giriniz");
        double sayi1 = scanner.nextDouble();




        System.out.printf("Aşağı yuvarlama " + Math.floor(sayi1) + "\n"+
                          "Yukarı Yuvarlama " + Math.ceil(sayi1) +"\n"+
                           "En Yakın Tamsayı " + Math.round(sayi1) );


        scanner.close();
    }
}
