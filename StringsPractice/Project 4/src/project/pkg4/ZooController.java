

import java.util.ArrayList;

/**
 *
 * @authors Cristopher Herrera & Mattew Guerrero
 */
public class ZooController {
    public static ArrayList<ZooAnimals> fillZooAnimals(){
        ArrayList<ZooAnimals> animals = new ArrayList<>();
        String name;
        do{
            name = StandarReading.readString("Enter a name (X to exit): ");
            if(!name.equalsIgnoreCase("X")){
                animals.add(new ZooAnimals(name, StandarReading.readString("Enter color: "), StandarReading.readString("Enter gender: "), StandarReading.readString("Enter skill: ")));
                
            }
        }while(!name.equalsIgnoreCase("X"));
        return animals;
    }
    
    public static void printZooAnimals(ArrayList<ZooAnimals> zoo){
        for (ZooAnimals animal : zoo){
            System.out.println(animal);
        }
    }
}
