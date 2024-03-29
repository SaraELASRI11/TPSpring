package ma.ehei.tp;

import ma.ehei.tp.DAO.EtudiantDAO;
import ma.ehei.tp.DAO.MemoireEtudiant;
import ma.ehei.tp.ExEtudiant.EtudiantService;
import ma.ehei.tp.GenererID.AutoincIdGenerateur;
import ma.ehei.tp.GenererID.PrefixeIdGenerateur;
import ma.ehei.tp.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import  ma.ehei.tp.ExEtudiant.Etudiant;

public class App {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       

       EtudiantService etudiantService = context.getBean(EtudiantService.class);

       Etudiant etudiant1 = new Etudiant();
       etudiant1.setnom("EL ASRI");
       etudiant1.setprenom("Sara");
       etudiantService.ajouter(etudiant1);
   }
    
}
