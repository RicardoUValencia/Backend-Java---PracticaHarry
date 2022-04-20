package practicaHarry.Hermione;
    public class Hermione {
        //Constructor
        /*Hormione(){

        }*/
        String CasaHermione, GeneroHermione, NombreHermione, BoggartHermione, PatronousHermione;
        String NombrePersonaje;
        public String getCasa(){ return CasaHermione; }
        public String getGenero(){ return GeneroHermione; }
        public String getNombre(){ return NombreHermione; }
        public String getBoggart(){ return BoggartHermione; }
        public String getPatronous(){ return PatronousHermione; }
        public String getNombrePersonaje(){ return NombrePersonaje; }

        public boolean setNombrePersonaje(String NombrePersonaje){
            if(!NombrePersonaje.isEmpty()){
                this.NombrePersonaje = NombrePersonaje;
                return true;
            }else{
                return false;
            }
        }

        public boolean setCasa(String CasaHermione){
            if(!CasaHermione.isEmpty()){
                this.CasaHermione = CasaHermione;
                return true;
            }else{
                return false;
            }
        }

        public boolean setGenero(String GeneroHermione){
            if(!GeneroHermione.isEmpty()){
                this.GeneroHermione = GeneroHermione;
                return true;
            }else{
                return false;
            }
        }

        public boolean setNombre(String NombreHormione){
            if(!NombreHormione.isEmpty()){
                this.NombreHermione = NombreHormione;
                return true;
            }else{
                return false;
            }
        }

        public boolean setBoggart(String BoggartHermione){
            if(!BoggartHermione.isEmpty()){
                this.BoggartHermione = BoggartHermione;
                return true;
            }else{
                return false;
            }
        }

        public boolean setPatronous(String PatronousHermione){
            if(!PatronousHermione.isEmpty()){
                this.PatronousHermione = PatronousHermione;
                return true;
            }else{
                return false;
            }
        }
    }
