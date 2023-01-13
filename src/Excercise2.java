
/*
01
2. int arr[3]; //배열은 항상 초기화를 해야 한다.
4. int arr[3] = new int[3]; //문법이 맞지 않다..?
 */


public class Excercise2 {
    public static void main(String[] args) {

        int[][] arr = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };
        System.out.println("arr의 길이: " + arr.length);
        System.out.println("arr[2]의 길이: " + arr[2].length);
    }
}

