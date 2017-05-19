
public class Matiere {

	protected String idMatiere;
	protected String nomMatiere;
	protected int coef;
	protected int credit;
	protected Enseignant prof;

	// Constructeur par defaut:
	protected Matiere() {
		this.idMatiere = "inonnu";
		this.nomMatiere = "inconnu";
		this.coef = 0;
		this.credit = 0;
		this.prof = new Enseignant();
	}

	// Constructeur:
	protected Matiere(String id, String nomM, int coef, int cred, Enseignant ens) {
		this.idMatiere = id;
		this.nomMatiere = nomM;
		this.coef = coef;
		this.credit = cred;
		this.prof = ens;
	}

	// Les getters:
	public String getIdMatiere() {
		return this.idMatiere;
	}

	public String getNom() {
		return this.nomMatiere;
	}

	public int getCoef() {
		return this.coef;
	}

	public int getCredit() {
		return this.credit;
	}

	public String getNomProf() {
		return this.prof.getNom();
	}

	public String getPrenomProf() {
		return this.prof.getPrenom();
	}

	// Les mutateurs
	public void setIdMatiere(String id) {
		this.idMatiere = id;
	}

	public void setNomMatiere(String nom) {
		this.nomMatiere = nom;
	}

	public void setCoef(int c) {
		this.coef = c;
	}

	public void setCredit(int c) {
		this.credit = c;
	}

	public void setProf(Enseignant ens) {
		this.prof = ens;
	}

	// Méthodes :

	/*protected void ajoutNote(Etudiant e,  double v) {
		Note n = new Note(v,this,e);
		e.listeNotes.add(n);
	}*/
}
