import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        if(Math.abs(x)<=5&&Math.abs(y)<=2.5){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
