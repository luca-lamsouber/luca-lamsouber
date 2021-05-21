import java.util.Scanner;

public class testi {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int luku;
		//Aluksi tulostetaan do silmukalla valikko.
		do {
			
			System.out.println("- 1.  Pääkaupunkivisa  -");
			System.out.println("- 2.  Urheiluvisa      -");
			System.out.println("- 3.  Lopeta ohjelma   -");
			System.out.println("------------------------");
			System.out.println("------------------------");
			System.out.println("-     Mitä tehdään     -");
			System.out.println("-  Valitse 1, 2 tai 3  -");
			
			luku = lukija.nextInt();
			//Jos käyttäjän antama numero on 1 niin mennään pääkaupunkivisaan, jonka jälkeen tulee break eli ei mennä do silmukan alkuun.
			if (luku == 1) 
			{
				pääkaupunki();
				break;
			} 
			// Jos 2 niin sama kuin edellisessä mutta tulostetaan urheiluvisa.
			else if (luku == 2) 
			{
				urheilu();
				break;
			}
			//Jos joku muu kuin 1, 2 tai 3 niin tulostetaan "Yritä uudelleen" ja mennään do silmukan alkuun. 
			else if (luku > 3 || luku < 1)
			{
				System.out.println("Yritä uudelleen");
			}
			
			}
			//Jos 3 niin tulostetaan "Nähdään ensi kerralla!" ja ohjelma loppuu.
			while (luku != 3);
			System.out.println("\n" + "Nähdään ensi kerralla!");
			
		}
		private static void pääkaupunki() {
		Scanner lukija = new Scanner(System.in);
		//int oik on pisteytystä varten ja int kysymykset on kysymyksen numeroa varten, jotta tietää missä mennään.		
		int oik = 0;
		int kysymykset = 1;	 
		//Perus tervehdys.
		tervetuloa1();
		//Simppelit ohjeet
		ohje();
		//Kysymyksen numero
		kysymys(kysymykset);
		//Tulostetaan kysymys ja vaihtoehdot. Kun tämä käydään läpi niin +1 kysymysten numeroihin.
		System.out.println("Mikä on Suomen pääkaupunki?");
		System.out.println("a. Turku");
		System.out.println("b. Helsinki");
		System.out.println("c. Oulu");
		kysymykset += 1;
		//Jos käyttäjä laittaa vastauksen oikein niin oikeisiin vastauksiin +1.
		String vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		//Jos väärin niin ei tule pistettä ja mennään eteenpäin.
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		//Sama prosessi toistuu monta kertaa.
		kysymys(kysymykset);
		
		System.out.println("Mikä on Japanin pääkaupunki?");
		System.out.println("a. Tokio");
		System.out.println("b. Osaka");
		System.out.println("c. Kioto");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Ruotsin pääkaupunki?");
		System.out.println("a. Göteborg");
		System.out.println("b. Tukholma");
		System.out.println("c. Upsala");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Portugalin pääkaupunki?");
		System.out.println("a. Braga");
		System.out.println("b. Porto");
		System.out.println("c. Lissabon");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("c"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Saksan pääkaupunki?");
		System.out.println("a. Berliini");
		System.out.println("b. München");
		System.out.println("c. Köln");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Kanadan pääkaupunki?");
		System.out.println("a. Toronto");
		System.out.println("b. Ottawa");
		System.out.println("c. Montreal");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Brasilian pääkaupunki?");
		System.out.println("a. Brasília");
		System.out.println("b. Rio de Janeiro");
		System.out.println("c. São Paulo");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}	
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Belgian pääkaupunki?");
		System.out.println("a. Bryssel");
		System.out.println("b. Liège");
		System.out.println("c. Gent");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Espanjan pääkaupunki?");
		System.out.println("a. Málaga");
		System.out.println("b. Barcelona");
		System.out.println("c. Madrid");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("c"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mikä on Australian pääkaupunki?");
		System.out.println("a. Canberra");
		System.out.println("b. Sydney");
		System.out.println("c. Melbourne");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		//Tässä kohtaa loppuu kysymykset ja lasketaan pisteet alla näkyvällä tavalla.
		double pisteet = ( 100.*oik) / (kysymykset-1);
		
		System.out.println("Sinä sait " + pisteet + "%" + " oikein!");
		
		}	
		//Metodi, jolla tulostetaan kysymysten numerot.
		private static void kysymys(int kysymykset) {
		System.out.println("Kysymys nro." + kysymykset + "\n");
			
		}
		//Alla näkyy kaksi erilaista metodia, joilla tulostetaan tervehdykset.
		private static void tervetuloa1() {
		System.out.println("\n" + "Tervetuloa pääkaupunkivisaan!" + "\n");
		}
		
		private static void tervetuloa2() {
		System.out.println("\n" + "Tervetuloa urheiluvisaan!" + "\n");
		}
		//Tässä on ohjeiden metodi.
		private static void ohje() {
			
			System.out.println("-----------  Ohjeet  ------------");
			System.out.println("---------------------------------");
			System.out.println("-  Tietovisassa on 10 kysymystä -");
			System.out.println("- Valitse a, b tai c vaihtoehto -");
			System.out.println();
			System.out.println();
		}
		
		//Samalla tavalla tehty, kuin pääkaupinki visa.
		private static void urheilu() {
		Scanner lukija = new Scanner(System.in);
				
		int oik = 0;
		int kysymykset = 1;	 
		
		tervetuloa2();
		
		ohje();
		
		kysymys(kysymykset);
		System.out.println("Missä joukkueessa Lionel Messi pelaa?");
		System.out.println("a. PSG");
		System.out.println("b. Real Madrid");
		System.out.println("c. Barcelona");
		kysymykset += 1;

		String vastaus = lukija.nextLine();
		if (vastaus.equals("c"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mistä NHL on lyhenne?");
		System.out.println("a. National Hockey League");
		System.out.println("b. Northern Hockey League");
		System.out.println("c. Navy Hockey league");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
			
		System.out.println("Monta pistettä touchdownista saa?");
		System.out.println("a. 6");
		System.out.println("b. 7");
		System.out.println("c. 8");
		kysymykset += 1;
			
		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Missä joukkueessa LeBron James aloitti hänen NBA uransa?");
		System.out.println("a. Miami Heat");
		System.out.println("b. Los Angeles Lakers");
		System.out.println("c. Cleveland Cavaliers");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("c"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Minkä maalainen on jalkapalloilija Cristiano Ronaldo");
		System.out.println("a. Kreikkalainen");
		System.out.println("b. Portugalilainen");
		System.out.println("c. Brasilialainen");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Minkä maalainen on autourheilija Kimi Räikkönen");
		System.out.println("a. Suomalainen");
		System.out.println("b. Virolainen");
		System.out.println("c. Ruotsalainen");
		kysymykset += 1;
			
		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
			
		kysymys(kysymykset);
		
		System.out.println("Mistä lajista Teemu Selänne on tunnettu");
		System.out.println("a. Tenniksestä");
		System.out.println("b. Jääkiekosta");
		System.out.println("c. Pesäpallosta");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}	
		
		kysymys(kysymykset);
		
		System.out.println("Montako mailaa saa olla kentällä mukana golffissa");
		System.out.println("a. 12");
		System.out.println("b. 14");
		System.out.println("c. 16");
		kysymykset += 1;
	
		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mistä lajista Roger Federer on tunnettu?");
		System.out.println("a. Jalkapallosta");
		System.out.println("b. Baseballista");
		System.out.println("c. Tenniksestä");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("c"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Monta pelaajaa on yhdellä joukkueella kentällä käsipallossa?");
		System.out.println("a. 5");
		System.out.println("b. 6");
		System.out.println("c. 7");
		kysymykset += 1;
	
		vastaus = lukija.nextLine();
		if (vastaus.equals("c"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("Väärä vastaus :(\n");
		}
		
		double pisteet = ( 100.*oik) / (kysymykset-1);
			
		System.out.println("Sinä sait " + pisteet + "%" + " oikein!");
			
		}
		
	}


