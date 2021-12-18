

/**
 *
 * @authors Cristopher Herrera & Mattew Guerrero
 */
public class ZooAnimals {
    private String name;
    private String color;
    private String gender;
    private String skill;
    
    public ZooAnimals(){}
    
    public ZooAnimals(String name){
        this.name = name; 
    }
    
    public ZooAnimals(String name, String color, String gender, String skill){
        this.name = name; 
        this.color = color;
        this.gender = gender;
        this.skill = skill;
    }
    
    @Override
    public String toString() {
        return "\nName: " + this.name +
                "\nGender: " + this.gender +
                "\nColor: " + this.color + 
                "\nSkill: " + this.skill;

    }

    public String getColor() {
        return color;
    }
    public String getGender() {
        return gender;
    }
    public String getSkill() {
        return skill;
    }
}
