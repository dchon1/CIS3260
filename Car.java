
public class Car {

	private int gear= 1; 
	        int location; 
	private int speed = 0; 
	
	 final int DESTINATION = 250;
	
	
	
	public void reverseGear() 
	{
		gear = -1; 
	}
	
	public void gearUp()
	{
		if(gear == 6)
		{
			System.out.println("Cannot Increase Gear");
		}
		else
		{
			gear = gear +1;
		
		}
	}
	
	public void gearDown()
	{
		if(gear < 1)
		{
			System.out.println("Cannot Decrease Gear");
		}
		else
		{
			gear = gear - 1; 
		}
	}
    
	public int reportGear()
	{
		
		return gear;
	}

	public int reportLocation()
	{
		return location;
	}
     
	public int reportRemaining()
	{
		int result = DESTINATION - location;
		return result;
	}
	
	public void moveByTime(int time)
	{
		int delta;
		
		if(time > 0)
		{
			speed = gear * 20;
			delta = speed * time;
			location = location + delta;
		}
		else
		{
			System.out.println("Error: Needs to be Postive");
		}
	}
	
	public boolean isArrived()
	{
		if(location >= DESTINATION)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
}

