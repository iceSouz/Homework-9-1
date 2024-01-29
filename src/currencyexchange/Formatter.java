package currencyexchange;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Formatter {
    public static double roundValue(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedValue = decimalFormat.format(value);

        double result = 0;
        try {
            result = decimalFormat.parse(formattedValue).doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
