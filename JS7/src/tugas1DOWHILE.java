//Created by 21343077_Glody Syah Rabbynawa
import java.util.Scanner;
public class tugas1DOWHILE {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i=0;

        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();

        do{
            System.out.println(i+" "+nama);
            i++;
        }
        while(i<=10);
    }
}
