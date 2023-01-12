public class CarExample {
    public static void main(String[] args) {
//        00*
//        0***
//        *****
//         ***
//          *
//        for(int i = 2; i>=0; i--){
//            for(int j = 0; j<i; j++){
//                System.out.print("0");
//            }
//            for(int k = i; k<i * 3 - 1; k++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }

        //구구단을 반복문 하나로 구현하기
//        2 * 1 = 2
//        2 * 2 = 4
//        2 * 3 = 6
//        2 * 4 = 8
//        2 * 5 = 10
//        2 * 6 = 12
//        2 * 7 = 14
//        2 * 8 = 16
//        2 * 9 = 18

        for (int i = 18; i<90; i++){
            System.out.println(i / 9 + " * " + (i % 9 + 1) + " = " + (i/9 * (i % 9 + 1)));
        }


//           *
//          ***
//         *****
//          ***
//           *

    }
}