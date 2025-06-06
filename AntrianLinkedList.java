public class AntrianLinkedList {
    Node head, tail;
   
     public AntrianLinkedList() {
        head = tail = null;
    }
    
    public void tambahAntrian(Kendaraan k) {
        Node baru = new Node(k);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
       
        System.out.println(">> Kendaraan berhasil ditambahkan ke dalam antrian.\n");
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println(">> Tidak ada kendaraan dalam antrian.");
            return;
        }
        System.out.println("-- Antrian Kendaraan --");
        System.out.println("Antrian Kendaraan:");
        Node temp = head;
        while (temp != null) {
            System.out.println("Plat Nomor: " + temp.data.platNomor);
            System.out.println("Tipe: " + temp.data.jenisKendaraan);
            System.out.println("Merk: " + temp.data.merk);
            temp = temp.next;
        }
    }
}