package de.neuefische.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreCapacityTest {

    @Test
    public void storeIsFullRedTest () {

        //GIVEN
        int customersCount = 1;
        String alarmLevel = "Rot";

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount, alarmLevel);

        //THEN
        assertEquals("Zu viele Personen", alarmString);

    }

    @Test
    public void storeIsNotFullRedTest () {

        //GIVEN
        int customersCount = 0;
        String alarmLevel = "Rot";

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount, alarmLevel);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", alarmString);

    }

    @Test
    public void storeIsFullYellowTest () {

        //GIVEN
        int customersCount = 31;
        String alarmLevel = "Gelb";

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount, alarmLevel);

        //THEN
        assertEquals("Zu viele Personen", alarmString);

    }

    @Test
    public void storeIsNotFullYellowTest () {

        //GIVEN
        int customersCount = 30;
        String alarmLevel = "Gelb";

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount, alarmLevel);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", alarmString);

    }

    @Test
    public void storeIsFullGreenTest () {

        //GIVEN
        int customersCount = 61;
        String alarmLevel = "Grün";

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount, alarmLevel);

        //THEN
        assertEquals("Zu viele Personen", alarmString);

    }

    @Test
    public void storeIsNotFullGreenTest () {

        //GIVEN
        int customersCount = 60;
        String alarmLevel = "Grün";

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount, alarmLevel);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", alarmString);

    }


}