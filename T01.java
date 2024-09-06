// 12S24031-Amelia Renata Lumbanbatu
// 12S24025-Paula Gevriella Tambunan

 import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judulbuku;

        judulbuku = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        String tahunterbit;

        tahunterbit = input.nextLine();
        String namapenerbit;

        namapenerbit = input.nextLine();
        String formatbuku;

        formatbuku = input.nextLine();
        String hargapembelian;

        hargapembelian = input.nextLine();
        String minimummargin;

        minimummargin = input.nextLine();
        String stok;

        stok = input.nextLine();
        String rating;

        rating = input.nextLine();
        System.out.println(iSBN + "|" + judulbuku + "|" + penulis + "|" + tahunterbit + "|" + namapenerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}
