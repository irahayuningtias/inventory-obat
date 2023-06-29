/*
Indah Rahayuningtias/MI 1D/16/2031710085
 */
package uas;

import java.util.Scanner;
public class InventoryFarmasi_Indah {
    
    static Scanner sc = new Scanner(System.in);
    static int i = 0, item=0, totMsk, totKlr, totRsk, masuk, keluar, rusak;
    static String[] kodeBrg = {"AXC", "PCT", "MPN", "ASD","ACL"};
    static String[] namaBrg = {"Amoxicilin", "Paracetamol", "Morphine", "Antasida", "Acyclovir"};
    static int [] jmlBrg = {200, 159, 243, 133, 150};
    static String[] kodeBrg2;
    static String[] namaBrg2;
    static int[]  jmlBrg2;
    static String tgl, admin, lokasi, inputMsk, inputKlr, inputRsk, alasan;

    //Fungsi
    static String kodeMASUK(){
        System.out.print((i+1)+". "+"Kode Barang yang MASUK: ");
        String kodeMsk = sc.next();
        i++;
        return kodeMsk;
    }
    
    static int jmlbrgMASUK(){
        int quantityMsk = sc.nextInt();
        return quantityMsk;
    }
    
    static String kodeKELUAR(){
        System.out.print((i+1)+". "+"Kode Barang yang KELUAR: ");
        String kodeKlr = sc.next();
        i++;
        return kodeKlr;
    }
    
    static int jmlbrgKELUAR(){
        int quantityKlr = sc.nextInt();
        return quantityKlr;
    }
    
    static String kodeRUSAK(){
        System.out.print((i+1)+". "+"Kode Barang yang RUSAK: ");
        String kodeRsk = sc.next();
        i++;
        return kodeRsk;
    }
    static String alasanRUSAK(){
        String kerusakan = sc.next();
        return kerusakan;
    }
    
    static int jmlbrgRUSAK(){
        System.out.print("   Jumlah Barang yang RUSAK: ");
        int quantityRsk = sc.nextInt();
        return quantityRsk;
    }
        
    public static void main(String[] args) {
        //Variabel
        int hasil=0, hslMsk = 0, hslKlr = 0, hslRsk=0;
        String search = null;
        String tdkMsk = "TIDAK ADA BARANG MASUK!";
        String tdkKlr = "TIDAK ADA BARANG KELUAR!";
        String tdkRsk = "TIDAK ADA BARANG RUSAK!";
        
        //Main
        System.out.println("======================================================");
        System.out.println("             INVENTORY STOK OBAT/FARMASI              ");
        System.out.println("            PT. KIMIA FARMA (Persero) Tbk             ");
        System.out.println("    Telp. (62-21) - 3847709 Fax. (62-21) - 3814441    ");
        System.out.println("          email: webmaster@kimiafarma.co.id           ");
        System.out.println("         Website: http://www.kimiafarma.co.id         ");
        System.out.println("           Jl. Veteran No.9, Jakarta Pusat            ");
        System.out.println("                          10110                       ");
        System.out.println("======================================================");
        System.out.print("Hari, Tanggal Pengecekan: ");
        tgl = sc.nextLine();
        System.out.print("Admin Gudang            : ");
        admin = sc.nextLine();
        System.out.print("Lokasi Penyimpanan      : ");
        lokasi = sc.nextLine();

        System.out.println();
        System.out.println("No. | Kode Barang | Nama Barang | Jumlah |");
        for(i=0; i<kodeBrg.length; i++){
        System.out.println((i+1) + ". " + "\t  " + kodeBrg[i] + "\t    " + namaBrg[i] + "\t    " + jmlBrg[i]);
        }       
        System.out.print("Adakah yang belum dimasukkan? (Y=1/T=0)");
        int tanya = sc.nextInt();
        System.out.print("Berapa item? ");
        item = sc.nextInt();
        kodeBrg2 = new String[item];
        namaBrg2 = new String[item];
        jmlBrg2 = new int[item];
        if (tanya ==1){
            for (i=0; i<kodeBrg2.length; i++){
                System.out.print((5+(i+1))+ ". "+ "Kode Barang: ");
                kodeBrg2[i] = sc.next();
                System.out.print("   Nama Barang: ");
                namaBrg2[i] = sc.next();
                System.out.print("   Jumlah     : ");
                jmlBrg2[i] = sc.nextInt();
            }
                System.out.println();
                System.out.println("No. | Kode Barang | Nama Barang | Jumlah |");
                for(i=0; i<kodeBrg.length; i++){
                    System.out.println((i+1) + ". " + "\t  " + kodeBrg[i] + "\t    " + namaBrg[i] + "\t    " + jmlBrg[i]);
                }
                for(i=0; i<kodeBrg2.length; i++){
                    System.out.println((5+(i+1))+ ". " + "\t  " + kodeBrg2[i] + "\t    " + namaBrg2[i] + "\t    " + jmlBrg2[i]);
                }
            } else{
            System.out.println("Semua barang sudah dimasukkan!!");
            System.out.println();
            System.out.println("No. | Kode Barang | Nama Barang | Jumlah |");
            for(i=0; i<item; i++){
                System.out.println((i+1) + ". " + "\t  " + kodeBrg[i] + "\t    " + namaBrg[i] + "\t    " + jmlBrg[i]);                 }
            }
             
        //Pemanggilan Fungsi
        System.out.println("------------------------------------------------------");
        System.out.println("INPUT DATA BARANG MASUK");
        System.out.print("Adakah Barang Masuk Gudang? (Y=1/T=0)");
        masuk = sc.nextInt();
        System.out.print("Item nomor? ");
        int itemMsk = sc.nextInt();
        if (masuk == 1){
            for (i=itemMsk-1; i<=itemMsk; i++){
                inputMsk = kodeMASUK();
                System.out.print("   Jumlah barang yang MASUK: ");
                hslMsk = jmlbrgMASUK();
                totMsk = hslMsk+jmlBrg[i-1];
                System.out.print("   Jumlah SEKARANG: " + totMsk);
                System.out.println();
            }
        } else{
            System.out.print(tdkMsk);
            System.out.println();
        }
             
        System.out.println("------------------------------------------------------");
        System.out.println("INPUT DATA BARANG KELUAR");
        System.out.print("Adakah Barang Keluar Gudang? (Y=1/T=0)");
        keluar = sc.nextInt();
        System.out.print("Item nomor? ");
        int itemKlr = sc.nextInt();
        if (keluar == 1){
            for (i=itemKlr-1; i<=itemKlr; i++){
                inputKlr = kodeKELUAR();
                System.out.print("   Jumlah Barang yang KELUAR: ");
                hslKlr = jmlbrgKELUAR();
                totKlr = jmlBrg[i-1]-hslKlr;
                System.out.print("   Jumlah SEKARANG: " + totKlr);
                System.out.println();
            }
        }else{
            System.out.print(tdkKlr);
            System.out.println();
        }
              
        System.out.println("------------------------------------------------------");
        System.out.println("INPUT DATA BARANG RUSAK");
        System.out.print("Adakah Barang Rusak di Gudang? (Y=1/T=0)");  
        rusak = sc.nextInt();
        System.out.print("Item nomor? ");
        int itemRsk = sc.nextInt();
        if (rusak == 1){
            for (i=itemRsk-1; i<=itemRsk; i++){
                inputRsk = kodeRUSAK();
                System.out.print("   Alasan KERUSAKAN (Kata1_Kata2): ");
                alasan = alasanRUSAK();
                System.out.print("   Jumlah Barang yang RUSAK: ");
                hslRsk = jmlbrgRUSAK();
                totRsk = jmlBrg[i-1]-hslRsk;
                System.out.print("   Jumlah SEKARANG: " + totRsk);
                System.out.println();
            }
        }else{
            System.out.print(tdkRsk);
            System.out.println();
        }

        //Searching 
        System.out.println("------------------------------------------------------");
         System.out.println("SEARCHING/PENCARIAN DATA BARANG");
        System.out.print("Apakah Admin Ingin Melakukan Pencarian? (Y=1/T=0)");
        int cari = sc.nextInt();
        if (cari == 1){
            System.out.print("Masukkan kode barang: ");
            search = sc.next();
            for (i=0; i<kodeBrg.length; i++){
                if (search.equals(kodeBrg[i])){
                    hasil = jmlBrg[i];
                    System.out.print("Barang yang dicari adalah "+namaBrg[i]+ " berjumlah "+ hasil);
                    break;
                }
                if (search.equals(kodeBrg2[i])){
                    hasil = jmlBrg2[i];
                    System.out.print("Barang yang dicari adalah "+namaBrg2[i]+ " berjumlah "+ hasil);
                    break;
                }   
                }
        }
        
        //Laporan
        if (masuk == 0){
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                 LAPORAN STOK OBAT                    ");        
        System.out.println("               -----BARANG MASUK-----                 ");
        System.out.println("======================================================");
        System.out.println("Hari,Tanggal Pengecekan: " + tgl);
        System.out.println("Admin Gudang           : " + admin);
        System.out.println("Lokasi Penyimpanan     : " + lokasi);
        System.out.println();
        System.out.println(tdkMsk);
        }
        else{
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                 LAPORAN STOK OBAT                    ");        
        System.out.println("               -----BARANG MASUK-----                 ");
        System.out.println("======================================================");
        System.out.println("Hari,Tanggal Pengecekan: " + tgl);
        System.out.println("Admin Gudang           : " + admin);
        System.out.println("Lokasi Penyimpanan     : " + lokasi);
        System.out.println();
        System.out.println("Kode Barang  : "+inputMsk);
        if (inputMsk.equalsIgnoreCase("AXC")){
            System.out.println("Nama Barang  : "+namaBrg[0]);
        } else if (inputMsk.equalsIgnoreCase("PCT")){
            System.out.println("Nama Barang  : "+namaBrg[1]);
        } else if (inputMsk.equalsIgnoreCase("MPN")){
            System.out.println("Nama Barang  : "+namaBrg[2]);
        } else if (inputMsk.equalsIgnoreCase("ASD")){
            System.out.println("Nama Barang  : "+namaBrg[3]);
        } else if (inputMsk.equalsIgnoreCase("ACL")){
            System.out.println("Nama Barang  : "+namaBrg[4]);
        }
        System.out.println("Jumlah masuk : "+hslMsk);
        System.out.println("Total        : "+totMsk);
        }

        if (keluar == 0){
            System.out.println();
            System.out.println("======================================================");
            System.out.println("                 LAPORAN STOK OBAT                    ");        
            System.out.println("              -----BARANG KELUAR-----                 ");
            System.out.println("======================================================");
            System.out.println("Hari,Tanggal Pengecekan: " + tgl);
            System.out.println("Admin Gudang           : " + admin);
            System.out.println("Lokasi Penyimpanan     : " + lokasi);
            System.out.println();
            System.out.println(tdkKlr);
        }
        else{
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                 LAPORAN STOK OBAT                    ");
        System.out.println("              -----BARANG KELUAR-----                 ");
        System.out.println("======================================================");
        System.out.println("Hari,Tanggal Pengecekan: " + tgl);
        System.out.println("Admin Gudang           : " + admin);
        System.out.println("Lokasi Penyimpanan     : " + lokasi);
        System.out.println();
        System.out.println("Kode Barang  : "+inputKlr);
        if (inputKlr.equalsIgnoreCase("AXC")){
            System.out.println("Nama Barang  : "+namaBrg[0]);
        } else if (inputKlr.equalsIgnoreCase("PCT")){
            System.out.println("Nama Barang  : "+namaBrg[1]);
        } else if (inputKlr.equalsIgnoreCase("MPN")){
            System.out.println("Nama Barang  : "+namaBrg[2]);
        } else if (inputKlr.equalsIgnoreCase("ASD")){
            System.out.println("Nama Barang  : "+namaBrg[3]);
        } else if (inputKlr.equalsIgnoreCase("ACL")){
            System.out.println("Nama Barang  : "+namaBrg[4]);
        }
        System.out.println("Jumlah keluar: "+hslKlr);
        System.out.println("Total        : "+totKlr);
        }
        
        if (rusak == 0){
            System.out.println();
            System.out.println("======================================================");
            System.out.println("                 LAPORAN STOK OBAT                    ");
            System.out.println("               -----BARANG RUSAK-----                 ");
            System.out.println("======================================================");
            System.out.println("Hari,Tanggal Pengecekan: " + tgl);
            System.out.println("Admin Gudang           : " + admin);
            System.out.println("Lokasi Penyimpanan     : " + lokasi);
            System.out.println();
            System.out.println(tdkRsk);
        }  
        else{
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                 LAPORAN STOK OBAT                    ");
        System.out.println("               -----BARANG RUSAK-----                 ");
        System.out.println("======================================================");
        System.out.println("Hari,Tanggal Pengecekan: " + tgl);
        System.out.println("Admin Gudang           : " + admin);
        System.out.println("Lokasi Penyimpanan     : " + lokasi);
        System.out.println();
        System.out.println("Kode Barang  : "+inputRsk);
        if (inputRsk.equalsIgnoreCase("AXC")){
            System.out.println("Nama Barang  : "+namaBrg[0]);
        } else if (inputRsk.equalsIgnoreCase("PCT")){
            System.out.println("Nama Barang  : "+namaBrg[1]);
        } else if (inputRsk.equalsIgnoreCase("MPN")){
            System.out.println("Nama Barang  : "+namaBrg[2]);
        } else if (inputRsk.equalsIgnoreCase("ASD")){
            System.out.println("Nama Barang  : "+namaBrg[3]);
        } else if (inputRsk.equalsIgnoreCase("ACL")){
            System.out.println("Nama Barang  : "+namaBrg[4]);
        }
        System.out.println("Alasan rusak : "+alasan);
        System.out.println("Jumlah rusak : "+hslRsk);
        System.out.println("Total        : "+totRsk);
        }
    }
}