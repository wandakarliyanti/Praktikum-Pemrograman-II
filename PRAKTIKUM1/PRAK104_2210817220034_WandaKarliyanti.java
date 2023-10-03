import java.util.Scanner;

public class PRAK104_2210817220034_WandaKarliyanti {
    public static void main(String[]arg){
        String abu, bagas;
        int poinA=0, poinB=0, i=0 ;
        Scanner input=new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        abu= input.nextLine().toUpperCase();
        System.out.print("Tangan Bagas: ");
        bagas= input.nextLine().toUpperCase();

                while(i<=abu.length()){
                    if(abu.charAt(i)=='G' && bagas.charAt(i)=='B' ||
                       abu.charAt(i)=='K' && bagas.charAt(i)=='G' ||
                       abu.charAt(i)=='B' && bagas.charAt(i)=='K'){
                       poinB++;
                    }
                    else if(abu.charAt(i)=='B' && bagas.charAt(i)=='G' ||
                            abu.charAt(i)=='G' && bagas.charAt(i)=='K' ||
                            abu.charAt(i)=='K' && bagas.charAt(i)=='B'){
                        poinA++;
                    }
                    i+=2;
                }
                if(poinA>poinB){
                    System.out.print("Abu");
                }
                else if(poinB>poinA){
                    System.out.print("Bagas");
                }
                else{
                    System.out.print("Seri");
                }
    }
}
