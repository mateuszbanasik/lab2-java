
public class Kula extends punkty {
	private double mBez;
	public Kula(double masa, double promien){
		super(masa,promien);
	}
	public double getMasa(){
		return super.getMasa();
	}
	public double getR(){
		return super.getR();
	}
	public void getInfo(){
		System.out.print("Kula:"+"\n");
	super.getInfo();
	}
	public void Momentbezwladnosci(){
		mBez=(0.4*(getMasa()*Math.pow(getR(),2)));
	}
	public double getMomentbezwladnosci(){
		return this.mBez;
	}
	public void Momentbezw(){
		getInfo();
		Momentbezwladnosci();
		System.out.print("Moment bezwladnosci kuli wynosi  : " +getMomentbezwladnosci()+
				"\n");
	}
}