package typing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TypingGame {

    public static void main(String[] args) {
        // 1. 파일에서 단어 읽기
        
        try (BufferedReader br = new BufferedReader(new FileReader("word.txt"))) {
            String str;
            String[] words = null;
            while ((str = br.readLine()) != null) {
                words = str.split(" ");
                
            }

        // 2. 게임 시작
        int n = 1;
        long start, end;
        double elapsedTime;

        Scanner sc = new Scanner(System.in);
        System.out.println("[타자 게임], 준비되면 엔터>");
        sc.nextLine();  // 엔터 입력 대기

        start = System.currentTimeMillis();  // 시작 시간 기록

        

        while (n <= 11) {
            System.out.println("\n문제 " + n);
            Random rnd = new Random();
            int rndIdx = rnd.nextInt(words.length);
            String question = words[rndIdx];
            System.out.println(question);
            
            String answer = sc.nextLine();

            if (answer.equals(question)) {
                System.out.println("통과!");
                n++;
            } else {
                System.out.println("오타! 다시 도전!");
            }
        }

        end = System.currentTimeMillis();
        elapsedTime = (double)(end - start) / 1000;
        System.out.printf("게임 시간: %.2f초\n", elapsedTime);
        }catch (IOException e) {
			
		}
    }
}














