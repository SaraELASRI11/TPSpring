package ma.ehei.tp.GenererID;

import org.springframework.stereotype.Service;


@Service

public class TimeStampIdGenerateur implements IdGenerateur{
	
	
	@Override
	public String GenerateurId() {
		
		 return String.valueOf(System.currentTimeMillis());
		
	}

}
