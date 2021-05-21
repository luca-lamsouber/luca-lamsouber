import java.util.Scanner;

public class testi {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int luku;
		//Aluksi tulostetaan do silmukalla valikko.
		do {
			
			System.out.println("- 1.  P��kaupunkivisa  -");
			System.out.println("- 2.  Urheiluvisa      -");
			System.out.println("- 3.  Lopeta ohjelma   -");
			System.out.println("------------------------");
			System.out.println("------------------------");
			System.out.println("-     Mit� tehd��n     -");
			System.out.println("-  Valitse 1, 2 tai 3  -");
			
			luku = lukija.nextInt();
			//Jos k�ytt�j�n antama numero on 1 niin menn��n p��kaupunkivisaan, jonka j�lkeen tulee break eli ei menn� do silmukan alkuun.
			if (luku == 1) 
			{
				p��kaupunki();
				break;
			} 
			// Jos 2 niin sama kuin edellisess� mutta tulostetaan urheiluvisa.
			else if (luku == 2) 
			{
				urheilu();
				break;
			}
			//Jos joku muu kuin 1, 2 tai 3 niin tulostetaan "Yrit� uudelleen" ja menn��n do silmukan alkuun. 
			else if (luku > 3 || luku < 1)
			{
				System.out.println("Yrit� uudelleen");
			}
			
			}
			//Jos 3 niin tulostetaan "N�hd��n ensi kerralla!" ja ohjelma loppuu.
			while (luku != 3);
			System.out.println("\n" + "N�hd��n ensi kerralla!");
			
		}
		private static void p��kaupunki() {
		Scanner lukija = new Scanner(System.in);
		//int oik on pisteytyst� varten ja int kysymykset on kysymyksen numeroa varten, jotta tiet�� miss� menn��n.		
		int oik = 0;
		int kysymykset = 1;	 
		//Perus tervehdys.
		tervetuloa1();
		//Simppelit ohjeet
		ohje();
		//Kysymyksen numero
		kysymys(kysymykset);
		//Tulostetaan kysymys ja vaihtoehdot.Kun t�m� k�yd��n l�pi niin +1 kysymysten numeroihin.
		System.out.println("Mik� on Suomen p��kaupunki?");
		System.out.println("a. Turku");
		System.out.println("b. Helsinki");
		System.out.println("c. Oulu");
		kysymykset += 1;
		//Jos k�ytt�j� laittaa vastauksen oikein niin oikeisiin vastauksiin +1.
		String vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		//Jos v��rin niin menn��n niin ei tule pistett� ja menn��n eteenp�in.
		else
		{
			System.out.println("V��r� vastaus :(\n");
		}
		//Sama prosessi toistuu monta kertaa.
		kysymys(kysymykset);
		
		System.out.println("Mik� on Japanin p��kaupunki?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Ruotsin p��kaupunki?");
		System.out.println("a. G�teborg");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Portugalin p��kaupunki?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Saksan p��kaupunki?");
		System.out.println("a. Berliini");
		System.out.println("b. M�nchen");
		System.out.println("c. K�ln");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("a"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Kanadan p��kaupunki?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Brasilian p��kaupunki?");
		System.out.println("a. Bras�lia");
		System.out.println("b. Rio de Janeiro");
		System.out.println("c. S�o Paulo");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("V��r� vastaus :(\n");
		}	
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Belgian p��kaupunki?");
		System.out.println("a. Bryssel");
		System.out.println("b. Li�ge");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Espanjan p��kaupunki?");
		System.out.println("a. M�laga");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mik� on Australian p��kaupunki?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		//T�ss� kohtaa loppuu kysymykset ja lasketaan pisteet alla n�kyv�ll� tavalla.
		double pisteet = ( 100.*oik) / (kysymykset-1);
		
		System.out.println("Sin� sait " + pisteet + "%" + " oikein!");
		
		}	
		//Metodi, jolla tulostetaan kysymysten numerot.
		private static void kysymys(int kysymykset) {
		System.out.println("Kysymys nro." + kysymykset + "\n");
			
		}
		//Alla n�kyy kaksi erilaista metodia, joilla tulostetaan tervehdykset.
		private static void tervetuloa1() {
		System.out.println("\n" + "Tervetuloa p��kaupunkivisaan!" + "\n");
		}
		
		private static void tervetuloa2() {
		System.out.println("\n" + "Tervetuloa urheiluvisaan!" + "\n");
		}
		//T�ss� on ohjeiden metodi.
		private static void ohje() {
			
			System.out.println("-----------  Ohjeet  ------------");
			System.out.println("---------------------------------");
			System.out.println("-  Tietovisassa on 10 kysymyst� -");
			System.out.println("- Valitse a, b tai c vaihtoehto -");
			System.out.println();
			System.out.println();
		}
		
		//Samalla tavalla tehty, kuin p��kaupinki visa.
		private static void urheilu() {
		Scanner lukija = new Scanner(System.in);
				
		int oik = 0;
		int kysymykset = 1;	 
		
		tervetuloa2();
		
		ohje();
		
		kysymys(kysymykset);
		System.out.println("Miss� joukkueessa Lionel Messi pelaa?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mist� NHL on lyhenne?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
			
		System.out.println("Monta pistett� touchdownista saa?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Miss� joukkueessa LeBron James aloitti h�nen NBA uransa?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mink� maalainen on jalkapalloilija Cristiano Ronaldo");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mink� maalainen on autourheilija Kimi R�ikk�nen");
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
			System.out.println("V��r� vastaus :(\n");
		}
			
		kysymys(kysymykset);
		
		System.out.println("Mist� lajista Teemu Sel�nne on tunnettu");
		System.out.println("a. Tenniksest�");
		System.out.println("b. J��kiekosta");
		System.out.println("c. Pes�pallosta");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("b"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("V��r� vastaus :(\n");
		}	
		
		kysymys(kysymykset);
		
		System.out.println("Montako mailaa saa olla kent�ll� mukana golffissa");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Mist� lajista Roger Federer on tunnettu?");
		System.out.println("a. Jalkapallosta");
		System.out.println("b. Baseballista");
		System.out.println("c. Tenniksest�");
		kysymykset += 1;

		vastaus = lukija.nextLine();
		if (vastaus.equals("c"))
		{
			System.out.println("Oikea vastaus!\n");
			oik += 1;
		}
		else
		{
			System.out.println("V��r� vastaus :(\n");
		}
		
		kysymys(kysymykset);
		
		System.out.println("Monta pelaajaa on yhdell� joukkueella kent�ll� k�sipallossa?");
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
			System.out.println("V��r� vastaus :(\n");
		}
		
		double pisteet = ( 100.*oik) / (kysymykset-1);
			
		System.out.println("Sin� sait " + pisteet + "%" + " oikein!");
			
		}
		
	}


