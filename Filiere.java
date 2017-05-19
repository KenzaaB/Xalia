import java.util.ArrayList;
public class Filiere {
	
	protected String nomFiliere ;
	protected Responsable  responsable = new Responsable();
	ArrayList<Etudiant> listeEtudiants;
	ArrayList<Semestre> listeSemestre;
	
	
	
	//constructeur par default:
	protected Filiere (){
		this.nomFiliere = "Inconnu";
		this.listeEtudiants = new ArrayList<Etudiant>();
		this.listeSemestre = new ArrayList<Semestre>();
	}
	
	//constructeur av ts les attributs en parametre:
	protected Filiere (String nomFiliere, Responsable responsable, Etudiant e, Semestre s){
		this.nomFiliere = nomFiliere;
		this.responsable = responsable;
		listeEtudiants.add(e);
		listeSemestre.add(s);
	}
	
	//constructeur sans les attributs listeEtudiants et listeSemestre
	protected Filiere (String nomFiliere, Responsable responsable){
		this.nomFiliere = nomFiliere;
		this.responsable = responsable;
	}

	// Les getters:
	public String getNom (){
		return this.nomFiliere;
	}
	
	public String getNomResponsable(){
		return this.responsable.getNom();
	}
	
	public String GetPrenomResponsable(){
		return this.responsable.getPrenom();
	}
	
	//Les setters:
	public void setNom (String n){
		this.nomFiliere = n ;
	}
	
	public void setNomResponsable (String n){
		this.responsable.nom = n;
	}
	
	public void setPrenomResponsable (String p){
		this.responsable.prenom = p ;
	}
	
	//Méthodes sur la liste des etudiants:
	
	protected void ajoutEtudiant(Etudiant e){
		listeEtudiants.add(e);
	}
	
	protected void afficherListeEtudiant(){
		for(int i=0; i<= listeEtudiants.size(); i++){
			System.out.println(listeEtudiants.get(i).numEtudiant+" "+
			listeEtudiants.get(i).nom+" "+listeEtudiants.get(i).prenom);
		}
	}
	
	//Méthode sur Semestre
	protected void ajoutSemestre(Semestre s){
		listeSemestre.add(s);
	}
}