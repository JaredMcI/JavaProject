public class Creature {

<<<<<<< HEAD
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
=======
    private float Health;
    private int Intelligence;
    private float Armour;
    private int Strength;
    private String Vulnerability;
    private  Weapon Weapon;

    //Mutators
    public void setHealth(float health) { Health = health; }
    public void setIntelligence(int intelligence) { Intelligence = intelligence; }
    public void setArmour(float armour) { Armour = armour; }
    public void setStrength(int strength) { Strength = strength; }
    public void setVulnerability(String vulnerability) { Vulnerability = vulnerability; }
    public void setWeapon(Weapon weapon) { Weapon = weapon; }

    //Accessor
    public float getHealth() { return Health; }
    public int getIntelligence() { return Intelligence; }
    public float getArmour() { return Armour; }
    public int getStrength() { return Strength; }
    public String getVulnerability() { return Vulnerability; }
    public Weapon getWeapon() { return Weapon; }

    //ToString
    public String toString() {
        return "Health: " +getHealth()+"Intelligence: "+getIntelligence()+ "Armour: "+getArmour()+ "Strength: "+
                    getStrength()+"Vulnerability: " +getVulnerability()+"Weapon: "+getWeapon();
    }

    public Creature(){
        setHealth(0);
        setIntelligence(0);
        setArmour(0);
        setStrength(0);
        setVulnerability("Unknown");
        setWeapon(Weapon);
    }
    public Creature(float Health,int Intelligence,float Armour,int Strength,String Vulnerability,Weapon Weapon){
        setHealth(Health);
        setIntelligence(Intelligence);
        setArmour(Armour);
        setStrength(Strength);
        setVulnerability(Vulnerability);
        setWeapon(Weapon);
>>>>>>> bc45f42b4a6e344966a79707254db7b00d543d5b
    }


}
