package practicaHarry.Hermione;
import practicaHarry.Hermione.Hermione;
public class PrincipalHermione {
    public static void main(String[] args) {
        PersonajeHermione();
    }

    public static void PersonajeHermione(){
        Hermione objH = new Hermione();
        objH.setNombrePersonaje("Hermione Granger");
        objH.setCasa("Blasón de la casa de Gryffindor");
        objH.setGenero("Femenino");
        objH.setBoggart("Mcgonagall diciendole que reprobo todo");
        objH.setPatronous("Nutria");

        System.out.println("Hola soy: " + objH.getNombrePersonaje());
        String showMessage = "Mis princpiales caracteristicas son: " + objH.getCasa()
                +"\n" + "pertenezco a la casa: " + objH.getCasa()
                +"\n" + " mi genero es: " + objH.getGenero()
                +"\n" + " ademas mi boggart es: " + objH.getBoggart()
                +"\n" + " por ultimo mi patronous es: " + objH.getPatronous();

        System.out.println(showMessage);
    }
}
