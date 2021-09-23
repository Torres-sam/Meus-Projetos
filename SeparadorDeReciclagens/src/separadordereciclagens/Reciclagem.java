
package separadordereciclagens;


public abstract class Reciclagem {
   protected String nome;
   protected String cor;
   protected double peso;
   
   public void status(){
       System.out.println("-----STATUS----");
       System.out.println("Tipo de Lixo: " + this.getNome());
       System.out.println("Cor do coletor: " + this.getCor());
       System.out.println("Peso Total: " + this.getPeso() + " Kg");
   }
   public void depositarLixo(double depositandoLixo){
       this.setPeso(this.getPeso() + depositandoLixo);       
       if (this.getPeso() > 100){
           this.setPeso(100);
       }
   }
   public void reciclarLixo(double reciclandoLixo){
       this.setPeso(this.getPeso() - reciclandoLixo);
      if (this.getPeso() <= 0){
           this.setPeso(0);
       }
   }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }    
    
}

