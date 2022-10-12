import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n1 = klavye.nextInt();
        System.out.print("Bir Sayı Giriniz :");
        int n2 = klavye.nextInt();
        int min, max;
        int ebob = 1;
        int ekok = 1;

        if(n1>n2)
        {
            min = n2;
            max = n1;
        }
        else
        {
            min = n1;
            max = n2;
        }
        int i = min;

        while(i>=1)
        {
            if(min%i == 0 && max%i == 0 )
            {
                ebob = i;
                break;
            }
            i--;
        }

        ekok = (max*min)/ebob;


        System.out.println("ekok: "+ekok+" ebob: "+ebob);
    }
}