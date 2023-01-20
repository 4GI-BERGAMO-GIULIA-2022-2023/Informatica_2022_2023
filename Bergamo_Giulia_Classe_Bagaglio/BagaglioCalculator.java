public class BagaglioPrezzoCalculator    {
	private static final double COSTO_PER_KG=5.00;
	private static final double SOVRAPPREZZO=10.00;
	private Bagaglio bag;
	public BagaglioCalculator(){
		bag=new Bagaglio();
	}
	public void start(){
		this.descriviAttività();
		this.prendiInput();
		this.calcolaPrezzo();
		this.visualizzaRisultati();
	}
	public double calcolaPrezzo(){
	double risultato;
	if(bag.sovrapprezzo()){
		risultato=(bag.getWeight()* COSTO_PER_KG)+ SOVRAPPREZZO;
	}else{
		risultato=bag.getWeight()* COSTO_PER_KG;
	}
	return risultato;


	}
	public void descriviAttività(){

	System.out.println(“questa applicazione serve per calcolare il prezzo del bagaglio in base al peso”);
	}
	public void prendiInput(){

	Scanner in=new Scanner(System.in);

	do{
	System.out.println(“dammi il peso”);
	double peso=in.nexDoble();
	bag. setWeight(peso);
	}while(peso<=0);
}
	public void visualizzaRisultati(){

	System.out.println(bag.toString()+” il prezzo è “ +this.calcolaPrezzo());
	

}¬
}
