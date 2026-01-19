import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    @Test
    void testCreazioneOffsetDateTime() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        assertNotNull(data);
    }

    @Test
    void testFormatoFull() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String risultato = data.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                        .withLocale(Locale.ITALY)
        );

        assertEquals("venerdì 1 marzo 2002", risultato);
    }

    @Test
    void testFormatoMedium() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String risultato = data.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.ITALY)
        );

        assertEquals("1 mar 2002", risultato);
    }

    @Test
    void testFormatoShort() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String risultato = data.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                        .withLocale(Locale.ITALY)
        );

        assertEquals("01/03/02", risultato);
    }
}