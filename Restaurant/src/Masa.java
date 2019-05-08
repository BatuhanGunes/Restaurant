
public class Masa {
	private int no;
	private int tip;
	private Kullanici rezerveEden;
	private int kapasite;
	
	public static final int IKILI = 1;
	public static final int DORTLU = 2;
	public static final int ALTILI = 3;
	
	public Masa(int no, int tip){
		this.no = no;
		this.tip = tip;
		
		if(tip == IKILI) kapasite = 2;
		if(tip == DORTLU) kapasite = 4;
		if(tip == ALTILI) kapasite = 6;
		
		rezerveEden = null;
	}
	
	public void setNo(int no){ this.no = no;}
	public int getNo(){return no;}
	
	public int getTip(){return tip;}
	
	public void setTip(int tip){
		this.tip = tip;
		
		if(tip == IKILI) kapasite = 2;
		if(tip == DORTLU) kapasite = 4;
		if(tip == ALTILI) kapasite = 6;
	}
	
	public boolean rezerveEt(Kullanici talepteBulunan){
		if(rezerveEden != null) return false;
		if(kapasite < talepteBulunan.getKisiSayisi()) 
			return false;
		
		rezerveEden = talepteBulunan;
		return true;
	}
	
	public void rezervasyonIptal(){ rezerveEden = null;}
	
	public Kullanici getRezerveEden(){ return rezerveEden;}
	
	public String toString(){
		String output = no + " numarali "+ kapasite+ " kapasiteli masa";
		return output;
	}
}
