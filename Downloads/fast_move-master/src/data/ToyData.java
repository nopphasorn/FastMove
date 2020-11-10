package data;

import base.Bike;
import base.Parcel;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code
        bikes[0] = new Bike("A001", 1);
        bikes[1] = new Bike("B002", 2);
        bikes[2] = new Bike("C003", 3);
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        person[0] = new Person("Warisara","Khruajinli");
        person[1] = new Person("Nopphasorn" ,"Techarungreungwit");
        person[3] = new Person("Karunpat" , "Promvisut");
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        //printPerson();
      //  printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
