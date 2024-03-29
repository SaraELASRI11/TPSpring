package ma.ehei.tp.GenererID;

import org.springframework.stereotype.Service;


@Service
public class AutoincIdGenerateur implements IdGenerateur{
	

	 private int id = 0;

		public String GenerateurId() {
			 id++;
		       System.out.println("Id generer auto increment.");

			return String.valueOf(id);
			

}
}