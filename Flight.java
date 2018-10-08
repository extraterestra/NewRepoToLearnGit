package exercises.flightFinder;

public class Flight {

    private int flightNumber;
    private City cityOfDestination;
    private City cityOfDeparture;
    private int durationOfFlight;
    private int numberOfAvailableSeats;

    public Flight(int flightNumber, City cityOfDestination, City cityOfDeparture,
                  int durationOfFlight, int numberOfAvailableSeats) {
        this.flightNumber = flightNumber;
        this.cityOfDestination = cityOfDestination;
        this.cityOfDeparture = cityOfDeparture;
        this.durationOfFlight = durationOfFlight;
        this.numberOfAvailableSeats = numberOfAvailableSeats;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public City getCityOfDestination() {
        return cityOfDestination;
    }

    public void setCityOfDestination(City cityOfDestination) {
        this.cityOfDestination = cityOfDestination;
    }

    public City getCityOfDeparture() {
        return cityOfDeparture;
    }

    public void setCityOfDeparture(City cityOfDeparture) {
        this.cityOfDeparture = cityOfDeparture;
    }

    public int getDurationOfFlight() {
        return durationOfFlight;
    }

    public void setDurationOfFlight(int durationOfFlight) {
        this.durationOfFlight = durationOfFlight;
    }

    public int getNumberOfAvailableSeats() {
        return numberOfAvailableSeats;
    }

    public void setNumberOfAvailableSeats(int numberOfAvailableSeats) {
        this.numberOfAvailableSeats = numberOfAvailableSeats;
    }

    public void printFlightDetails() {
        System.out.println("Flight number: " + flightNumber +
                " from " + cityOfDestination+
                " to " + cityOfDeparture+
                ", Duration " + durationOfFlight+
                " h, seats available: " + numberOfAvailableSeats);
    }
}
