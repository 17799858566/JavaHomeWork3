import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
       double h = Math.sqrt(Math.abs(Math.pow(x,2))+Math.abs(Math.pow(y,2)));
       if(h<=10){
           System.out.println("yes");
       }
       else{
           System.out.println("no");
       }
    }
}
