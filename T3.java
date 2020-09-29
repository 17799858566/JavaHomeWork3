import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int lottery=(int)(Math.random()*1000);
        System.out.println("彩票:"+lottery);
        int z=0;

        int[] lotteryDigit=new int[3];
        lotteryDigit[0]=lottery%10;
        lotteryDigit[1]=(lottery/10%10);
        lotteryDigit[2]=lottery/100;

        int[] numDigit=new int[3];
        numDigit[0]=num%10;
        numDigit[1]=(num/10%10);
        numDigit[2]=num/100;


        if(num==lottery){
            System.out.println("$10000");
        }
        else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (numDigit[j] == lotteryDigit[i]) {
                        z++;
                        numDigit[j] = -1;
                        lotteryDigit[i] = -2;
                    }
                }
            }
            if(z==3){
                System.out.println("$3000");
            }
            else if(z==1){
                System.out.println("$1000");
            }
        }
    }
}
