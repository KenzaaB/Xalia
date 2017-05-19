import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	protected int numEtudiant;
	protected String nom;
	protected String prenom;
	Filiere f;
	List<Note> listeNotes;

	public Etudiant() {
		this.numEtudiant = 0;
		this.nom = "Inconnu";
		this.prenom = "Inconnu";
		this.f = new Filiere();
		this.listeNotes = new ArrayList<Note>();
	}

	public Etudiant(int numEtudiant, String nom, String prenom, Filiere f, Note n) {

		this.numEtudiant = numEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.f = f;
		listeNotes.add(n);

	}

	public int getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(int numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Filiere getF() {
		return f;
	}

	public void setF(Filiere f) {
		this.f = f;
	}

	public void affecterNote(Note n) {
		listeNotes.add(n);
	}

	public void afficherNote(Note n) {
		System.out.println("la valeur de la note est " + n.getValeur() + " le module est " + n.getNomMatiere());
	}

	public double CalculerMoyenneEtudiant() {
		double sommeNotes = 0;
		double sommeCoef = 0;
		for (Note n : listeNotes) {
			sommeNotes += n.getValeur() * n.getCoefMatiere();
			sommeCoef += n.getCoefMatiere();
		}
		return sommeNotes / sommeCoef;
	}

}