import java.util.Scanner;

class struct{
    double num;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double max = 0;
        struct[] arr = new struct[n];
        for(int i=0; i<n; i++){
            arr[i] = new struct();
            arr[i].num = sc.nextInt();
            if(arr[i].num > max){
                max = arr[i].num;
            }
        }
        for(int i=0; i<n; i++){
            arr[i].num = arr[i].num/max*100;
        }
        max = 0;
        for(int i=0; i<n; i++){
            max += arr[i].num;
        }
        System.out.println(max/n);
    }
}
