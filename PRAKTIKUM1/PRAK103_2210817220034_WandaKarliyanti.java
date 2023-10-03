import java.util.Scanner;

public class PRAK103_2210817220034_WandaKarliyanti {
    public static void main(String[]args){
        int N, bil_awal, i=0;
        Scanner input=new Scanner(System.in);
        N= input.nextInt();
        bil_awal= input.nextInt();

        do{
            if(bil_awal%2!=0){
                System.out.print(bil_awal);
                i++;
                if(i<N){
                    System.out.print(",");
                }
            }
            bil_awal++;
        }
        while(i<N);
    }
}
