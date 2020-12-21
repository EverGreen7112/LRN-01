import java.util.Scanner;

public class Main {

    static int[] ports;
    static String[] sensors;
    static Scanner scanner = new Scanner(System.in);
    static int arraySize;

    public static void main(String[] args) {

        String command;

        do {
            System.out.println("Please insert a command: ");
            command = scanner.nextLine();

            switch (command) {
                case "configure":
                    configureAction();
                    break;

                case "test":
                case "check":
                    testAction();
                    break;
            } //closing switch

        } while (command.equals("quit") == false);

    } //closing main

    public static void configureAction()
    {
        System.out.println("Enter port's size: ");
        String sizeStr = scanner.nextLine();
        arraySize = Integer.parseInt(sizeStr);
        
        if (arraySize <= 0) {
            System.out.println("The port's size you choose cannot exist. Please choose a different size.");
        }//closing if size

        ports = new int[arraySize];
        sensors = new String[arraySize];

        for (int i = 0; i < arraySize ; i++) {

            System.out.println("Please enter port: ");
            String portStr = scanner.nextLine();
            int port = Integer.parseInt(portStr);

            System.out.println("Please enter sensor: ");
            String sensor = scanner.nextLine();

            if (port <= 0) {
                System.out.println("The port you put cannot exist. Please choose a different port");
                i--;
                continue;
            }//closing if port

            ports[i] = port;
            sensors[i] = sensor;

        }//closing for

//        System.out.println("sensor a number");
//        String sensorString = scanner.nextLine();



    }//closing configureAction

    public static void testAction()
    {
        System.out.println("What port are you looking for? ");
        String portCheckStr = scanner.nextLine();
        int portCheck = Integer.parseInt(portCheckStr);

        boolean result = isPortExist(portCheck);

        if (result == true) {
        System.out.println("The port " + portCheck + " is in the array");
        } else {
            System.out.println("Sorry. The ports you were looking for isn't in the array.");
        }

        System.out.println("What sensor are you looking for? ");
        String sensorCheck = scanner.nextLine();

        result = isSensorExist(sensorCheck);

        if (result == true) {
            System.out.println("The sensor " + sensorCheck + " is in the array.");
        } else {
            System.out.println("Sorry. The sensor you were looking for isn't in the array.");
        }

    }//closing testAction
    public static boolean isPortExist (int port) {

        for (int i = 0; i < arraySize; i++) {

            if (port == ports[i]) {
                return true;
            }//closing if
        }//closing for
        return false;
    }//closing isPortExist

    public static boolean isSensorExist (String sensor) {

        for (int i = 0; i < arraySize; i++) {

            if (sensor.equals( sensors[i])) {
                return true;
            }//closing if sensor
        }//closing for sensor
        return false;
    } //closing isSensorExist

}//closing class