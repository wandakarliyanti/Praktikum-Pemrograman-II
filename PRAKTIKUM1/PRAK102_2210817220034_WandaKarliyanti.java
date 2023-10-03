import java.util.Scanner;

public class PRAK102_2210817220034_WandaKarliyanti {
    public static void main(String[]args){
        int bil, i=1;
        Scanner input=new Scanner(System.in);
        bil= input.nextInt();

        while(i<=11){
            if(bil%5==0){
                System.out.print(bil/5-1);
            }
            else {
                System.out.print(bil);
            }
            if(i<11){
                System.out.print(",");
            }
        bil++;
        i++;
        }
    }
}
