abstract class Leader {
    String name;
    String country;
    int yearsInPower;

    public Leader (String name, String country, int yearsInPower) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    abstract void giveSpeech();

    public void printDetails() {
        System.out.println("----- Leader Profile -----");
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsInPower + " years");
        System.out.println("--------------------------");
    }
}
