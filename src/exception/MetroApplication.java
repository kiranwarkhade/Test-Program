package exception;

import customexception.StationNotFoundException;

public class MetroApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetroRail metro = new MetroRail();
		try {
			metro.findStation("Station Pune");
		} catch (StationNotFoundException e) {
			System.out.println("OOPS: " + e.getMessage());
		}

	}

}
