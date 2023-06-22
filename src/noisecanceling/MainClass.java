package noisecanceling;

import java.util.Scanner;

class NoiseCanceling {
	
	   Scanner sc = new Scanner(System.in);
	   int butt;
	   
	   public int getButt() {
	      return butt;
	   }
	   
	   public void setButt(int butt) {
	      System.out.println("1. 켜짐");
	      System.out.println("2. 꺼짐");
	      System.out.print(": ");
	      butt = sc.nextInt();
	      
	      if(butt == 1 ) {
	         
	      }else if(butt == 2) {
	        
	      }
	      this.butt = butt;
	   }
}



class volume{
	int volume, num;
	
	public void setVolume(int num) {
		volume = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("볼륨을 높이시려면 1, 줄이시려면 2를 입력하세요");
		num = scan.nextInt();
		
		if (num == 1) {
			++volume;
			System.out.println("볼륨을 1 높혔습니다");
		}else if(num == 2) {
			--volume;
			System.out.println("볼륨을 1 줄였습니다");
		}else {
			System.out.println("잘 못 입력하셨습니다");
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
}


public class MainClass {

	public static void main(String[] args) {

		int num;
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1번 노이즈캔슬링 설정 2번 볼륨 조절");
		num = scan.nextInt();
		
		if(num == 1) {
			 Scanner sc = new Scanner(System.in);

			 NoiseCanceling n = new NoiseCanceling();
		      n.setButt(n.butt);
		      int re = n.getButt();
		      if(re == 1) {
		         System.out.println("노이즈 캔슬링이 켜졌습니다.");
		      }else if(re == 2) {
		         System.out.println("노이즈 캔슬링이 꺼졌습니다.");
		      }
			
		}else if(num ==2) {
			volume v = new volume();
			v.setVolume(0);
			int re = v.getVolume();
			System.out.println("볼륨 : " + re);
			
		}else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		}
		
	}

}
