package examples;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FlightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Set<Flight> flightList = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			//flightList.add(new Flight(100, "Flight" + i+"",1000+ rand.nextInt(500) , 5 * rand.nextFloat()));
			flightList.add(new Flight(100+i, "Flight" + i+"",1000+ rand.nextInt(500) , 5 * rand.nextFloat()));
		}
		printFlight(flightList);
	}
	
	public static void printFlight(Set<Flight> flightList) {
		for(Flight f:flightList) {
			System.out.println(f);
		}
	}
}
