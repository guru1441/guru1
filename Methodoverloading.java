package helloworld;

public class Methodoverloading {

	  
		static int addition(int a,int b)
		{
			return a+b;
		}  
		static int addition(int a,int b,int c)
		{
			return a+b+c;
		}  
	 public static void main(String[] args){  
		
		 System.out.println(Methodoverloading.addition(15,20));  
		
		 System.out.println(Methodoverloading.addition(10,30,20));  
	} 
}
