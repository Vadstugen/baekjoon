import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int num = n1*n2*n3;
        String number = num+"";
        int len = number.length();
        int zero = 0;

        int[] cnt = new int[9];
        for(int i=0; i<len; i++){
            int n = number.charAt(i);
            n -= 48;
            if(n == 0){
                zero++;
            }
            else{
                cnt[n-1]++;
            }
        }
        System.out.println(zero);
        for(int i=0; i<9; i++){
            System.out.println(cnt[i]);
        }
    }
}
