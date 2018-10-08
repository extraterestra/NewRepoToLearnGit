package exercises.flightFinder;

import java.util.Scanner;

public class Menu {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        FlightsService flightService  = new FlightsService();
        while (true) {
            menu();
            int key = SCANNER.nextInt();
            try {
                switch (key) {
                    case 1: {
                        flightService.printAllFlights();
                        break;
                    }
                    case 2: {
                        flightService.printFlightsByNumber();
                        break;
                    }
                    case 3: {
                        System.out.println("Please enter City of departure: ");//move to test class
                        String cityOfDeparture = SCANNER.next();

                        /*
                        * 3 + enter
                        *   some text for git
                        * */
                        //one more text for git
                        flightService.showFlightsByDeparture(City.valueOf(cityOfDeparture.toUpperCase()));
                        break;
                    }
                    case 4: {
                        flightService.showFlightsByDestination();
                        break;
                    }
                    case 5: {
                        flightService.showFlightsByDurationOfFlight();
                        break;
                    }
                    default:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Exception" + e);
            }
        }
    }


    public static void menu() {
        System.out.println("Выберите номер пункта меню:\n" +
                "1) Выводить все возможные рейсы.\n" +
                "2) Выбор рейса по номеру рейса чтобы просмотреть детали.\n" +
                "3) Поиск по городу отправления.\n" +
                "4) Поиск по городу прибытия.\n" +
                "5) Поиск по длительности рейса.");
    }

}
