package de.neuefische.maven;

public class StoreCapacity {

    public static String storeFullAlarm (int customers){

        if (customers > 30) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }

    }

    public static void main (String [] args){

        int customers = 50;

        System.out.println(storeFullAlarm(customers));

        System.out.println("Alarm");
        System.out.println("Alarm");
        System.out.println("Alarm");
    }
}
