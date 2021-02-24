
public class Shunin extends Manager{

//Shunin Manager constructor
	public Shunin(int managerAge, int managerQuirks) {
		unreadEmails = 0;
		age = managerAge;
		quirks = managerQuirks;
		}
	
//Calculates Managers respect
	public int respect() {
		return age + quirks;
	}
	
//Calculates managers new data after coping 
	public void cope() {
		quirks = quirks +10;
		System.out.println("Shunin is coping " + " Stress: " + stress()+ " Respect: " + respect());
	}

}
