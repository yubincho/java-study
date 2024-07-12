import java.util.Arrays;

public class Main {

    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int n = score.length;
        int maxProfit = 0;

        // 배열을 끝에서부터 m개씩 묶어 상자를 만듦
        for (int i = n - m; i >= 0; i -= m) {
            int minScoreInBox = score[i]; // 각 상자에서 최소 점수
            maxProfit += minScoreInBox * m; // 각 상자의 이익을 합산
        }

        return maxProfit;


    }

    public static void main(String[] args) {
        Main sol = new Main();

        // 테스트 케이스 1
        int k1 = 3;
        int m1 = 4;
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};
        int result1 = sol.solution(k1, m1, score1);
        System.out.println(result1); // 결과 출력: 8

        // 테스트 케이스 2
        int k2 = 4;
        int m2 = 3;
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int result2 = sol.solution(k2, m2, score2);
        System.out.println(result2); // 결과 출력: 33


    }

}

