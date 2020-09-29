import java.util.Scanner;

class struct{
    int a, b;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        struct[] st = new struct[100];
        int idx = 0;
        while (true){
            st[idx] = new struct();
            st[idx].a = sc.nextInt();
            st[idx].b = sc.nextInt();
            if(st[idx].a == 0 && st[idx].b == 0){
                break;
            }
            idx++;
        }
        for(int i=0; i<idx; i++){
            System.out.println(st[i].a+st[i].b);
        }
    }
}
