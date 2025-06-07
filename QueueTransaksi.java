public class QueueTransaksi {
    TransaksiPengisian[] transaksi;
    int front, rear, size, count;

    public QueueTransaksi(int kapasitas) {
        transaksi = new TransaksiPengisian[kapasitas];
        front = rear = -1;
        size = kapasitas;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void enqueue(TransaksiPengisian t) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        transaksi[rear] = t;
        count++;
    }
    // public void enqueue(TransaksiPengisian t) {
    //     if (size == transaksi.length) {
    //         System.out.println(">> Riwayat transaksi penuh!");
    //         return;
    //     }
    //     transaksi[rear] = t;
    //     rear = (rear + 1) % transaksi.length;
    //     size++;
    //     System.out.println(">> Transaksi berhasil dicatat.\n");
    // }

    public void tampilkanRiwayat() {
        if (size == 0) {
            System.out.println(">> Belum ada transaksi.");
            return;
        }
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < count; i++) {
            int idx = (front + i) % transaksi.length;
            System.out.println(transaksi[idx].kendaraan.platNomor + ": Rp " + transaksi[idx].totalBayar);
        }
    }
}
