package tugas.praktikum.pkg2;
import java.util.*;

public class VCD1 {
  public static void main(String[] args) {
        
        int pilih,cobalagi;

        do{        
            VCD3 vcd = new VCD3();

            Scanner masukkan = new Scanner(System.in);

            System.out.println("");
            System.out.print("Silahkan input  Judul        : ");
            vcd.judul=masukkan.nextLine();
            System.out.print("Silahkan input Publisher    : ");
            vcd.publisher=masukkan.nextLine();
            System.out.print("Silahkan input Aktor        : ");
            vcd.aktor=masukkan.nextLine();
            System.out.print("Silahkan inputSutradara    : ");
            vcd.sutradara=masukkan.nextLine();
            
            System.out.println("           Kategori");
            System.out.println("1. Semua Umur\n2. Dewasa\n3. Remaja\n4. Anak-Anak");
            System.out.print("Pilih nomer berapa?   : ");
            pilih=masukkan.nextInt();

            switch(pilih){
                case 1:
                    vcd.kategori="Semua Umur";
                    break;
                case 2:
                    vcd.kategori="Dewasa";
                    break;
                case 3:
                    vcd.kategori="Remaja";
                    break;
                case 4:
                    vcd.kategori="Anak-Anak";
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada");
                    return;
            }
            System.out.print("Stok                   : ");
            vcd.stok=masukkan.nextInt();
            System.out.println("            DAFTAR");
            System.out.println("==============================");
            
            System.out.println("Judul Film          : "+vcd.judul);
            System.out.println("Sutradara           : "+vcd.sutradara);
            System.out.println("Aktor Film          : "+vcd.aktor);
            System.out.println("Publishe            : "+vcd.publisher);
            System.out.println("Kategori            : "+vcd.kategori);
            System.out.println("Jumlah Stok         : "+vcd.stok);
            
            System.out.println("\n");
            System.out.println("Mau Coba Lagi?\nYa[1] atau Tidak [2]");
            System.out.print("Pilih nomer berapa? : ");
            cobalagi=masukkan.nextInt();
            }while(cobalagi<2);
        
    }  
}
