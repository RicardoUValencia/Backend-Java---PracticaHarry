package practicaHarry.Finnigan;
import practicaHarry.Finnigan.Finnigan;
    public class PrincipalFinnigan {
        public static void main(String[] args) {
            PersonajeFinnigan();
        }
        public static void PersonajeFinnigan(){
            Finnigan objF = new Finnigan();
            objF.setNombrePersonaje("Seamous Finnigan");
            objF.setCasa("Blasón de la casa de Gryffindor");
            objF.setGenero("Masculino");
            objF.setBoggart("Banshee");
            objF.setPatronous("Zorro");

            System.out.println("Hola soy: " + objF.getNombrePersonaje());
            String showMessage = "Mis princpiales caracteristicas son: " + objF.getCasa()
                +"\n" + "pertenezco a la casa: " + objF.getCasa()
                +"\n" + " mi genero es: " + objF.getGenero()
                +"\n" + " ademas mi boggart es: " + objF.getBoggart()
                +"\n" + " por ultimo mi patronous es: " + objF.getPatronous();

            System.out.println(showMessage);
    }
}
