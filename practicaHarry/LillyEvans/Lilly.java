package practicaHarry.LillyEvans;
    public class Lilly {
        //Constructor
        /*Lilly(){

        }*/
        String CasaLilly, GeneroLilly, NombreLilly, BoggartLilly, PatronousLilly;
        String NombrePersonaje;
        public String getCasa(){ return CasaLilly; }
        public String getGenero(){ return GeneroLilly; }
        public String getNombre(){ return NombreLilly; }
        public String getBoggart(){ return BoggartLilly; }
        public String getPatronous(){ return PatronousLilly; }
        public String getNombrePersonaje(){ return NombrePersonaje; }

        public boolean setNombrePersonaje(String NombrePersonaje){
            if(!NombrePersonaje.isEmpty()){
                this.NombrePersonaje = NombrePersonaje;
                return true;
            }else{
                return false;
            }
        }

        public boolean setCasa(String CasaLilly){
            if(!CasaLilly.isEmpty()){
                this.CasaLilly = CasaLilly;
                return true;
            }else{
                return false;
            }
        }

        public boolean setGenero(String GeneroLilly){
            if(!GeneroLilly.isEmpty()){
                this.GeneroLilly = GeneroLilly;
                return true;
            }else{
                return false;
            }
        }

        public boolean setNombre(String NombreLilly){
            if(!NombreLilly.isEmpty()){
                this.NombreLilly = NombreLilly;
                return true;
            }else{
                return false;
            }
        }

        public boolean setBoggart(String BoggartLilly){
            if(!BoggartLilly.isEmpty()){
                this.BoggartLilly = BoggartLilly;
                return true;
            }else{
                return false;
            }
        }

        public boolean setPatronous(String PatronousLilly){
            if(!PatronousLilly.isEmpty()){
                this.PatronousLilly = PatronousLilly;
                return true;
            }else{
                return false;
            }
        }
    }
