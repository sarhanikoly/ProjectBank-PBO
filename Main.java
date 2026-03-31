public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.transferUang(100000, "123456789");
        bank.transferUang(200000, "987654321", "Mandiri");
        bank.transferUang(300000, "111222333", "BRI", "Bayar Kuliah");
        bank.sukuBunga();

        System.out.println();

        Bank bni = new BankBNI();
        bni.transferUang(500000, "444555666", "Bank Lain");
        bni.sukuBunga();

        System.out.println();

        Bank bca = new BankBCA();
        bca.transferUang(700000, "777888999", "Bank Lain");
        bca.sukuBunga();
    }
}