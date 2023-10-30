package testSuite;

import activities.calendar.MainCalendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CalendarTest {
    MainCalendar mainCalendar = new MainCalendar();
    @Test
    public void verifyAddEvent(){
        String eventName = "Hola";

        mainCalendar.freeTrial.click();
        mainCalendar.addEvent.click();
        mainCalendar.addEvent.click();
        mainCalendar.title.clearSetText(eventName);
        mainCalendar.save.click();
        mainCalendar.okDisclaimer.click();
        mainCalendar.day.click();
        mainCalendar.event.click();

        Assertions.assertEquals(eventName,mainCalendar.title.getText(),
                "ERROR No se creo el evento correctamente");

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}