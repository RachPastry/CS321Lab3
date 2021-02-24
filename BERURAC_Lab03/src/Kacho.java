
public class Kacho extends Manager{

//Kacho Manager constructor
	public Kacho(int managerAge, int managerQuirks) {
		unreadEmails = 0;
		age = managerAge;
		quirks = managerQuirks;
		}

//Implements coping mechanism for manager
	public void cope() {
		unreadEmails = unreadEmails/2;
		System.out.println("Kacho is coping " + " Stress: " + stress()+ " Respect: " + respect());
	}

}
