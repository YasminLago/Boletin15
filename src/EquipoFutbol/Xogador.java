package EquipoFutbol;
//Yasmin
public class Xogador extends EquipoFutbol{
   private int dorsal;
   private String demarcacion;

    public Xogador() {
        super();
    }
    public Xogador(int id, int edade, String nome, String apelido,int dorsal, String demarcacion) {
        super(id,edade,nome,apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void xogarPartido(){    
    }
    public void entrenar(){    
    }
   @Override
    public  void viaxar(){
         System.out.println("Viaxan os xogadores");
    }
}
