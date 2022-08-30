public class Main {

    public static void main(String[] args) {
        boolean verificationResult = VerificationService.verification("java_skypro", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (verificationResult) {
            System.out.println("Проверка пройдена успешно");
        } else {
            System.out.println("Проверка не пройдена");
        }
    }
}