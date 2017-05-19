public class Note {

	protected double valeur;
	protected Matiere matiere;
	protected Etudiant etudiant;

	public Note() {
		this.valeur = 0;
		this.matiere = new Matiere();
		this.etudiant = new Etudiant();
	}

	public Note(double valeur, Matiere matiere, Etudiant etudiant) {
		this.valeur = valeur;
		this.matiere = matiere;
		this.etudiant = etudiant;
	}

	// getters setters
	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public String getNomMatiere() {
		return this.matiere.getNom();
	}

	public int getCoefMatiere() {
		return this.matiere.getCoef();
	}

	public int getNumEtudiant() {
		return this.etudiant.getNumEtudiant();
	}

}