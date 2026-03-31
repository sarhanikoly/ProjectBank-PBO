class Bank {

    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah + " ke rekening " + rekeningTujuan + 
                           " di bank " + bankTujuan + " dengan berita: " + berita);
    }

    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    int hitungBiayaTransfer(String bankTujuan) {
        return 5000;
    }
}