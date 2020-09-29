import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if((a+b)>c&&(a+c)>b&&(b+c)>a){
            System.out.println(a+b+c);
        }
        else{
            System.out.println("不合法");
        }
    }
}
