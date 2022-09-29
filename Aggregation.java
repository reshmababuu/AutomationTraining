/*In Inheritance the child class acquires the properties and behaviour of parent class.
The inherited class is called 'child class' and the class from where the properties are acquired is called 'parent class'.
In Inheritance the parent class and the child class are in a IS-A relationship.

Single Inheritance Alternative

class Vehicle
{
	public void start()
	//parent class
	{
		System.out.println("Started");
	}
	public void stop()
	{
		System.out.println("Stoped");
	}
}


class Truck extends Vehicle{
	public void brakes(){
		System.out.println("Breaks");
	}
	
	
class MainDemo{
public static void main(String args[])
	{
		Truck tk=new Truck();
		tk.start();
		tk.stop();
	}
	
	
}
}
*/
