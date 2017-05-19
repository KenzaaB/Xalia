import java.util.Scanner;
public class Enseignant {
	
	protected String nom; 
	protected String prenom ; 

	//Constructeur par defaut:
	protected Enseignant (){
		this.nom = "Inconnu";
		this.prenom = "Inconnu";
	}
	
	//Constructeur:
	protected Enseignant ( String n, String p){
		this.nom = n;
		this.prenom = p; 
	}
	
	//Les getters:
	public String getNom (){
		return nom;
	}
	
	public String getPrenom (){
		return prenom; 
	}
	
	//Les setters
	public void setNom (String nom){
		this.nom = nom ;
	}
	
	public void setPrenom (String prenom){
		this.prenom = prenom ; 
	}
	
	//Methodes:
	
	protected void ajoutNote(Matiere m, Filiere f){
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de note souhaitez-vous ajouter?");
		int nbNote = sc.nextInt();
		
		for(int i=0; i < nbNote; i++){
			System.out.println("Valeur de la note:?");
			int v = sc.nextInt();
			Etudiant e = f.listeEtudiants.get(i);
			Note n = new Note(v,m,e);
			e.listeNotes.add(n);
		}
		
	}
}
