import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String num = sc.next();
        int[] n2 = new int[3];
        int result = 0;
        for(int i=0; i<3; i++){
            n2[i] = Integer.parseInt(num.substring(i, i+1));
        }
        result = n1 * n2[2];
        System.out.println(n1 * n2[2]);
        result += (n1 * n2[1])*10;
        System.out.println(n1 * n2[1]);
        result += (n1 * n2[0])*100;
        System.out.println(n1 * n2[0]);

        System.out.println(result);
    }
}
