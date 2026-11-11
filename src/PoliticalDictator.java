class PoliticalDictator extends Leader implements PowerActions {

    String partyName;

    public PoliticalDictator(String name, String country, int yearsInPower, String partyName) {
        super (name, country, yearsInPower);
        this.partyName = partyName;
    }

    @Override
    void giveSpeech() {
        System.out.println(name + " speaks at the party rally: 'Long live the " + partyName + "!'");
    }

    @Override
    public void implementPolicy() {
        System.out.println(name + " passes a law making the " + partyName + " the only legal party.");
    }

    @Override
    public void repressOpposition() {
        System.out.println(name + " bans all rival political parties and websites.");
    }

    @Override
    public void holdParade() {
        System.out.println(name + " forces citizens to march with flags of the " + partyName + ".");
    }
}
