import java.util.Arrays;

public class Excercise4 {
    public static void main(String[] args) {
        //각각의 인덱스에 해당하는 값의 제곱값을 대입하는 코드
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        int[] num2 = new int[10];

        for (int i =0; i < 10; i++){
           num2[i] = num1[i] * num1[i];
        }
        System.out.println(Arrays.toString(num2));
    }
}
