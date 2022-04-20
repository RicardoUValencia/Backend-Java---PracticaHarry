package practicaHarry.Ron;
    public class Ron {
        //Constructor
        /*Ron(){

        }*/
        String CasaRon, GeneroRon, NombreRon, BoggartRon, PatronousRon;
        String NombrePersonaje;
        public String getCasa(){ return CasaRon; }
        public String getGenero(){ return GeneroRon; }
        public String getNombre(){ return NombreRon; }
        public String getBoggart(){ return BoggartRon; }
        public String getPatronous(){ return PatronousRon; }
        public String getNombrePersonaje(){ return NombrePersonaje; }

        public boolean setNombrePersonaje(String NombrePersonaje){
            if(!NombrePersonaje.isEmpty()){
                this.NombrePersonaje = NombrePersonaje;
                return true;
            }else{
                return false;
            }
        }

        public boolean setCasa(String CasaRon){
            if(!CasaRon.isEmpty()){
                this.CasaRon = CasaRon;
                return true;
            }else{
                return false;
            }
        }

        public boolean setGenero(String GeneroRon){
            if(!GeneroRon.isEmpty()){
                this.GeneroRon = GeneroRon;
                return true;
            }else{
                return false;
            }
        }

        public boolean setNombre(String NombreRon){
            if(!NombreRon.isEmpty()){
                this.NombreRon = NombreRon;
                return true;
            }else{
                return false;
            }
        }

        public boolean setBoggart(String BoggartRon){
            if(!BoggartRon.isEmpty()){
                this.BoggartRon = BoggartRon;
                return true;
            }else{
                return false;
            }
        }

        public boolean setPatronous(String PatronousRon){
            if(!PatronousRon.isEmpty()){
                this.PatronousRon = PatronousRon;
                return true;
            }else{
                return false;
            }
        }
    }
