package EquipoFutbol;
//Yasmin
public class Boletin15 {
    public static void main(String[] args) {
        EquipoFutbol equipo=new EquipoFutbol();
        Xogador x=new Xogador();
        Masaxista m=new Masaxista();
        Adestrador a=new Adestrador();
        equipo.concentrarse();
        x.concentrarse();
        m.concentrarse();
        a.concentrarse();
        System.out.println("Fin de metodo concentrarse");
        equipo.viaxar();
        x.viaxar();
        m.viaxar();
        a.viaxar();
        
    }
    
}
