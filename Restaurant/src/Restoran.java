import java.util.*;

public class Restoran {
	private String isim;
	private Kullanici sahip;
	private Vector<Masa> masalar;
	
	public Restoran(String isim){
		this.isim = isim;
		masalar = new Vector<Masa>();
		sahip = null;
	}
	
	public Restoran(String isim, int ikililer, int dortluler, int altililar){
		this.isim = isim;
		masalar = new Vector<Masa>();
		sahip = null;
		
		masalariIlkle(ikililer, dortluler, altililar);
	}
	
	public Restoran(String isim, Kullanici s, 
			int ikililer, int dortluler, int altililar){
		this.isim = isim;
		masalar = new Vector<Masa>();
		sahip = s;
		
		masalariIlkle(ikililer, dortluler, altililar);
	}

	private void masalariIlkle(int ikililer, int dortluler, int altililar) {
		int index = 0;
		
		for(int i = 0; i < ikililer; i++){
			Masa ikili = new Masa(index++,Masa.IKILI);
			masalar.add(ikili);
		}
		
		for(int i = 0; i < dortluler; i++){
			Masa dortlu = new Masa(index++,Masa.DORTLU);
			masalar.add(dortlu);
		}
		
		for(int i = 0; i < altililar; i++){
			Masa altili = new Masa(index++,Masa.ALTILI);
			masalar.add(altili);
		}
	}
	
	public boolean rezerveEt(Kullanici talepEden){
		boolean rezerveEdildiMi = false;
		
		for(int i = 0; i < masalar.size(); i++){
			Masa masa = masalar.get(i);
			if(masa.rezerveEt(talepEden)){
				rezerveEdildiMi = true;
				break;
			}
		}
			
		return rezerveEdildiMi;	
		
	}
	
	public void rezerveIptal(Kullanici iptalEden){
		for(int i = 0; i < masalar.size(); i++){
			Masa masa = masalar.get(i);
			if(masa.getRezerveEden() == iptalEden)
				masa.rezervasyonIptal();
		}
		
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Kullanici getSahip() {
		return sahip;
	}

	public void setSahip(Kullanici sahip) {
		this.sahip = sahip;
	}
	
	
	
}
