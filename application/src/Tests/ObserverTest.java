package Tests;

import main.model.Kunde;
import main.model.Werbeveranstaltung;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ObserverTest {

    @Test
    public void testEventNotification() {
        Werbeveranstaltung werbeveranstaltung = new Werbeveranstaltung();
        Kunde kunde = new Kunde(werbeveranstaltung);

        werbeveranstaltung.createEvent(LocalDateTime.of(2023, 11, 02, 12, 0, 0), "Reduceri de sezon!");

        assertNotNull(werbeveranstaltung);
    }
}