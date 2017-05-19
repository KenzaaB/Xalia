
public class Principale {

	public static void main (String[] args){
		Enseignant ens1 = new Enseignant();
		System.out.println(ens1.nom);
		
		Enseignant ens2 = new Enseignant("Belka", "Kenza");
		System.out.println("Nom de l'ens2 est " + ens2.getNom());
		
		Responsable resp1 = new Responsable();
		System.out.println(resp1.nom);
		
		Responsable resp2 = new Responsable("BELKA", "Mehdi");
		System.out.println("Le nom du responsable est " + resp2.getNom());
		System.out.println("Le nom du responsable est " + resp2.nom);
		
		Filiere l3info = new Filiere ();
		System.out.println("le nom de la filiere est "+ l3info.nomFiliere +
				" le responsable est "+  l3info.getNomResponsable());
		
		Matiere algo = new Matiere();
		System.out.println("le nom de la matiere est " + algo.getNom()+
				" son coefficient est de "+ algo.getCoef()+
				" elle represente un credit de: "+ algo.getCredit()+
				" elle est enseignée par "+algo.getNomProf()+" "+algo.getPrenomProf());
		
		algo.setNomMatiere("Algo des graphes");
		algo.setCoef(4);
		algo.setCredit(3);
		algo.setProf(ens2);
		
		
	}
}
