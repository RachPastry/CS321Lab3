
public abstract class Manager {
	public int unreadEmails;
	public int age;
	public int quirks;
	
//calculates new unread mail for manager, add or removes quirks and checks if needs to cope
	public void getMail(int newMail) {
		unreadEmails = unreadEmails + newMail;
		double random = Math.random();
		if(random < 0.2) {
			double random2 = Math.random();
			if (random2 < 0.5) {
				quirks = quirks+2;}
			else if(quirks>=2) {
				quirks = quirks-2;}
		else if(quirks<2) {
			quirks = 0;}
		}
		if(stress()>respect())
			cope();
	}

//calculates stress for manager
	public int stress() {
		if(unreadEmails>500)
			return 500;
		else
			return unreadEmails;
		
	}

//calculates respect for manager
	public int respect() {
		return age - quirks;
	}
	
	abstract public void cope();
}


