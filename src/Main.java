import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MilitaryDictator generalFranco = new MilitaryDictator("Franco", "Spain", 36, "Generalissimo");
        PoliticalDictator OceaniaBoss = new PoliticalDictator("Chairman Vox", "Oceania", 19, "Neon Syndicate");
        MilitaryDictator RomeBoss = new MilitaryDictator("Caesar", "Rome", 5, "Imperator");

        List<Leader> leaders = new ArrayList<>();
        leaders.add(generalFranco);
        leaders.add(OceaniaBoss);
        leaders.add(RomeBoss);

        System.out.println("=== STARTING THE LEADER SIMULATION ===");

        for (Leader leader : leaders) {
            System.out.println("\n-----------------------------------");

            leader.printDetails();
            leader.giveSpeech();

            if (leader instanceof MilitaryDictator) {
                MilitaryDictator md = (MilitaryDictator) leader;

                System.out.println("[Military Action Detected]");
                md.holdParade();
                md.repressOpposition();
            }

            else if (leader instanceof PoliticalDictator) {
                PoliticalDictator pd = (PoliticalDictator) leader;

                System.out.println("[Political Action Detected]");
                pd.implementPolicy();
                pd.repressOpposition();
            }
        }

        System.out.println("\n=====================================");
    }
}