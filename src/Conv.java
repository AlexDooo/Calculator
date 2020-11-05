public class Conv {
    public static String[] romanNum = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static int convertString(String romanNumber) { // Конверторв римских цифр в арабские
        switch (romanNumber) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }

        return 100;
    }

    public static int[] arabic = {100, 90, 60, 50, 40, 10, 9, 5, 4, 1};

    public static String[] roman1 = {"C", "XC", "LX", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convertInt(int arabicNumber) { // конвертор арабских цифр в римские в диапазоне от 1 до 100

        StringBuilder romanNumerals = new StringBuilder();
        int remainder = arabicNumber;

        for (int i = 0; i < arabic.length; i++) {

            while (remainder >= arabic[i]) {
                romanNumerals.append(roman1[i]);
                remainder -= arabic[i];
            }
        }

        return romanNumerals.toString();
    }
}


