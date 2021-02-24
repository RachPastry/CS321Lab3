
public class Bucho extends Manager{

//Bucho Manager constructor
	public Bucho(int managerAge, int managerQuirks) {
		unreadEmails = 0;
		age = managerAge;
		quirks = managerQuirks;
		}

//calculates stress
	public int stress() {
		if(unreadEmails>500)
			return 750;
		else
			return (unreadEmails *3)/2;
	}
	
//calculates coping
	public void cope() {
		unreadEmails = 0;
		double random = Math.random();
		if(random>0.5) {
			quirks = quirks +3;
		}
		else if(quirks>3) {
			quirks = quirks -3;
		}
		else if(quirks<=3) {
			quirks =0;
		}
		System.out.println("Bucho is coping " + " Stress: " + stress()+ " Respect: " + respect());
	}
	
}
