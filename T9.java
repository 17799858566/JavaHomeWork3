import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float x=input.nextFloat();
        float y=input.nextFloat();
        if(y>(100-0.5*x)||x<0||y<0){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}
