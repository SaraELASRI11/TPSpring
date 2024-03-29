package ma.ehei.tp.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import ma.ehei.tp.ExEtudiant.Etudiant;
@Primary
@Repository
public class MemoireEtudiant implements EtudiantDAO {

	private List<Etudiant> listeEtudiants;
	
@Autowired
	 public MemoireEtudiant() {
		 
	        listeEtudiants = new ArrayList<>();
	    }

	public void persister(Etudiant e) {
		
		        listeEtudiants.add(e);
		        
		        System.out.println("Etudiant ajoute en memoire: " + e.Getnom() + " " + e.Getprenom());
		    }
		
	

}
