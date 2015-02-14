/*
 Minecraft Hyperlapse Command Creator V1.1

 Create by Autopoietico:

 Github: https://github.com/Autopoietico
 Twitter: https://twitter.com/AutopoieticoLP
 Youtube: https://www.youtube.com/user/SrAutopoietico/
 */
package cod;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Formatter {

    public static String format(double num) {

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#.################################", otherSymbols);
        return formatter.format(num);
    }
}
