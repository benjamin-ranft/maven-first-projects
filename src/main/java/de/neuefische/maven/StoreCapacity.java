package de.neuefische.maven;

public class StoreCapacity {

    public static String storeFullAlarm (int customers,  String alarmLevel){
        int maxNumberOfPerson = determineMaxNumberOfPersons(alarmLevel);

        if(customers <= maxNumberOfPerson){
            return "Maximale Personenzahl nicht überschritten";
        }else {
            return "Zu viele Personen";
        }
    }

    public static int determineMaxNumberOfPersons(String alarmLevel){
        switch (alarmLevel) {
            case "Rot":
                return  0;
            case "Gelb":
                return 30;
            case "Grün":
                return 60;
            default:
                return 0;
        }
    }

    public static void main (String [] args){

        int customers = 0;
        String alarmStufe = "Rot";


        System.out.println(storeFullAlarm(customers, alarmStufe));

    }
}
