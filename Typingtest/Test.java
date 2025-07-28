import java.util.Scanner;
import java.util.Random;
public class Test{
    private static final String[] sentences = {
    "The sound of leather on willow echoed across the stadium as the batsman struck a magnificent cover drive.",
    "Cricket is not just a sport in India; it's a religion followed with passion, pride, and unwavering emotion.",
    "The bowler ran in from a long distance, eyes fixed on the stumps, delivering a fiery yorker that shattered the middle stump.",
    "During a tense final over, the crowd held its breath as the batsman needed just six runs off the last two balls.",
    "Fielding at short leg requires immense courage, sharp reflexes, and complete trust in your helmet.",
    "The captain set an attacking field with slips, gully, and a silly point, hoping to grab an early breakthrough.",
    "In Test cricket, patience and temperament matter more than flamboyant strokeplay and aggressive intent.",
    "When the umpire raised his finger, the batsman reviewed the decision immediately, hoping for a lifeline through DRS.",
    "Rain interrupted play for the third time in the day, leaving fans disappointed but hopeful for a result.",
    "The spinner flighted the ball beautifully, luring the batsman out of the crease and getting him stumped.",
    "The partnership between the two middle-order batsmen stabilized the innings after early wickets fell cheaply.",
    "The all-rounder proved his worth by taking crucial wickets and scoring quick runs during the powerplay.",
    "The crowd erupted in joy as the local hero reached his century with a towering six over midwicket.",
    "The white ball behaves differently under lights, making day-night matches a unique challenge for players.",
    "Fast bowlers love overcast conditions, as the ball swings more and becomes harder to pick early.",
    "Every cricket fan remembers where they were when their team won the World Cup after decades of heartbreak.",
    "T20 cricket demands explosive batting, clever bowling variations, and razor-sharp fielding skills.",
    "The batsman's footwork was flawless, coming down the pitch to drive the spinner straight back past him.",
    "Commentators praised the young debutant for showing maturity beyond his years in a high-pressure chase.",
    "A well-timed scoop shot over the keeper's head is risky but can be a game-changing innovation in modern cricket."};

   public static String getsentence(){
    Random r = new Random();
    return sentences[r.nextInt(sentences.length)];
   } 
   public static void start(){
    Scanner sc = new Scanner(System.in);
    String str = getsentence();

    System.out.println("Typing Test....");
    System.out.println("-----------------------------------------------");
    System.out.println("Type the following text fastly and accurately");
    System.out.println();
    System.out.println(str + "\n");
    System.out.println("Press enter once you ready..........");
    sc.nextLine();
    long starttime = System.currentTimeMillis();
    System.out.println("Start typing:");
    String input = sc.nextLine();
    long stoptime = System.currentTimeMillis();

    double timetaken = (stoptime - starttime)/1000.00;
    int wordscount = Operation.countwords(input);
    double wpm = Operation.countwpm(timetaken,wordscount);
    double accuracy = Operation.calculateaccuracy(str,input);

    System.out.printf("\nTime Taken : %.2f seconds", timetaken);
    System.out.printf("\nWords count : %d", wordscount);
    System.out.printf("\nWords per minute : %.2f", wpm);
    System.out.printf("\nAccuracy : %.2f%%\n", accuracy);
    
    sc.close();
   }
}