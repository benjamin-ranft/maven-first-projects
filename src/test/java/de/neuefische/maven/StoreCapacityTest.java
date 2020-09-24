package de.neuefische.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreCapacityTest {

    @Test
    public void storeIsFullTest () {

        //GIVEN
        int customersCount = 31;

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount);

        //THEN
        assertEquals("Zu viele Personen", alarmString);

    }

    @Test
    public void storeIsNotFullTest () {

        //GIVEN
        int customersCount = 30;

        //WHEN
        String alarmString = StoreCapacity.storeFullAlarm(customersCount);

        //THEN
        assertEquals("Maximale Personenzahl nicht überschritten", alarmString);
    }

}