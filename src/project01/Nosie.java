package project01;

import java.util.Scanner;

public class Nosie {
	Scanner sc = new Scanner(System.in);
	   private int butt;
	   
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


