

/**
 *
 * @authors Cristopher Herrera & Mattew Guerrero
 */
public class Student {
    private String names;
    private String lastnames;
    
    public Student(){}
    
    public Student(String names){
        this.names = names; 
    }
    
    public Student(String lastnames, String names){
        this.lastnames = lastnames;
        this.names = names; 
    }
    
    @Override
    public String toString() {
        return "\n" + this.lastnames + "\t" + this.names;
    }
    
    public String getNames() {
        return names;
    }

    public String getLastnames() {
        return lastnames;
    }
}
