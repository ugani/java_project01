package project01;

import java.util.Scanner;

public class Vol {
	private int vol, num;
	
	public void setVol(int num) {
		vol = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("볼륨을 높이시려면 1, 줄이시려면 2를 입력하세요");
		num = scan.nextInt();
		
		if (num == 1) {
			++vol;
			System.out.println("볼륨을 1 높혔습니다");
		}else if(num == 2) {
			--vol;
			System.out.println("볼륨을 1 줄였습니다");
		}else {
			System.out.println("잘 못 입력하셨습니다");
		}
	}
	
	public int getVol() {
		return vol;
	}
	
}

