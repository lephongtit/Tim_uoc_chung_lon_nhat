import java.util.Scanner;

public class Tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a,b;
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter a: ");
        a= sr.nextInt();
        System.out.println("Enter b: ");
        b= sr.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0)
            System.out.println("No greatest common factor");
         while (a!=b){
             if(a>b)
                 a=a-b;
             else
                 b=b-a;
         }
        System.out.println("Greatest common factor: "+a);
    }
}
