import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float x1=input.nextFloat();
        float y1=input.nextFloat();
        float r1=input.nextFloat();

        float x2=input.nextFloat();
        float y2=input.nextFloat();
        float r2=input.nextFloat();

        float jl=(float)Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        if(jl<=Math.abs(r1-r2)){
            System.out.println("in");
        }
        else if(jl<=r1+r2){
            System.out.println("over");
        }
        else{
            System.out.println("out");
        }
    }
}
