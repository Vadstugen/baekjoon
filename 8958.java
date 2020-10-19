import java.util.Scanner;

class struct{
    int num;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        int cnt = 0;
        struct[] arr = new struct[n];
        for(int i=0; i<n; i++){
            arr[i] = new struct();
            str = sc.next();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == 'O'){
                    cnt++;
                    arr[i].num += cnt;
                }
                else{
                    cnt = 0;
                }
            }
            cnt = 0;
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i].num);
        }
    }
}
