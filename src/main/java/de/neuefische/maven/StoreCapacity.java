package de.neuefische.maven;

public class StoreCapacity {

    public static String storeFullAlarm (int customers,  String alarmLevel){

        switch (alarmLevel) {
            case "Rot":
                if (customers == 0){
                    return "Maximale Personenzahl nicht überschritten";
                } else {
                    return "Zu viele Personen";
                }

            case "Gelb":
                if (customers <= 30){
                    return "Maximale Personenzahl nicht überschritten";
                } else {
                    return "Zu viele Personen";
                }

            case "Grün":
                if (customers <= 60){
                    return "Maximale Personenzahl nicht überschritten";
                } else {
                    return "Zu viele Personen";
                }

            default:
                return "Corona is over!";
        }
    }

    public static void main (String [] args){

        int customers = 0;
        String alarmStufe = "Rot";


        System.out.println(storeFullAlarm(customers, alarmStufe));

    }
}
