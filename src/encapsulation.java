
public class encapsulation
{
 private int atm_pin=1234;
  public int getpin()
  {
	  
	  return atm_pin;
  }
  public void setpin(int atm_pin)
  {
	  this.atm_pin=atm_pin;
	  System.out.println(atm_pin);
	  
  }
  
}
class accesspin
{
	public static void main(String[]args)
	{
		encapsulation s = new encapsulation();
		System.out.println(s.getpin());
		s.setpin(1111);
		
	}
	
}
