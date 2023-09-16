import java.util.Scanner;

public class PRAK105_2210817220034_WandaKarliyanti {
    public static void main(String[]args){
        String makanan, hobi;
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit: ");
            makanan= keyboard.nextLine();
        System.out.print("Masukan Hobi: ");
            hobi= keyboard.nextLine();

        System.out.print("\nAku Suka Makan "+ makanan + ", ");
        System.out.print("dan Hobiku " + hobi);
    }
}