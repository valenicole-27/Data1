import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public  class Main {
    public static void main (String[] args){

        OffsetDateTime data= OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dataStringFull= data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY));
        System.out.println("dataString FULL: " + dataStringFull );

        String dataStringMedium= data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ITALY));
        System.out.println("dataString MEDIUM: " + dataStringMedium );

        String dataStringShort= data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY));
        System.out.println("dataString SHORT: " + dataStringShort );

    }
}