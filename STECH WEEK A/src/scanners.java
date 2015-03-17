import java.util.Scanner;
public class scanners {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("What is your name?");
		Scanner inputScanner = new Scanner(System.in);
	    String yourName = inputScanner.nextLine();
	    //System.out.println("Hello, " + yourName + ". Let's play a game-- please enter an adjective:");
		
		//Scanner firstNScanner = new Scanner(System.in);
		//String firstNoun = firstNScanner.nextLine();
		
		//System.out.println("Now can you enter an adjective?");
		//Scanner firstAdjScanner = new Scanner(System.in);
		//String firstAdjective = firstAdjScanner.nextLine();
		
		//System.out.println("Now another noun-");
		//Scanner secNScanner = new Scanner(System.in);
		//String secNoun = secNScanner.nextLine();
		
		//System.out.println("Now a verb);
	    System.out.println ("Hello, " + yourName + ". Let's play a game -- please enter 2 nouns.");
	    Scanner firstNScanner = new Scanner(System.in);
	    String firstNoun = firstNScanner.nextLine();
	    Scanner secNScanner = new Scanner(System.in);
	    String secNoun = secNScanner.nextLine();
	    
	    System.out.println("Now can you give me three adjectives?");
	    Scanner firstAdjScanner = new Scanner(System.in);
	    String firstAdj = firstAdjScanner.nextLine();
	    Scanner secAdjScanner = new Scanner(System.in);
	    String secAdj = secAdjScanner.nextLine();
	    Scanner thAdjScanner = new Scanner(System.in);
	    String thAdj = thAdjScanner.nextLine();
	    
	    System.out.println("Now can you give me 3 verbs?");
	    System.out.println("present tense, please:");
	    Scanner firstVScanner = new Scanner(System.in);
	    String firstVerb = firstVScanner.nextLine();
	    System.out.println("another present tense:");
	    Scanner secVScanner = new Scanner(System.in);
	    String secVerb = secVScanner.nextLine();
	    System.out.println("past tense, please:");
	    Scanner thVScanner = new Scanner(System.in);
	    String thVerb = thVScanner.nextLine();
	    
	    System.out.println("Almost done-- give me two adverbs: ");
	    Scanner firstAdvScanner = new Scanner(System.in);
	    String firstAdv = firstAdvScanner.nextLine();
	    Scanner secAdvScanner = new Scanner(System.in);
	    String secAdv = secAdvScanner.nextLine();
	    
	    System.out.println("Here's the story you came up with: ");
	    System.out.println("   Once upon a time there was a(n) " + firstNoun + ". This " + firstNoun + " was very " + firstAdj + ". " + "He\\She\\It liked to " + firstVerb + " " + firstAdv + ". One day, he/she/it met a(n) " + secNoun + ". \"How " + secAdj + " you are!\" He/she/it exclaimed.");
	    System.out.println("   Then " + firstNoun + " proceeded to " + secVerb + ". But the " + secNoun + " was " + thAdj + " and " + secAdv + " " + thVerb + ".");
	    System.out.println("Thanks for playing with me, " + yourName + "!");
	 

	}

}