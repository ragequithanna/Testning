
public class Agent {
    
    private String agentId;
    private String namn;
    private String anstallningsDatum;
    private String epost;
    private String losenord;
    private String telefon;
    private boolean admin;
    
    public Agent(String agentId, String namn, String anstallningsDatum, String epost, String losenord) {
        this.agentId = agentId;
        this.namn = namn;
        this.anstallningsDatum = anstallningsDatum;
        this.epost = epost;
        this.losenord = losenord;
        telefon = "Inget registrerat telefonnummer";
        admin = false;
    }
    
    public String getNamn() {
        return namn;
    }
    
    public String getAgentId() {
        return agentId;
    }
    
    public String getAnstDatum() {
        return anstallningsDatum;
    }
    
    public String getEpost() {
        return epost;
    }
    
    public String getTelefon() {
        return telefon;
    }
    
    public boolean isAdmin() {
        return admin;
    }
    
    public void setLosenord (String nyttLosenord) {
        losenord = nyttLosenord;
    }
    
    public void setNamn (String nyttNamn) {
        namn = nyttNamn;
    }
    
    public void setTelefon (String nyttNummer) {
        telefon = nyttNummer;
    }
    
    public void setAdmin (boolean admin) {
        this.admin = admin;
    }
}
