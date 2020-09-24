package de.neuefische.maven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StoreCapacityTest {

  @ParameterizedTest(name = "AlarmLevel: {0} and customers {1} should be {2}")
  @CsvSource({
      "Rot, 1,Zu viele Personen",
      "Rot, 0, Maximale Personenzahl nicht überschritten",
      "Gelb, 31, Zu viele Personen",
      "Gelb, 30, Maximale Personenzahl nicht überschritten",
      "Grün, 61, Zu viele Personen",
      "Grün, 60, Maximale Personenzahl nicht überschritten",

  })
  public void checkAlarmLevel(String alarmLevel, int customersCount, String expected) {
    //WHEN
    String alarmString = StoreCapacity.storeFullAlarm(customersCount, alarmLevel);

    //THEN
    assertEquals(expected, alarmString);

  }

}
