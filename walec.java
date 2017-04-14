
public class walec extends punkty {
	private double wysokosc;
	private double mBez;
	public walec(double masa,double promien,double wysokosc){
		super(masa,promien);
		this.wysokosc = wysokosc;
		
		
	}
	public double getMasa(){
		return super.getMasa();
	}
	
	public double getR(){
    	return super.getR();
		}
	public double getWysokosc(){
		return this.wysokosc;
		
	}
	public void setWysokosc(double wysokosc){
		this.wysokosc=wysokosc;
	}
	public void getInfo(){
		System.out.print("Walec:"+"\n");
		super.getInfo();
		System.out.println("Wysokosc walca wynosi : "  + getWysokosc());
	}
	public void Momentbezwladnosci(){
	mBez = ((getMasa()*Math.pow(getR(),2))/2);	
	}
	public double getMomentbezwladnosci(){
		return this.mBez;
	}
	public void Momentbezw(){
		getInfo();
		Momentbezwladnosci();
		System.out.print("Moment bezwladnosci walca wynosi : " +getMomentbezwladnosci()+
				"\n");
	}
	
	}
