// array to hold DVDs

class DVD {
	public String name;
	public int releaseYear;
	public String director;
	
	public DVD(String name, int releaseYear, String director) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
	}

	public String toString() {
		System.out.println(this.name + ", directed by " + this.director + ", released in " + this.releaseYear + ".");
		return "hola";
	}
}

public class DVDS {
	public static void main(String args[]) {
		DVD[] dvdCollection = new DVD[15];
	
		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
		DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
		DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
		DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

		// put dvds in positions
		dvdCollection[7] = incrediblesDVD;
		dvdCollection[10] = findingDoryDVD;
		dvdCollection[3] = lionKingDVD;
		dvdCollection[1] = avengersDVD;
		
		// ways to print stuff: 1
		avengersDVD.toString();
		incrediblesDVD.toString();
		findingDoryDVD.toString();
		lionKingDVD.toString();
		
		// ways to print stuff: 2
		System.out.println(dvdCollection[7]);
		System.out.println(dvdCollection[10]);
		System.out.println(dvdCollection[3]);
		System.out.println(dvdCollection[1]);
		
	}
}


