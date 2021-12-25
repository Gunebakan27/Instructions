package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*  ====================PAZAR PROJEMIZ============================== 
 * bir kitapci icin program yazalim 
 * kitap no 1000'den baslayacak sirali no olsun
 * program baslayinca menu isminde bir method calissin 
 * 1-kitap ekle 
 * 2-numara ile kitap goruntule 
 * 3-bilgi ile kitap goruntule 
 * 4-numara ile kitap sil 
 * 5-tum kitaplar listele 
 * 6-cikis
 ************************************
 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
   yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir list'te tutmamiz gerek 
   2-kitap numarasi 1000'den baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
    count=1000; 
   menu isminde bir method olusturmaliyim,
   3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
   4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
 */
public class Kitapci {
	static List<String>kitaplar=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("**************KITAP-CHI'YA HOSGELDINIZ**************\n"
				+ "Lütfen menüden yapmak istediginiz islemi seciniz..\n"
				+ " 1-kitap ekle \r\n"
				+ " 2-numara ile kitap goruntule \r\n"
				+ " 3-bilgi ile kitap goruntule \r\n"
				+ " 4-numara ile kitap sil \r\n"
				+ " 5-tum kitaplar listele \r\n"
				+ " 6-cikis");		
		int secim=scan.nextInt();
		switch (secim) {
		case 1:
			kitapEkle();	
			break;
		case 2:
			kitapGoruntele();	
			break;
		case 3:
			bilgiIle();	
			break;
		case 4:
			kitapSil();
			break;
		case 5:
			tumKitaplar();
			break;
		case 6:
		cikis();
			break;
		default:
			break;
		}}
	private static void cikis() {
System.out.println("Cikis islemi basariyla tamamlanmistir..");		
	}
private static void kitapSil() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen silmek istediginiz kitabin nosunu giriniz..");
		int no=scan.nextInt();
		System.out.println("Silinen Kitap Adi: "+kitaplar.remove(no-1000)+
				"\nSilinen kitabin yazari : "+	kitaplar.remove(no-1000)
				+"\nSilinen kitabin fiyati : "+	kitaplar.remove(no-1000));
	
		System.out.println("Istediginiz kitap basari ile silinmistir..\n"+
				"Menüye dönmek icin bir karaktere basiniz..");
				scan.next();
				main(null);	
	}
	private static void bilgiIle() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen cagirmak istediginiz kitabin adini giriniz..");
		String kitapAdi=scan.nextLine();
		int count=0;
		for (int i = 0; i < kitaplar.size(); i+=3) {
			if(kitaplar.get(i).equalsIgnoreCase(kitapAdi)) {
				System.out.println("Kitap NO: "+ 1000+i+ "\nKitap Adi : "+kitaplar.get(i)+
						"\nYazar Adi : "+kitaplar.get(i+1)+"\nFiyati : "+kitaplar.get(i+2)+" TL\n*************");
			count++;}			
		}
		if (count==0) {System.out.println("Girdiginiz kitap adi listede bulunamamistir. Lütfen tekrar deneyiniz..\n");
			bilgiIle();}
					
		System.out.println("Istediginiz kitap basari ile görüntülenmistir..\n"+
				"Menüye dönmek icin bir karaktere basiniz..");
				scan.next();
				main(null);	
	}
	private static void tumKitaplar() {
		Scanner scan=new Scanner(System.in);
		int count=1000;
		for (int i = 0; i < kitaplar.size()-2; i+=3) {
			System.out.println("Kitap NO: "+ count+ "\nKitap Adi : "+kitaplar.get(i)+
					"\nYazar Adi : "+kitaplar.get(i+1)+"\nFiyati : "+kitaplar.get(i+2)+" TL\n*************");
			count++;
		}
		System.out.println("Kitaplar basari ile listelenmistir..\n"+
				"Menüye dönmek icin bir karaktere basiniz..");
				scan.next();
				main(null);
	}
	private static void kitapGoruntele() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen görüntülemek istediginiz kitabin nosunu girin..\n");	
		int kitapNo=scan.nextInt();
		System.out.println("Kitap Adi: "+kitaplar.get(kitapNo-1000)+"\nYazar Adi: "+kitaplar.get(kitapNo-1000+1)+"\nFiyati : "
		+kitaplar.get(kitapNo-1000+2)+" TL");
		System.out.println("Istediginiz Kitap basariyla görüntülenmistir..\n"+
				"Menüye dönmek icin bir karaktere basiniz..");
				scan.next();		
				main(null);
	}
	private static void kitapEkle() {
		Scanner scan=new Scanner(System.in);		
		System.out.println("Lütfen eklemek istediginiz kitabin adini giriniz : \n");
		kitaplar.add(scan.nextLine());
		System.out.println("Lütfen kitaba ait yazar adini giriniz..\n");
		kitaplar.add(scan.nextLine());
		System.out.println("lütfen kitabin fiyatini giriniz..\n");
		kitaplar.add(scan.nextLine());
		System.out.println("Kitap kaydiniz basariyla tamamlanmistir..\n"+
		"Menüye dönmek icin bir karaktere basiniz..");
		scan.next();		
		main(null);	
	}

}
