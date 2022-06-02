import java.util.List;


public class RomanToArabic {
    public static int RomanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<Rome> romanNumerals = Rome.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            Rome symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getArabic();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " throws Exception // т.к. в римской системе нет таких чисел");

        }

        return result;
    }
}
