
public class RestoranTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kullanici k = new Kullanici("Ali Veli", Kullanici.MUSTERI);
		Kullanici k2 = new Kullanici("Veli Deli", Kullanici.MUSTERI,4);
		
		k.setKisiSayisi(5);
		k2.setKisiSayisi(3);
		
		Restoran restoran = new Restoran("Urfali bilmemne", 4, 5, 7);
		
		
		if( restoran.rezerveEt(k)) System.out.println(" Rezerve Edildi");
		else System.out.println(" Rezerve edilmedi");
		
	}

}
