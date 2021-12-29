package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class OgrList {
	   
static List <String> ogrenciListesi=new ArrayList<>();

static Scanner scan=new Scanner (System.in);
    
    public static void main(String[] args) {
        // kayıt programı
        menu();
                
        
        
        
        //ogrenciListesi.add("Ali");
        
        int secim=100;
        int sayac=0;
        
        
        do {
            System.out.println("Lutfen Menuden Yapilacak Islemi Seciniz");
            secim=scan.nextInt();
            
            if (secim==1) {
                
                
                ogrenciEkle();
                
                /*
                System.out.println("Kayıtlara Eklenecek İsmi Giriniz");
                eklenecekIsim=scan.next();              
                
                ogrenciListesi.add(eklenecekIsim);
                System.out.println(ogrenciListesi);
                */
            }
            
            if (secim==2) {
                if (ogrenciListesi.isEmpty()) {
                    System.out.println("Lütfen önce kayıt giriniz.");
                } else {
                    ogrencisil();
                }
            }
            if (secim==3) {
                System.out.println("Öğrenci Listeleme Seçtiniz");
                System.out.println(ogrenciListesi);
            }
            if (secim==4) {
                System.out.println("Uygulamadan Çıktınız. TEŞEKKKÜRLER");
                break;
            }
            sayac++;
            
        } while ( secim!=4);
        
        scan.close();
    
    }
    public static void ogrencisil() {
        
        System.out.println(ogrenciListesi);
//        Scanner scan=new Scanner (System.in);
        System.out.println("Kayıtlardan silinecek İsmi Giriniz");
        String silinecekIsim=scan.next();   
        ogrenciListesi.remove(silinecekIsim);
        System.out.println(silinecekIsim+" Başarılı olarak Silindi");
        System.out.println(ogrenciListesi);
    }
    public static void ogrenciEkle() {
    	
        Scanner scan=new Scanner (System.in);       
        System.out.println("Eklenecek Öğrenci İsmini Giriniz");
        String isim1=scan.nextLine();
        
        ogrenciListesi.add(isim1);
        System.out.println(ogrenciListesi);
        System.out.println("ÖĞRENCİ EKLEME SEÇTİNİZ");
    }
    public static void menu() {
        System.out.println("╔═════════ OGRENCI PROJE UYGULAMASI ═════════╗");
        System.out.println("║                                            ║");
        System.out.println("║           1 - OGRENCI EKLEME               ║");
        System.out.println("║                                            ║");
        System.out.println("║           2 - OGRENCI SILME                ║");
        System.out.println("║                                            ║");
        System.out.println("║           3 - OGRENCI LISTESI              ║");
        System.out.println("║                                            ║");
        System.out.println("║           4 - ÇIKIŞ                        ║");
        System.out.println("║                                            ║");
        System.out.println("╚══════ DESING BY ZEKADEMI (Zekeriya) ═══════╝");
        System.out.println();       
    }
}

