package ma.ehei.tp.ExEtudiant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ma.ehei.tp.DAO.EtudiantDAO;
import ma.ehei.tp.GenererID.IdGenerateur;

@Service
public class EtudiantService {
	
	@Autowired
	private EtudiantDAO ET;
	@Autowired
	@Qualifier("autoincIdGenerateur")
	private IdGenerateur idG;
	
	public EtudiantService()
	{
		
	}

	/*public EtudiantService(EtudiantDAO eT) {
		super();
		ET = eT;
	}*/

	public void ajouter(Etudiant e)
	{ 
		e.setId(idG.GenerateurId());
		 ET.persister(e);
	}
	 
}
