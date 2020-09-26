import java.util.Scanner;
class struct{
    int a, b;
    int sum(){
        return a+b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        struct[] st = new struct[t];
        for(int i=0; i<t; i++){
            st[i] = new struct();
            st[i].a = sc.nextInt();
            st[i].b = sc.nextInt();
        }
        for(int i=0; i<t; i++){
            System.out.println("Case #"+(i+1)+": "+st[i].sum());
        }
    }
}
