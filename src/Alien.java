
public class Alien {
    
    
    private String namn;
    private String losenord;
    private String epost;
    private String id;
    private String regDatum;
    private String telefon;
    
    public Alien(String namn, String losenord, String epost, String id, String regDatum){
        this.namn = namn;
        this.losenord = losenord;
        this.epost = epost;
        this.id = id;
        this.regDatum = regDatum;
        telefon = "inget registrerat än";
    }
    
    public String getNamn() {
        return namn;
    }
    
    public String getId() {
        return id;
    }
    
    public String getRegDatum() {
        return regDatum;
    }
    
    public String getEpost() {
        return epost;
    }
    
    public String getTelefon() {
        return telefon;
    }
    
    public void setLosenord(String nyttLosenord){
        
        losenord = nyttLosenord;
    }
    
    public void setNamn(String nyttNamn) {
        namn = nyttNamn;
    }
    
    public void setId (String nyttId) {
        id = nyttId;
    }
    
    public void setTelefon(String nyttTelefonNummer) {
        telefon = nyttTelefonNummer;
    }
}
