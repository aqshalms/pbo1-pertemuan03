package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs    : \"Alhamdulillah Terima kasih pak\"");
                System.out.println("Dosen  : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs    : \"Alhamdulillah\"");
                System.out.println("Dosen  : \"Selamat!\"");
                break;
            case 'C':
                System.out.println("Mhs    : \"Kenapa saya bisa C pak\"");
                System.out.println("Dosen  : \"Kamu jarang hadir dan tidak mengumpulkan tugas\"");
                break;
            default:
                System.out.println("Dosen    : \"Lebih giat lagi ya!!\"");
                break;
        }
    }
}
