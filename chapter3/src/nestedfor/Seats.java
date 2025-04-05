package nestedfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		/*
		 * 입장객 수에 따른 줄을 만들어 자리배치하는 프로그램
		 * 입장객수와 좌석열이 나누어 떨어지는 경우
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력: ");
		int cu = sc.nextInt();
		System.out.print("좌석 열 입력: ");
		int se= sc.nextInt();
		int row;     // 줄 수

		
		if(cu % se == 0){
			row = (int)(cu/se);
		}else {
			row = (int)(cu/se) + 1;
		}
		
	
		//System.out.println(row); 
		//자리 배치도
		System.out.println("======자리 배치도======");
		for(int i = 0 ; i <= row; i++) {
			for(int j = 1; j <= se ; j++) {
				int seat = i * se + j;
				if (seat>cu)
					break;
				System.out.print("좌석" + seat+ " ");
			}
			System.out.println();
			
		}
	
	
	
	}

}
