package practicaHarry.Finnigan;
    public class Finnigan {
        //Constructor
        /*Finnigan(){

        }*/
        String CasaFinnigan, GeneroFinnigan, NombreFinnigan, BoggartFinnigan, PatronousFinnigan;
        String NombrePersonaje;
        public String getCasa(){ return CasaFinnigan; }
        public String getGenero(){ return GeneroFinnigan; }
        public String getNombre(){ return NombreFinnigan; }
        public String getBoggart(){ return BoggartFinnigan; }
        public String getPatronous(){ return PatronousFinnigan; }
        public String getNombrePersonaje(){ return NombrePersonaje; }

        public boolean setNombrePersonaje(String NombrePersonaje){
            if(!NombrePersonaje.isEmpty()){
                this.NombrePersonaje = NombrePersonaje;
                return true;
            }else{
                return false;
            }
        }

        public boolean setCasa(String CasaFinnigan){
            if(!CasaFinnigan.isEmpty()){
                this.CasaFinnigan = CasaFinnigan;
                return true;
            }else{
                return false;
            }
        }

        public boolean setGenero(String GeneroFinnigan){
            if(!GeneroFinnigan.isEmpty()){
                this.GeneroFinnigan = GeneroFinnigan;
                return true;
            }else{
                return false;
            }
        }

        public boolean setNombre(String NombreFinnigan){
            if(!NombreFinnigan.isEmpty()){
                this.NombreFinnigan = NombreFinnigan;
                return true;
            }else{
                return false;
            }
        }

        public boolean setBoggart(String BoggartFinnigan){
            if(!BoggartFinnigan.isEmpty()){
                this.BoggartFinnigan = BoggartFinnigan;
                return true;
            }else{
                return false;
            }
        }

        public boolean setPatronous(String PatronousFinnigan){
            if(!PatronousFinnigan.isEmpty()){
                this.PatronousFinnigan = PatronousFinnigan;
                return true;
            }else{
                return false;
            }
        }
    }
