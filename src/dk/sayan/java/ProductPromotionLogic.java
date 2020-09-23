package dk.sayan.java;

public class ProductPromotionLogic {

	//************---------------------------method for Product A logic implementation------------------------------************

	public int prodA(int a) {
		int total=0;
		int qan=0;
		if (a !=0 && a<3) 
		{
			total=a*50;
			System.out.println("total a amount :" +total);
			return total;
		}
		else {
			qan= a/3;
			int cn=a%3;
			total= (qan*130)+(cn*50);
			System.out.println("total a amount :" +total);
			return total;
		}

	}
	//************---------------------------method for Product B logic implementation------------------------------************

	public int prodB(int b) {
		int total=0;
		int qan=0;
		if (b !=0 && b<2) 
		{
			total=b*30;
			System.out.println("total b amount :" +total);
			return total;
		}
		else {
			qan= b/2;
			int cn=b%2;
			total= (qan*45)+(cn*30);
			System.out.println("total b amount :" +total);
			return total;
		}

	}
	//************---------------------------method for Product C and D logic implementation------------------------------************

	public int prodCD(int c, int d) {
		int total=0;
		int qan=0;
		if (c !=0 || d !=0) 
		{
			if(c==d)
			{
				total= (c*30);
				System.out.println("total C & D amount :" +total);
			}
			else if(c>d)
			{
				qan= d;
				int noPromoC=(c-d);
				total= (qan*30)+(noPromoC*20);
				System.out.println("total C & D amount :" +total);
			}
			else if(d>c)
			{
				qan= c;
				int noPromoD=(d-c);
				total= (qan*30)+(noPromoD*15);
				System.out.println("total C & D :" +total);
			}
		}
		return total;

	}

	//*****************-------------------this main method is for test only------------------------*********************

	public static void main(String Arr[])
	{
		ProductPromotionLogic pl= new ProductPromotionLogic();
		pl.prodA(3);
		pl.prodB(5);
		pl.prodCD(1,1);
	}

}
