import java.util.Scanner;

public class Linear_search {
 public static int Linear_search(int numbers[], int key) {
    for(int i=0; i<numbers.length; i++){
        if (numbers[i] == key) {
        return i;
        }
    }
    return -1;
 }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,667,4,7};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int answer = Linear_search(numbers,key);
        System.out.println(answer);
    }
}
