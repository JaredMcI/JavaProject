public class Weapon {

    private double Cut_Damage;
    private double Bludegeon_Damage;
    private double Piercing_Damage;
    private double weight;

    //Mutators
    public void setCut_Damage(double cut_Damage) { Cut_Damage = cut_Damage; }
    public void setBludegeon_Damage(double bludegeon_Damage) { Bludegeon_Damage = bludegeon_Damage; }
    public void setPiercing_Damage(double piercing_Damage) { Piercing_Damage = piercing_Damage; }
    public void setWeight(double weight) { this.weight = weight; }

    //Accessors
    public double getCut_Damage() { return Cut_Damage; }
    public double getBludegeon_Damage() { return Bludegeon_Damage; }
    public double getPiercing_Damage() { return Piercing_Damage; }
    public double getWeight() { return weight; }

    public String toString() {
        return String.format("%-20s\n%-5\n%-20s\n%-5\n%-20s\n%-5\n%-20s\n%-5\n%",
                "Cut Damage: " + getCut_Damage() + "Bludegeon Damage: " +
                getBludegeon_Damage() + "Piercing Damage: " + getPiercing_Damage() +
                "Weight: " + getWeight());
    }
}
