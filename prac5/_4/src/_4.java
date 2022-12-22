import java.util.Scanner;

public class _4 {

    public static int func(int x){
        if(x==0)
            return 0;
        return (x%10+func(x/10));

    }

    public static int pow(int x, int a){
        int ans = x;
        for(int i = 1; i < a; i++)
            x*=ans;
        return x;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите значения k и d: ");
        int k = scan.nextInt();
        int d = scan.nextInt();

        int ans = 0;

        for(int i = pow(10, k); i < pow(10,k+1)-1; i++){
            if(func(i)==d)
                ans+=1;
        }

        System.out.print("ans is: " + ans);
    }

}
