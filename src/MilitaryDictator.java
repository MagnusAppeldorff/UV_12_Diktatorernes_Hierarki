public class MilitaryDictator extends Leader implements PowerActions {

    String militaryRank;

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super (name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }

    @Override
    void giveSpeech() {
        System.out.println(militaryRank + " " + name + " stand on the balcony: 'The military controls everything!'");
    }

    @Override
    public void implementPolicy() {
        System.out.println(name + " orders a mandatory curfew at 8 PM using the military.");
    }

    @Override
    public void repressOpposition() {
        System.out.println(name + " deploys tanks to clear out protestors.");
    }

    @Override
    public void holdParade() {
        System.out.println(name + " hosts a massive parade showing off tanks and jet fighters.");
    }
}
