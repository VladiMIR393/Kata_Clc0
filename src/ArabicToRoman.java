import java.util.List;
 class ArabicToRoman {
    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<Rome> romanNumerals = Rome.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (number > 0 && i < romanNumerals.size()) {
            Rome currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getArabic() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getArabic();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
