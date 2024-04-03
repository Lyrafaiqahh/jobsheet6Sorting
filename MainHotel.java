public class MainHotel {
    public static void main(String[] args) {
        HotelService daftar = new HotelService();
        Hotel H1 = new Hotel("Lyra", "LOL", 20, (byte) 5);
        Hotel H2 = new Hotel("Rara", "sda", 19, (byte) 4);
        Hotel H3 = new Hotel("Dompu", "spp", 19, (byte) 5);
        Hotel H4 = new Hotel("Abdul", "sol", 23, (byte) 2);
        Hotel H5 = new Hotel("Ummi", "Lolll", 20000, (byte) 4);        

        daftar.tambah(H1);
        daftar.tambah(H2);
        daftar.tambah(H3);
        daftar.tambah(H4);
        daftar.tambah(H5);

       
        System.out.println("Data Room hotel sebelum sorting:");
        daftar.tampilAll();


        System.out.println("\nData Room Hotel BUBBLE SORT setelah sorting desc by rating :");
        daftar.bubbleSortRating();
        daftar.tampilAll();

        System.out.println("\nData Room hotel SELECTION setelah sorting asc by harga ");
        daftar.selectionSortHarga();
        daftar.tampilAll();

        System.out.println("\nData Room Hotel SELECTION setelah sorting asc by rating ");
        daftar.selectionSortRating();
        daftar.tampilAll();

        System.out.println("\nData Room Hotel bubble sort setelah sorting asc by harga" );
        daftar.bubbleSortHarga();
        daftar.tampilAll();
    }
}

