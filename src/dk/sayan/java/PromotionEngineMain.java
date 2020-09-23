package dk.sayan.java;
import java.util.*;

import dk.sayan.java.ProductPromotionLogic;

public class PromotionEngineMain {

	public static void main(String arr[])
	{
		int totA=0,totB=0,totCD=0;
		int cCount=0,dCount=0;
		int totalAmount=0;

		Scanner s=new Scanner(System.in);
		ProductPromotionLogic pl=new ProductPromotionLogic();
		ArrayList<Integer> al=new ArrayList<Integer>(); 

		System.out.print("Insert total different SKU id count for applying promotion(if want to provide values for a,b,c,d then insert 4 or if want to provide values for a,b,c then 3): "); 

		String productCount= s.nextLine(); 
		for(int i=0;i<Integer.parseInt(productCount);i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the SKU id from the list(a, b, c, d)- ");  // taking SKU id input from user
			String sId= sc.nextLine(); 
			System.out.println(sId);
			System.out.print("Enter Item Quantity- ");  // taking unit count for the given id from user
			int qan1= sc.nextInt(); 

			if (sId.equalsIgnoreCase("a"))
			{
				totA=pl.prodA(qan1);
				al.add(totA);
			}
			else if (sId.equalsIgnoreCase("b"))
			{
				totB=pl.prodB(qan1);
				al.add(totB);
			}
			else if (sId.equalsIgnoreCase("c")||sId.equalsIgnoreCase("d"))
			{
				if(sId.equalsIgnoreCase("c"))
					cCount=qan1;

				if(sId.equalsIgnoreCase("d"))
					dCount=qan1;	
			}


		}
		if(cCount!=0 || dCount !=0)
		{
			totCD=pl.prodCD(cCount,dCount);
			al.add(totCD);
		}
		for(int tot:al){
			totalAmount=totalAmount+tot;

		}
		System.out.println("*************Total Amount after applying promotion************ ::" +totalAmount);
	}

}
