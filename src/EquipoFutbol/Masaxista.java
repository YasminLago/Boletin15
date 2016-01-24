package EquipoFutbol;
//Yasmin
public class Masaxista extends EquipoFutbol{
    private int anosExperiencia;
    private String titulacion;

    public Masaxista() {
        super();
    }
    public Masaxista(int id, int edade, String nome, String apelido,int anosExperiencia, String titulacion) {
        super(id,edade,nome,apelido);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;
    }
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public void darMasaxes(){    
    }
    @Override
    public  void viaxar(){
         System.out.println("Viaxan os xogadores");
    }
}
