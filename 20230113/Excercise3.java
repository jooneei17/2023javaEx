package test;

public class Excercise3 {
	public static void main(String[] args) {
		int[] score = new int[] {90, 80, 60, 100};
		int totalScore = 0;
		double avgScore = 0.0;
		int[] var5 = score;
		int var6 = score.length;
		
		for (int i = 0; i < var6; i++) {
			int s = var5[i];
			totalScore += s;
		}
		
		avgScore = (double)totalScore / score.length;
		System.out.println("합계 점수: " + totalScore);
		System.out.println("평균 점수: " + avgScore);
	}
}
