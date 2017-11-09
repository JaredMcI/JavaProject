public class Creature {

    private double Health;
	private int Intelligence;
    private double Armour;
    private int Strength;
    private String Vulnerability;

    //Mutators
    public void setHealth(double health) { Health = health; }
    public void setIntelligence(int intelligence) { Intelligence = intelligence; }
    public void setArmour(double armour) { Armour = armour; }
    public void setStrength(int strength) { Strength = strength; }
    public void setVulnerability(String vulnerability) { Vulnerability = vulnerability; }

    // accessors
    public double getHealth() { return Health; }
    public int getIntelligence() { return Intelligence; }
    public double getArmour() { return Armour; }
    public int getStrength() { return Strength; }
    public String getVulnerability() { return Vulnerability; }

    public String toString() {
        return String.format("%-15s%\n\"%-15s%\\n\"%-15s%\\n\"%-15s%\\n\"%-15s%\\n","Health: " + getHealth() + "Armour: " + getArmour() + "Strength: " + getStrength() + "Intelligence: " + getIntelligence() +
                "Vulnerability: " + getVulnerability());
    }


}
