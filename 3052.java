import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] ck = new int[100];
        int cnt = 0;
        int idx = 0;
        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
            idx = num[i] % 42;
            ck[idx]++;
        }
        for(int i=0; i<100; i++){
            if(ck[i] != 0){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
