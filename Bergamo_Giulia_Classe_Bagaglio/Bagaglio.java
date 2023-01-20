Public class Bagaglio {
	private static final MAX_WEIGHT= 20.00;
	private double weight;
	public Bagaglio(){
		this.weight=0.0;
	}
	public Bagaglio(double w){
		setBagaglio(w);
	}
	public void setWeight(double v){
		if(v>0){
			This.weight=v;
		}
		else{
			This.weight=0;
		}
	}
	public double getWeight(){
		return this.weight;
	}
	public boolean sovrapprezzo(){
		return(this.weight>MAX_WEIGHT);
	}
	public String toString(){
		String out=””;
		out+=” il bagaglio pesa: “+this.weight+” kg”;
		return out;
	}
}
