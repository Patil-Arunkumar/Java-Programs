package practicepgms;

public class Nonstatic 
{
	void area(int a)
	{
		 
		 double b=1.5;
		double res=a*b;
		 System.out.println(res);
	}
		 
 }
   class Mainclass
   
   {
    
	   public static void main(String[]args) 
	   {
		Nonstatic s = new Nonstatic();
		s.area(5);
	   }
		
    }

	
	

