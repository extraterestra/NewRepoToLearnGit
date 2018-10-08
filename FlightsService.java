package exercises.flightFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlightsService {
// TypeReference(class) nameOfReference = new TypeReference(class)(incoming params or absent);
    private List<Flight> flights;

    public static final Scanner SCANNER = new Scanner(System.in);

    public FlightsService() {
        flights = new ArrayList<>();

        /*List<Flight> flights1 = flights;

        System.out.println(flights1 == flights);*/

        fillListOfFlights();//rename
    }

    private void fillListOfFlights() {
        flights.add(new Flight(2307, City.KIEV, City.KRAKOW, 2, 100));
        flights.add(new Flight(2305, City.KIEV, City.KRAKOW, 2, 100));
        flights.add(new Flight(1205, City.KRAKOW, City.BERLIN, 1, 200));
        flights.add(new Flight(1245, City.BERLIN, City.KRAKOW, 1, 200));
        flights.add(new Flight(2302, City.BERLIN, City.BARCELONA, 1, 100));
        flights.add(new Flight(1203, City.BARCELONA, City.BERLIN, 1, 200));
        flights.add(new Flight(2332, City.PARIS, City.BERLIN, 1, 100));
        flights.add(new Flight(1221, City.BERLIN, City.PARIS, 1, 200));

        flights.addAll(
                Arrays.asList(
                        new Flight(2332, City.PARIS, City.BERLIN, 1, 100),
        new Flight(1221, City.BERLIN, City.PARIS, 1, 200)));
    }

    public void printAllFlights() {
        System.out.println("List of available flights:");
        flights.forEach(Flight::printFlightDetails);
    }

    public void showFlightsByDeparture(City cityOfDeparture) {

       /* IntStream.range(0, flights.size()).forEach(index -> {
            System.out.println(flights.get(index) + "" + index);
        });*/

        flights.stream()
                .filter(f -> f.getCityOfDeparture() == cityOfDeparture)
                .forEach(Flight::printFlightDetails);

//        flights.stream().mapToLong(Flight::getDurationOfFlight).forEach(obj -> System.out.println(obj));
    }

    public void showFlightsByDestination() {//refactor
        System.out.println("Please enter City of destination: ");
        String cityOfDestination = SCANNER.nextLine();
        flights.stream()
                .filter(f -> f.getCityOfDestination().toString().toLowerCase().equals(cityOfDestination.toLowerCase()))
                .forEach(Flight::printFlightDetails);
    }

    public void showFlightsByDurationOfFlight() {
        System.out.println("Please enter duration of flight: ");
        int duration = Integer.parseInt(SCANNER.nextLine());
        flights.stream()
                .filter(f -> f.getDurationOfFlight() == duration)
                .forEach(Flight::printFlightDetails);
    }


    public void printFlightsByNumber() {
        System.out.println("Please enter flight's number to see details: ");
        int flightNumber = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Flight details");
        flights.stream()
                .filter(f -> (f.getFlightNumber() == flightNumber))
                .collect(Collectors.toList()).forEach(Flight::printFlightDetails);
    }

}
