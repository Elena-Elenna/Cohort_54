package Consultation.consultation_5;

public class XorEncryptDecrypt {
    public static void main(String[] args) {
        String text = "Secret";
        int key = 587;

        int i = 0;
        String textEncrypted = "";

        // Цикл
        while (i <= text.length() - 1) {
            textEncrypted += (char)(text.charAt(i) ^ key);
            i++;
        }

        System.out.println("Исходное текст: " + text);
        System.out.println("Зашифрованный текст: " + textEncrypted);

        // "Расшифрование" с помощью key
        String textDecrypted = "";
        i = 0;
        while (i < textEncrypted.length()) {
            textDecrypted += (char)(textEncrypted.charAt(i) ^ key);
            i++;
        }
        System.out.println("================================");

        System.out.println("Зашифрованный текст: " + textEncrypted);
        System.out.println("Расшифрованный текст: " + textDecrypted);
    }
}
