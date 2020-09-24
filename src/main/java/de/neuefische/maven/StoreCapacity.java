package de.neuefische.maven;

public class StoreCapacity {

    public static String storeFullAlarm (int customers,  String alarmLevel){
        int maxCapacity = -1;
        switch (alarmLevel) {
            case "Rot":
                maxCapacity = 0;

            case "Gelb":
                maxCapacity =30;
            case "Grün":
              maxCapacity = 60;
            default:
               // return "Corona is over!";
        }
        if(customers > maxCapacity){
            return "Zu viele Personen";
        } else{
            return "Maximale Personenzahl nicht überschritten";
        }
    }

    public static void main (String [] args){

        int customers = 0;
        String alarmStufe = "Rot";


        System.out.println(storeFullAlarm(customers, alarmStufe));

    }
}
