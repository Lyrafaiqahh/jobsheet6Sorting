public class MainHotel {
    public static void main(String[] args) {
        HotelService daftar = new HotelService();
        Hotel H1 = new Hotel("Lyra", "Sidoarjo", 350000, (byte) 5);
        Hotel H2 = new Hotel("Faiqah", "Palembang", 500000, (byte) 4);
        Hotel H3 = new Hotel("Bilqis", "Malang", 700000, (byte) 5);
        Hotel H4 = new Hotel("Kevin", "Surabaya", 450000, (byte) 2);
        Hotel H5 = new Hotel("Adika", "Jakarta", 650000, (byte) 4);        

        daftar.tambah(H1);
        daftar.tambah(H2);
        daftar.tambah(H3);
        daftar.tambah(H4);
        daftar.tambah(H5);

       
        System.out.println("Data Hotel (sebelum sorting) :");
        daftar.tampilAll();


        System.out.println("\nData Rating Hotel (BUBBLE SORT) setelah sorting : ");
        daftar.bubbleSortRating();
        daftar.tampilAll();

        System.out.println("\nData Harga Hotel (SELECTION) setelah sorting : ");
        daftar.selectionSortHarga();
        daftar.tampilAll();

        System.out.println("\nData Rating Hotel (SELECTION) setelah sorting : ");
        daftar.selectionSortRating();
        daftar.tampilAll();

        System.out.println("\nData Harga Hotel (BUBBLE SORT) setelah sorting : ");
        daftar.bubbleSortHarga();
        daftar.tampilAll();
    }
}

