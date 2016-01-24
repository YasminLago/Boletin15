package EquipoFutbol;
//Yasmin
public class EquipoFutbol {
    int id,edade;
    String nome,apelido;

    public EquipoFutbol() {
    }

    public EquipoFutbol(int id, int edade, String nome, String apelido) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelido = apelido;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEdade() {
        return edade;
    }
    public void setEdade(int edade) {
        this.edade = edade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }  
     public void concentrarse(){
        System.out.println("Concentrarse a seleccion");
    }
    public  void viaxar(){
        System.out.println("Viaxa a seleccion");
    }
    @Override
    public String toString() {
        return "EquipoFutbol{" + "id=" + id + ", edade=" + edade + ", nome=" + nome + ", apelido=" + apelido + '}';
    }
    
}
