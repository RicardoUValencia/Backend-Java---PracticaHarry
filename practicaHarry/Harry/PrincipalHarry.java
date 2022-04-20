package practicaHarry.Harry;
import practicaHarry.Harry.HarryPotter;
public class PrincipalHarry {
        public static void main(String[] args) {
            PersonajeHarry();
        }

        public static void PersonajeHarry(){
            HarryPotter objH = new HarryPotter();
            objH.setNombrePersonaje("Harry Potter");
            objH.setCasa("Blasón de la casa de Gryffindor");
            objH.setGenero("Masculino");
            objH.setBoggart("Dementor");
            objH.setPatronous("Ciervo");

            System.out.println("Hola soy: " + objH.getNombrePersonaje());
            String showMessage = "Mis princpiales caracteristicas son: " + objH.getCasa()
                    +"\n" + "pertenezco a la casa: " + objH.getCasa()
                    +"\n" + " mi genero es: " + objH.getGenero()
                    +"\n" + " ademas mi boggart es: " + objH.getBoggart()
                    +"\n" + " por ultimo mi patronous es: " + objH.getPatronous();

            System.out.println(showMessage);
        }
    }
