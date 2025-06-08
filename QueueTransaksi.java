public class QueueTransaksi {
    TransaksiPengisian[] transaksi;
    int front, rear, size, count;

    public QueueTransaksi(int kapasitas) {
        transaksi = new TransaksiPengisian[kapasitas];
        front = rear = -1;
        size = kapasitas;
    }

    public boolean isFull() {
        return count == size;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void enqueue(TransaksiPengisian t) {
        if (isFull()) {
            System.out.println(">> Riwayat transaksi penuh.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
            System.out.println(">> Transaksi berhasi dicatat");
        }
        transaksi[rear] = t;
        count++;
    }

    public void tampilkanRiwayat() {
        if (isEmpty()) {
            System.out.println(">> Belum ada transaksi.");
            return;
        } else {
            System.out.println("===============================");
            System.out.println("-- Riwayat Transaksi --");
            for (int i = 0; i < count; i++) {
                System.out.println("===============================");
                System.out.println("Transaksi ke " + (i + 1));
                int idx = (front + i) % transaksi.length;
                System.out.println(
                        "No. Plat : " + transaksi[idx].kendaraan.platNomor + " || Total Harga : Rp "
                                + transaksi[idx].totalBayar);
            }
        }

    }
}
