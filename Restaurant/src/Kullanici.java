
public class Kullanici {
	private String isim;
	private int tip;
	private int kisiSayisi;
	
	public static final int RESORAN_SAHIBI = 1;
	public static final int MUSTERI = 2;
	
	public Kullanici(String ad){
		isim = ad;
		tip = MUSTERI;
		kisiSayisi = 1;
	}
	
	public Kullanici(String ad, int tip){
		isim = ad;
		this.tip = tip;
		
		if(tip == MUSTERI) kisiSayisi = 1;
		else kisiSayisi = 0;	
		
	}
	
	public Kullanici(String ad, int tip, int kSayisi){
		isim = ad;
		this.tip = tip;
		kisiSayisi = kSayisi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getTip() {
		return tip;
	}

	public void setTip(int tip) {
		this.tip = tip;
	}

	public int getKisiSayisi() {
		return kisiSayisi;
	}

	public void setKisiSayisi(int kisiSayisi) {
		this.kisiSayisi = kisiSayisi;
	}
	
	
}
