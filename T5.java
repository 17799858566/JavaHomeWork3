import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Year:");
        int year=input.nextInt();
        System.out.println("Month:");
        int month=input.nextInt();
        month=month%12;
        if(month==0)
            month=12;
        System.out.println("Day:");
        int day=input.nextInt();

        int h=(int)Math.ceil((day+(26*(month+1)/10.0)+year%100+(year%100)/4.0+Math.abs(year/100.0)/4.0+5*Math.abs(year/100.0)))%7;

        switch(h){
            case 1: System.out.println("周日");
            break;
            case 2: System.out.println("周一");
                break;
            case 3: System.out.println("周二");
                break;
            case 4: System.out.println("周三");
                break;
            case 5: System.out.println("周四");
                break;
            case 6: System.out.println("周五");
                break;
            case 0: System.out.println("周六");
                break;


        }
    }
}
