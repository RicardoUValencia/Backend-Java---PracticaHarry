package practicaHarry.Ron;
import practicaHarry.Ron.Ron;
public class PrincipalRon {
    public static void main(String[] args) {
        PersonajeRon();
    }
    public static void PersonajeRon(){
        Ron objR = new Ron();
        objR.setNombrePersonaje("Ron Weasley");
        objR.setCasa("Blasón de la casa de Gryffindor");
        objR.setGenero("Masculino");
        objR.setBoggart("Acromántula");
        objR.setPatronous("Jack Russell Terrier");

        System.out.println("Hola soy: " + objR.getNombrePersonaje());
        String showMessage = "Mis princpiales caracteristicas son: " + objR.getCasa()
                +"\n" + "pertenezco a la casa: " + objR.getCasa()
                +"\n" + " mi genero es: " + objR.getGenero()
                +"\n" + " ademas mi boggart es: " + objR.getBoggart()
                +"\n" + " por ultimo mi patronous es: " + objR.getPatronous();

        System.out.println(showMessage);
    }
}
