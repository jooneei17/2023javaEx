public class Excercise3 {
    public static void main(String[] args) {
        //배열에 담긴 점수들의 합계와 평균 구하기
        int[] score = {90, 80, 60, 100};

        int totalScore = 0;
        double avgScore = 0;

        for(int s : score){
            totalScore += s;
        }
        avgScore = (double)totalScore / score.length;

        System.out.println("합계 점수: " + totalScore);
        System.out.println("평균 점수: " + avgScore);
    }
}
