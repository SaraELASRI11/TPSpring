package ma.ehei.tp.DAO;

import org.springframework.stereotype.Repository;

import ma.ehei.tp.ExEtudiant.Etudiant;

@Repository
public class MysqlEtudiant implements EtudiantDAO{

	@Override
	public void persister(Etudiant e) {
		// TODO Auto-generated method stub
		
		System.out.println("votre etudiant est enregistrer dans mysql");
	}
	
	

}
