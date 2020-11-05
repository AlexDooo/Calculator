import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int answer = 0;


        System.out.println("Калькулятро принимает числа от 1 до 10");
        System.out.println("Формат ввода a + b.");
        String text = in.nextLine(); // Ввод строки


        String buf = text.replace(" ", "");
        String[] text1 = buf.split("[-+*/_]"); // Получаю два символа из строки, которые нужны
        boolean flag = false;
        for (int j = 0; j < text1.length; j++) {

            for (int i = 0; i < Conv.romanNum.length; i++) { // Проверяю какие это символы, арабские, или римские
                if (Conv.romanNum[i].equals(text1[j])) {
                    flag = true;
                }
            }
        }
        if (flag) { // Блок операций с римскими цифрами
            int[] num = new int[text1.length];
            for (int i = 0; i < text1.length; i++) {  // Конвертация римских цифр в арабские
                num[i] = Conv.convertString(text1[i]);
                if (num[i] < 1 || num[i] > 10) {
                    System.out.println("Вводимые числа не корректны");
                    System.exit(0);
                }
            }
            if (text.contains("+")) {
                answer = num[0] + num[1];
                System.out.println(Conv.convertInt(answer));
            } else if (text.contains("-")) {
                answer = num[0] - num[1];
                System.out.println(Conv.convertInt(answer));
            } else if (text.contains("*")) {
                answer = num[0] * num[1];
                System.out.println(Conv.convertInt(answer));
            } else if (text.contains("/")) {
                answer = num[0] / num[1];
                System.out.println(Conv.convertInt(answer));
            } else {
                System.out.println("Вводимые числа не корректны");
                System.exit(0);
            }
        } else { // Блок операций с арабскими цифрами
            int[] num = new int[text1.length];
            for (int i = 0; i < text1.length; i++) {
                num[i] = Integer.parseInt(text1[i]);
                if (num[i] < 1 || num[i] > 10) {
                    System.out.println("Вводимые числа не корректны");
                    System.exit(0);
                }
            }
            if (text.contains("+")) {
                answer = num[0] + num[1];
                System.out.println(answer);
            } else if (text.contains("-")) {
                answer = num[0] - num[1];
                System.out.println(answer);
            } else if (text.contains("*")) {
                answer = num[0] * num[1];
                System.out.println(answer);
            } else if (text.contains("/")) {
                answer = num[0] / num[1];
                System.out.println(answer);
            } else {
                System.out.println("Вводимые числа не корректны");
                System.exit(0);
            }
        }
    }
}
