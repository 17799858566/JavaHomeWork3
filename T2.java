import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int[] Num=new int[10];
        int d10=0;
        for(int i=0;i<9;i++){
            if(num==0){
                Num[9-i]=0;
            }
            else {
                d10 = d10 + num % 10 * (9 - i);
                Num[9-i]=num%10;
                num = num / 10;
            }
        }
        d10=d10%11;
        if(d10==10){
            System.out.println(""+Num[1]+Num[2]+Num[3]+Num[4]+Num[5]+Num[6]+Num[7]+Num[8]+Num[9]+"X");
        }
        else{
            System.out.println(""+Num[1]+Num[2]+Num[3]+Num[4]+Num[5]+Num[6]+Num[7]+Num[8]+Num[9]+d10);
        }

    }
}
