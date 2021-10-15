package zadanye4_dop.operatory;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
        System.out.println( "введите число X");
        System.out.println( "введите число Y");
        System.out.println( "введите число Z");
        double numberx = x.nextDouble();
        double numbery = x.nextDouble();
        double numberz = x.nextDouble();
        System.out.println((numberx + numbery + numberz)/3);
        double s = ((numberx + numbery + numberz)/3);
        double t = s/2;
        double u = Math.floor(t);
        if (u > 3) System.out.println("Программа выполнена корретно");
    }
    }
