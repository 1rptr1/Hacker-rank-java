import java.util.Scanner;

public class Solve_Me_First {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int c = addition(a,b);
        System.out.println(c);
    }

    static int addition(int a, int b)
    {
        return a + b;
    }
}
