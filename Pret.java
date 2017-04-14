
public class Pret extends punkty{
	private double dlugosc;
	private double mBez;
	public Pret(double masa,double promien,double dlugosc){
		super(masa,promien);
		this.dlugosc=dlugosc;
	}
	public double getMasa(){
		return super.getMasa();
	}
	public double getR(){
		return super.getR();
	}
	public double getDlugosc(){
		return this.dlugosc;
	}
	public void setDlugosc(double dlugosc){
		this.dlugosc=dlugosc;
	}
		public void getInfo(){
			System.out.print("Pret:"+"\n");
			super.getInfo();
			System.out.println("Dlugosc preta wynosi : "  + getDlugosc());
			}
		public void Momentbezwladnosci(){
			mBez=(getMasa()*Math.pow(getDlugosc(), 2))/12;
		}
		public double getMomentbezwladnosci(){
			return this.mBez;
		}
		public void Momentbezw(){
			getInfo();
			Momentbezwladnosci();
			System.out.print("Moment bezwladnosci preta wynosi:"+getMomentbezwladnosci()+"\n");
		}
	}