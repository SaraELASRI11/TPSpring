package ma.ehei.tp.GenererID;

import org.springframework.stereotype.Service;

@Service
public class PrefixeIdGenerateur implements IdGenerateur {

	
	private String prefixe;
	
	public PrefixeIdGenerateur() {
        
    }

    public PrefixeIdGenerateur(String prefixe) {
        this.prefixe = prefixe;
    }
    
    public void setPrefixe(String prefixe) {
        this.prefixe = prefixe;
    }
    public String GenerateurId() {
        return prefixe ; 
    }

}
