package week9hw;

import java.util.Scanner;

//Write the programme that tell you which line pass through particular stations.
//Just use Zone 1 stations name
public class Programme10_StationNames {
    //zone 1 station names
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bakerloo,Central,District,Jubilee,Northern,Metropolitan");
        System.out.println("Please enter Train line from above list for Zone one: ");
        String station = scanner.nextLine();

        Programme10_StationNames obj = new Programme10_StationNames();
        obj.linePassThroughStations(station);
        scanner.close();
    }
    public void linePassThroughStations(String trainLine) {
        switch (trainLine) {
            case "Bakerloo":
                System.out.println("Edgware road,Marlebone,Baker Street, Oxford Circus, Picadilly Circus, Charing Cross");
                break;
            case "Central":
                System.out.println("Marble Arch, Bond Street, Oxford Circus, Holborn, St pauls, Bank, Liverpool Street");
                break;
            case "District":
                System.out.println("Tower hill, Monument, Embankment, Westminster,Victoria, South Kensington, Earls Court");
                break;
            case "Jubilee":
                System.out.println("Baker street, Bond street, Green park, Westminster, Waterloo, Southwark, London Bridge");
                break;
            case "Northern":
                System.out.println("Euston, Warren Street, Tottanham Court Road, Leicester Square, Charing Cross, Embankment,Waterloo");
                break;
            case "Metropolitan":
                System.out.println("Baker street, Euston Square, Kings Cross, Farringdon, Barbican, Moorgate, Liverpool Street,Aldgate");
                break;
            default:
                System.out.println("Please enter correct Train line");
        }
    }
}
