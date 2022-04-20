package practicaHarry.LillyEvans;
import practicaHarry.LillyEvans.Lilly;
public class PrincipalLilly {
    public static void main(String[] args) {
        PersonajeLilly();
    }
    public static void PersonajeLilly(){
        Lilly objF = new Lilly();
        objF.setNombrePersonaje("Lilly Evans");
        objF.setCasa("Blasón de la casa de Gryffindor");
        objF.setGenero("Femenino");
        objF.setBoggart("Ver a Harry y James muertos");
        objF.setPatronous("Cierva");

        System.out.println("Hola soy: " + objF.getNombrePersonaje());
        String showMessage = "Mis princpiales caracteristicas son: " + objF.getCasa()
                +"\n" + "pertenezco a la casa: " + objF.getCasa()
                +"\n" + " mi genero es: " + objF.getGenero()
                +"\n" + " ademas mi boggart es: " + objF.getBoggart()
                +"\n" + " por ultimo mi patronous es: " + objF.getPatronous();

        System.out.println(showMessage);
    }
}
