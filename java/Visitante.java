public class Visitante extends Persona {

    private char sexo;

    public Visitante(String nombre, String interes, String idArea, int edad, char sexo) {
        super(nombre, interes, idArea, edad);
        this.sexo = sexo;
    }
    public Visitante(){}
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Sexo: "+sexo);
    }
}