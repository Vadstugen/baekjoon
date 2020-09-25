import java.util.Scanner;

class struct{
    int sum;
    public struct(int A, int B){
        this.sum = A + B;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a;
        int b;
        struct[] st = new struct[t];
        for(int i=0; i<t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            st[i] = new struct(a, b);
        }
        for(int i=0; i<t; i++){
            System.out.println(st[i].sum);
        }
    }
}
