package Flight;

public class flight {
	String iname;
	String inumber;
	String iorigin;
	String idestination;
	
	
	// Constructor
	public flight(String name, String number, String origin, String destination){
		iname = name;
		inumber = number;
		iorigin = origin;
		idestination = destination;
	}
	
	// Getters
	public String getname(){return iname;}
	public String getnumber(){return inumber;}
	public String getorigin(){return iorigin;}
	public String getdestination(){return idestination;}
	
	// Setters
	public void setname(String name){iname = name;}
	public void setnumber(String number){inumber = number;}
	public void setorigin(String origin){iorigin = origin;}
	public void setdestination(String destination){idestination = destination;}
	
	// toString
	public String toString(){
		return "Flight Info*** Airline: " + getname() + " *** Flight Number: " + getnumber() + " *** Origin: " + getorigin() + " *** Destination: " + getdestination();
		
	}
	
}
