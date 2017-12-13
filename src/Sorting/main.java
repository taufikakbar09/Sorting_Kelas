package Sorting;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int jumlah;
        System.out.println("jumlah angka yang akan di masukkan ");
       
        try{
            jumlah = scan.nextInt();
            int [] hasil = new int[jumlah];
        
            for(int i = 1; i <= jumlah; i++){
                System.out.println("masukkan data ke - " + i);
                hasil[i-1] = scan.nextInt();
            }
            
            System.out.print("Data yang di masukkan : ");
            for(int i=1; i<=jumlah;i++){
                System.out.print(" "+hasil[i-1]);
                if (i % 10 == 0 ){
                    System.out.println();
                }
            }
            
            System.out.println("\n1. Selection");
            System.out.println("2. insertion");
            System.out.println("3. bubble\n");
            System.out.print("Pilih metode: ");
            
            try{
                int pilih = scan.nextInt();
                switch (pilih) {
                    case 1:
                        ar.selection(hasil);
                        ar.printArray(hasil);
                        break;
                    case 2:
                        ar.insertion(hasil);
                        ar.printArray(hasil);
                        break;
                    case 3:
                        ar.bubble(hasil);
                        ar.printArray(hasil);
                        break;
                    default:
                        System.out.println("pilihan anda salah");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Masukkan angka!");
            }
        }
        catch(Exception e){
            System.out.println("Masukkan angka!");
        }   
    }
}