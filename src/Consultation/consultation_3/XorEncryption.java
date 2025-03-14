package Consultation.consultation_3;

public class XorEncryption {
    public static void main(String[] args) {
        String text = "Secret";
//        int key = 123;
        int key = 587;

        char ch1 = text.charAt(0);
        char ch2 = text.charAt(1);
        char ch3 = text.charAt(2);
        char ch4 = text.charAt(3);
        char ch5 = text.charAt(4);
        char ch6 = text.charAt(5);

        // "Шифрование" с помощью key
        char ch1k = (char)(ch1 ^ key);
        char ch2k = (char)(ch2 ^ key);
        char ch3k = (char)(ch3 ^ key);
        char ch4k = (char)(ch4 ^ key);
        char ch5k = (char)(ch5 ^ key);
        char ch6k = (char)(ch6 ^ key);

        String textEncrypted = "" + ch1k + ch2k + ch3k + ch4k + ch5k + ch6k;

        System.out.println("First char: " + ch1);
        System.out.println("First char(encrypt): " + ch1k);
        System.out.println("Second char: " + ch2 + ";");
        System.out.println("Second char(encrypt):" + ch2k + ";");
        System.out.println("Third char: " + ch3);
        System.out.println("Third char(encrypt):" + ch3k + ";");
        System.out.println();
        System.out.println("Исходное текст: " + text);
        System.out.println("Зашифрованный текст: " + textEncrypted);

        // "Расшифрование" с помощью key
        ch1k = (char)(ch1k ^ key);
        ch2k = (char)(ch2k ^ key);
        ch3k = (char)(ch3k ^ key);
        ch4k = (char)(ch4k ^ key);
        ch5k = (char)(ch5k ^ key);
        ch6k = (char)(ch6k ^ key);

        String textDecrypted = "" + ch1k + ch2k + ch3k + ch4k + ch5k + ch6k;
        System.out.println("Расшифрованный текст: " + textDecrypted);
    }
}
