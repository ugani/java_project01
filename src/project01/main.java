package project01;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	int num;
	while(true) {
	Scanner scan = new Scanner(System.in);
	System.out.println("1번 노이즈캔슬링 설정 2번 볼륨 조절");
	num = scan.nextInt();
	
	if(num == 1) {
		 Scanner sc = new Scanner(System.in);

		 Nosie n = new Nosie();
	      n.setButt(0);
	      int re = n.getButt();
	      if(re == 1) {
	         System.out.println("노이즈 캔슬링이 켜졌습니다.");
	      }else if(re == 2) {
	         System.out.println ("노이즈 캔슬링이 꺼졌습니다.");
	      }
		
	}else if(num ==2) {
		Vol v = new Vol();
		v.setVol(0);
		int re = v.getVol();
		System.out.println("볼륨 : " + re);
		
	}else {
		System.out.println("잘 못 입력하셨습니다.");
	}
	}
	
	}
}
