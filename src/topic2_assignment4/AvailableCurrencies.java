package topic2_assignment4;

import java.util.Currency;
import java.util.Scanner;
import java.util.Set;

public class AvailableCurrencies {
    public static void main(String args[])
    {
        Set<Currency> currencySet= Currency.getAvailableCurrencies();
        System.out.println("\nTotal Number of available Currencies is: "+currencySet.size());
        System.out.println("Available currencies are:\n");
        for(Currency c:currencySet)
        {
            System.out.print(c+", ");
        }
        Currency myCurrency=Currency.getInstance(args[0]);
        System.out.println(myCurrency.getSymbol());
    }
}
