import java.util.Scanner;

public class juomaAutomaatti {

	private int tee;
	private int kahvi;
	private int kaakao;



	public juomaAutomaatti() {

		this.tee = 50;
		this.kahvi = 50;
		this.kaakao = 50;
	}



	public int getTee() {
		return tee;
	}
	public void setTee(int tee) {
		this.tee = tee;
	}


	public int getKahvi() {
		return kahvi;
	}
	public void setKahvi(int kahvi) {
		this.kahvi = kahvi;
	}


	public int getKaakao() {
		return kaakao;
	}
	public void setKaakao(int kaakao) {
		this.kaakao = kaakao;
	}


	//Kahvin valmistusmetodi
	public void valmistaKahvi() {
		System.out.println("Odota hetki, Kahvisi valmistuu. ");
		if (this.kahvi -10 < 0) {
			this.kahvi = 0; 
			System.out.println("Kahvia ei ole enää jäljellä! Täytä säiliö.");
		}

		else this.kahvi -= 10;

		System.out.println("Kahvia on jäljellä: " + this.kahvi + " yksikköä. Teetä on jäljellä: " + this.tee + " yksikköä. Kaakaota on jäljellä: " + this.kaakao + " yksikköä." +"\n");
	}

	//Teen valmistusmetodi
	public void valmistaTee() {
		System.out.println("Odota hetki, Teesi valmistuu. ");
		if (this.tee -10 < 0) {
			this.tee = 0; 
			System.out.println("Teetä ei ole enää jäljellä! Täytä säiliö.");
		}

		else this.tee -= 10;

		System.out.println("Kahvia on jäljellä: " + this.kahvi + " yksikköä. Teetä on jäljellä: " + this.tee + " yksikköä. Kaakaota on jäljellä: " + this.kaakao + " yksikköä." +"\n");

	}

	//Kaakaon valmistusmetodi
	public void valmistaKaakao() {
		System.out.println("Odota hetki, Kaakaosi valmistuu. ");
		if (this.kaakao -10 < 0) {
			this.kaakao = 0; 
			System.out.println("Kaakaota ei ole enää jäljellä! Täytä säiliö.");
		}

		else this.kaakao -= 10;

		System.out.println("Kahvia on jäljellä: " + this.kahvi + " yksikköä. Teetä on jäljellä: " + this.tee + " yksikköä. Kaakaota on jäljellä: " + this.kaakao + " yksikköä." +"\n");
	}


	//Ajo
	public static void main(String[] args){
		juomaAutomaatti omaKone = new juomaAutomaatti();
		Scanner lukija = new Scanner(System.in);
		String vastaus;

		do {
			System.out.println("*******Juoma-Automaatti*******");
			System.out.println("");
			System.out.println("1. Kahvi");
			System.out.println("2. Tee");
			System.out.println("3. Kaakao");
			System.out.println("4. Lopeta");
			System.out.println("");
			System.out.println("******************************");
			int input = lukija.nextInt();

			switch (input) {

			case 1:
				omaKone.valmistaKahvi();
				break;

			case 2:
				omaKone.valmistaTee();
				break;

			case 3:
				omaKone.valmistaKaakao();
				break;

			case 4:
				System.out.println("******************************");
				System.out.println("Oletko varma?");
				break;

			}

			System.out.println("******************************");
			System.out.println("Jatka tilaamista");
			System.out.println("Kirjoita: Kyllä");
			System.out.println("Kirjoita: Ei");
			vastaus = lukija.next();


		}
		while (vastaus.equalsIgnoreCase("Kyllä"));
	}
}
