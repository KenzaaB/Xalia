import java.util.ArrayList;

public class Semestre {
	
	protected int idSem;
	protected Filiere filiere;
	ArrayList <Matiere> module;
	
	protected Semestre(){
		this.idSem = 0;
		this.filiere  = new Filiere ();
		this.module = new ArrayList<Matiere> ();
	}
	
	protected Semestre(int id,Filiere f, Matiere m){
		this.idSem = id;
		this.filiere = f ;
		module.add(m);
	}
	
	//Methodes:
		protected void ajoutMatiere (Matiere m){
			module.add(m);
		}
}
