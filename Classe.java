
/*import java.util.ArrayList;
import java.util.List;

public class Classe {
	protected String nomClasse;
	Filiere fil = new Filiere();
	List<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
	
	
	public Classe() {
		this.nomClasse = "inconnu";
	}
	
	
	public Classe(String nomClasse,Filiere f ,List<Etudiant> listeEtudiants) {
		
		this.nomClasse = nomClasse;
		this.fil = f;
		this.listeEtudiants = listeEtudiants;
	}
	

	public String getNomClasse() {
		return nomClasse;
	}
	
	public Filiere getFilier(){
		return this.fil;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}


	public double CalculerMoyenne(){
		int nbEtudiants = listeEtudiants.size();
		double sommeMoyennes = 0;
		 for (Etudiant e : listeEtudiants) {
			 sommeMoyennes+= e.CalculerMoyenneEtudiant();
			   
		}return sommeMoyennes/nbEtudiants;
		
	}
	
	public void ajouterEtudiants(Etudiant e){
		listeEtudiants.add(e);
	}
	
}*/