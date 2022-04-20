package practicaHarry.Harry;
    public class HarryPotter {
        //Constructor
        /*HarryPotter(){

        }*/
        String CasaHarry, GeneroHarry, NombreHarry, BoggartHarry, PatronousHarry;
        String NombrePersonaje;
        public String getCasa(){ return CasaHarry; }
        public String getGenero(){ return GeneroHarry; }
        public String getNombre(){ return NombreHarry; }
        public String getBoggart(){ return BoggartHarry; }
        public String getPatronous(){ return PatronousHarry; }
        public String getNombrePersonaje(){ return NombrePersonaje; }

        public boolean setNombrePersonaje(String NombrePersonaje){
            if(!NombrePersonaje.isEmpty()){
                this.NombrePersonaje = NombrePersonaje;
                return true;
            }else{
                return false;
            }
        }

        public boolean setCasa(String CasaHarry){
            if(!CasaHarry.isEmpty()){
                this.CasaHarry = CasaHarry;
                return true;
            }else{
                return false;
            }
        }

        public boolean setGenero(String GeneroHarry){
            if(!GeneroHarry.isEmpty()){
                this.GeneroHarry = GeneroHarry;
                return true;
            }else{
                return false;
            }
        }

        public boolean setNombre(String NombreHarry){
            if(!NombreHarry.isEmpty()){
                this.NombreHarry = NombreHarry;
                return true;
            }else{
                return false;
            }
        }

        public boolean setBoggart(String BoggartHarry){
            if(!BoggartHarry.isEmpty()){
                this.BoggartHarry = BoggartHarry;
                return true;
            }else{
                return false;
            }
        }

        public boolean setPatronous(String PatronousHarry){
            if(!PatronousHarry.isEmpty()){
                this.PatronousHarry = PatronousHarry;
                return true;
            }else{
                return false;
            }
        }
    }
