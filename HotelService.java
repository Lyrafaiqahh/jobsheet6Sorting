public class HotelService {
    Hotel room [] = new Hotel[5];
    int idx;

    void tambah(Hotel H){
        if(idx<room.length){
            room[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    } 

    void tampilAll(){
        for(Hotel H : room) {
         H.tampilAll();
            System.out.println("------------------------");
        }
    }

    void bubbleSortHarga(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (room[j].harga > room[j + 1].harga) {
                    Hotel temp = room[j];
                    room[j] = room[j + 1];
                    room[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortRating(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (room[j].bintang < room[j + 1].bintang) {
                    Hotel temp = room[j];
                    room[j] = room[j + 1];
                    room[j + 1] = temp;
                }
            }
        }
    }

    void selectionSortHarga(){
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (room[j].harga < room[minIdx].harga) {
                    minIdx = j;
                }
            }
            Hotel temp = room[minIdx];
            room[minIdx] = room[i];
            room[i] = temp;
        }
    }

    void selectionSortRating(){
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (room[j].bintang > room[maxIdx].bintang) {
                    maxIdx = j;
                }
            }
            Hotel temp = room[maxIdx];
            room[maxIdx] = room[i];
            room[i] = temp;
        }
    }
}



