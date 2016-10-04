package Flight;

public class FlightTest {

		public static void main(String[] args){
			
			flight flight1, flight2, flight3;
			
			flight1 = new flight("Delta", "D543876", "Atlanta", "Philadelphia");
			flight2 = new flight("American Airlines", "AA72045", "St. Louis", "Detroit");
			flight3 = new flight("Jet Blue", "JB385698", "San Diego", "Denver");
			
			System.out.println(flight1);
			System.out.println(flight2);
			System.out.println(flight3);
			
			// Updates
			System.out.println("####Updates####");
			flight1.setdestination("San Antonio");
			System.out.println(flight1);
			
			flight2.setdestination("Miami");
			System.out.println(flight2);
		}
}
