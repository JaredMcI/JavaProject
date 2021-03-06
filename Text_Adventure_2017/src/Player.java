public class Player extends Creature {

    private int Charisma;
    private int Dexterity;
    private float height;



    public void setCharisma(int charisma) { Charisma = charisma; }
    public void setHeight(float height) { this.height = height; }
    public void setDexterity(int dexterity) { Dexterity = dexterity; }

    public int getCharisma(){ return Charisma; }
    public int getDexterity(){return Dexterity;}
    public float getHeight(){ return height;}

//    public Player(int charisma, int dexterity, float height) {
//        Charisma = charisma;
//        Dexterity = dexterity;
//        this.height = height;
//    }

    public Player(float Health, int Intelligence, float Armour, int Strength, String Vulnerability, Weapon Weapon, int charisma, int dexterity, float height) {
        super(Health, Intelligence, Armour, Strength, Vulnerability, Weapon);
        Charisma = charisma;
        Dexterity = dexterity;
        this.height = height;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Charisma=" + Charisma +
                ", Dexterity=" + Dexterity +
                ", height=" + height;
    }

    //
//    Player(float Health,int Intelligence,float Armour,int Strength,String Vulnerability,Weapon Weapon,int Charisma,
//           int Dexterity, float height){
//        setHealth(Health);
//        setIntelligence(Intelligence);
//        setArmour(Armour);
//        setStrength(Strength);
//        setVulnerability(Vulnerability);
//        setWeapon(Weapon);
//        setCharisma(Charisma);
//        setHeight(height);
//        setDexterity(Dexterity);
//    }



}
