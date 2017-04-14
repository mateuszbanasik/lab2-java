
public class test {
		public static void main(String[] args) {
			walec walec1=new walec(10,20,30);
			walec1.Momentbezw();
			walec1.TwSteiner(50);
			walec1.getTwSteiner();
	
		Kula kula1=new Kula(15,30);
		kula1.Momentbezw();
		kula1.TwSteiner(20);
		kula1.getTwSteiner();
		
		Pret pret1=new Pret(20,5,50);
		pret1.Momentbezw();
		pret1.TwSteiner(35);
		pret1.getTwSteiner();
		punkty[] parametry=new punkty[3];
		for(int i = 0; i < parametry.length; i++){
			parametry[0]=new walec(15,30,45);
			parametry[1]=new Kula(50,60);
			parametry[2]=new Pret(25,5,60);
		}
		for(int i = 0; i < parametry.length; i++){
			parametry[i].Momentbezw();
			parametry[i].TwSteiner(60);
			parametry[i].getTwSteiner();
		}
}
}