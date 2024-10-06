package exception;

import java.util.List;

import customexception.StationNotFoundException;

public class MetroRail {

	private List<String> stations = List.of("Station Pune", "Station Mumbai", "Station Goa");

	public void findStation(String stationName) throws StationNotFoundException {

		if (!stations.contains(stationName)) {
			throw new StationNotFoundException("Station Name: " + stationName + " not found in the metro system. ");
		}
		System.out.println("Station Name: " + stationName + " found ");
	}
	
	public List<String> search()
	{
		
		return stations;
		
	}
}
