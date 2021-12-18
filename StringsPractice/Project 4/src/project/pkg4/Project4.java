

import java.util.ArrayList;

/**
 *
 * @authors Cristopher Herrera & Mattew Guerrero
 */
public class Project4 {
    public static void main(String[] args) {
        ArrayList<ZooAnimals> animals;
        animals = ZooController.fillZooAnimals();
        ZooController.printZooAnimals(animals);
        
        String[] students = {"AMAGUAYA  RODRIGUEZ  ALEXA  MARISELA",
            "AMORES  GUEVARA  RONNY  ANDERSON",
            "ARIAS  SARANGO  DIEGO RAFAEL",
            "BONILLA  MOLINA  CRISTOPHER  ALEXANDER",
            "CAÑARTE  ZAMBRANO  JUAN  DIEGO",
            "CASTILLO  SANCHEZ  OSCAR DAVID",
            "ECHE  SALAZAR  JEIMMY  YULIANNA",
            "GUAMAN  CACUANGO  SERGIO  SEBASTIAN",
            "GUANOQUIZA  PANCHI  KEVIN  MARCELO",
            "HERNANDEZ  CHAMORRO  FRANCISCO  IGNACIO",
            "ICHAU  PABON  JENIFFER  LISSETTE",
            "LARGO  IÑIGUEZ  JONATHAN  FERNANDO",
            "MANTILLA  PARRA  KEVIN  ALEXANDER",
            "MARTINEZ  ROSERO  JORGE  MIGUEL",
            "MEJIA  MOLINA  JORGE  JOEL",
            "MEJIA  MOLINA  JORGE  JOEL",
            "MOLINA  ERRAEZ  ALLAN  ADRIAN",
            "ORTIZ  PINTADO  BYRON  MARCELO",
            "PADILLA  RODRIGUEZ  MARCELO  GABRIEL",
            "PEREZ  SIMBAÑA  ERICK  SEBASTIAN",
            "PLUA  VASCONEZ  ANTHONY  SEBASTIAN",
            "VARGAS  FERNANDEZ  ANTHONY  YEAIRE",
            "ZUÑIGA  NEGRETE  VERONICA  LUCIA"};
        String[][] studentslist;
        studentslist = StudentsList.getTokens(students);
        StudentsList.printlist(studentslist);
        ArrayList<Student> news;
        news = StudentsList.fillStudent();
        StudentsList.printListController(news);
    }
}
