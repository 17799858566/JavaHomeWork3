import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float x1=input.nextFloat();
        float y1=input.nextFloat();
        float w1=input.nextFloat();
        float h1=input.nextFloat();

        float x2=input.nextFloat();
        float y2=input.nextFloat();
        float w2=input.nextFloat();
        float h2=input.nextFloat();

        if(Math.abs((x1-x2))>(w1/2.0+w2/2.0)&&Math.abs((y1-y2))>(h1/2.0+h2/2.0)){
            System.out.println("out");
        }
        else if((Math.abs(x1-x2)+w2/2.0)<=w1/2.0&&(Math.abs(y1-y2)+h2/2.0)<=h1/2.0){
            System.out.println("in");
        }
        else{
            System.out.println("over");
        }
    }
}
