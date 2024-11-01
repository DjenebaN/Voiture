import java.util.Scanner;

public class Voiture {
	
	private String matricule, marque;
	private int nbkm, puissance;
	
	public Voiture() {
		this.matricule ="";
		this.marque ="";
		this.nbkm = 0;
		this.puissance = 0;
	}
	
	public void saisir() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner le matricule :");
		this.matricule = Console.SaisirString();
		
		System.out.println("Donner la marque :");
		this.marque = Console.SaisirString();
		
		System.out.println("Donner le nbkm :");
		this.nbkm = Console.SaisirInt();
		
		System.out.println("Donner le puossance :");
		this.puissance = Console.SaisirInt();
		
	}
	
	public void afficher() {
		System.out.println("Le matricule est de :" + this.matricule);
		System.out.println("La marque est :" + this.marque);
		System.out.println("Le nbkm est de :" + this.nbkm);
		System.out.println("La puissance est de :" + this.puissance);
	}
	
	public String toString() { //structure données sous format text, séparé par des point virugles
		String chaine="";
		chaine = this.matricule + " ; " + this.marque + " ; " + this.nbkm + " ; " + this.puissance ;
		return chaine;
	}
	
	public String toXml() { //format balisé comme html. LEs données peuvent transiter entre difeerentes applications utilisant du XML
		String chaine="";
		chaine += "<voiture>\n";
		chaine += "\t<matricule>"  +  this.matricule  +   "</matricule>\n";
		chaine += "\t<marque>"     +  this.marque     +   "</marque>\n";
		chaine += "\t<nbkm>"       +  this.nbkm       +   "</nbkm>\n";
		chaine += "\t<puissance>"  +  this.puissance  +   "</puissance>\n";
		chaine += "</voiture>\n";
		return chaine;
	}
	
	public String toJson() { //de meme pour json
		String chaine="";
		chaine += "[{]";
		chaine += " 'matricule' : '"  + this.matricule +  "', ";
		chaine += " 'marque' : '"     + this.marque    +  "', ";
		chaine += " 'nbkm' : '"       + this.nbkm      +  "', ";
		chaine += " 'puissance' : '"  + this.puissance +  "', ";
		chaine += "}]";
		return chaine;
	}
	
	public void menu() {
		Scanner sc = new Scanner (System.in);
		int choix = 0;
		do {
			System.out.println("______GESTION VOITURE______");
			System.out.println("1 - Saisir les infos");
			System.out.println("2 - Afficher les infos");
			System.out.println("3 - To Stirng");
			System.out.println("4 - To Xml");
			System.out.println("5 - To Json");
			System.out.println("0 - Qitter");
			System.out.println("Votre choix");
			
			choix = Console.SaisirInt();
			switch (choix) {
			case 1 : this.saisir();break;
			case 2 : this.afficher();break;
			case 3 : System.out.println("TO STRING : " + this.toString()) ; break ;
			case 4 : System.out.println("TO XML : " + this.toXml()) ; break ;
			case 5 : System.out.println("TO JSON : " + this.toJson()) ; break ;
			}
		}while (choix !=0);
	}
	
	//getters and Setters

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getNbkm() {
		return nbkm;
	}

	public void setNbkm(int nbkm) {
		this.nbkm = nbkm;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	
}
