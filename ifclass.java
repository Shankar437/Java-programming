import java.util.Scanner;
public class ifclass{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>80){
            System.out.println("a grade");
        }
        else if(a>60 && a<80){
            System.out.println("b grade");
        }
        else if(a>50 && a<60){
            System.out.println("c grade");
        }
        else if(a>40 && a<50){
            System.out.println("d grade");
        }
        else if(a>25 && a<40){
            System.out.println("e grade");
        }
        else(a<25){
            System.out.println("no grade");
        }
    }
}