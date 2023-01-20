public class Stato {
    private String nome;
    private double superficie; 
    private double popolazione;
    public Stato() {
        nome = "anonimo";
        superficie = 0.0;
        popolazione = 0.0;
    }
    public Stato(String nome, double superficie, double popolazione) {
        if(nome!= null){
        this.nome = nome;
        }else{
              this.nome = "anonimo";
        }
        if(superficie>0){
              this.superficie = superficie;
        }else{
              this.superficie = 0.0;
        }
        If (popolazione>0){
              this.popolazione = popolazione;
        }else{
              this.popolazione = 0.0;
        }
    }
    public String getNome() {
        return nome;
    }
    public double getSuperficie() {
        return superficie;
    }
    public double getPopolazione() {
        return popolazione;
    }
    public void setNome(String nome) {
        if(nome!= null){
        this.nome = nome;
        }
    }
    public void setSuperficie(double superficie) {
        if(superficie>0){
              this.superficie = superficie;
        }
    }
    public void setPopolazione(double popolazione) {
        If (popolazione>0){
              this.popolazione = popolazione;
        }
    }
    public String toString() {
        return "Stato {nome: " + nome + ", superficie: " + superficie + "km2, popolazione: " + popolazione + 
       "mln, densita: " + this.densita() + " abitanti/km2}";
    }
   

    public double densita() {
        return ((this.getPopolazione() *1000000.0)/this.getSuperficie());
    }
    public int confronta(Stato s) {
        if(this.densità()<s.densità()){
             Return -1;
        }else if (this.densità()==s.densità()){
              Return 0;
        }else{
              Return 1;
        }
    }
    public boolean confronta(double a, double b) {
        if(this.densità()>a && this.densità()<b){
        Return true;
    }else{
        Return false;
    }
    public Stato piuEsteso(Stato s) {
        if (this.superficie()>s.superficie()){
            Return this;
        }else{
            Return s;
        }
    }
}
}
