

import java.util.StringTokenizer;
import java.util.ArrayList;

public class StudentsList {

    public static String[][] getTokens(String[] str) {
        String[][] lista = new String[str.length][2];

        for (int i = 0; i < str.length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(str[i], " ");
            int j = 0;

            while (tokenizer.hasMoreElements()) {

                if (j == 0) {
                    lista[i][0] = " " + tokenizer.nextToken();
                } else if (j == 1) {
                    lista[i][0] = lista[i][0] + " " + tokenizer.nextToken();

                } else if (j == 2) {
                    lista[i][1] = " " + tokenizer.nextToken();

                } else {

                    lista[i][1] = lista[i][1] + " " + tokenizer.nextToken();
                }

                j++;
            }
        }

        return lista;
    }

    public static void printlist(String[][] studentlist) {

        System.out.println("Apellido \t\t Nombre");

        for (String[] studentlist1 : studentlist) {
            System.out.println(studentlist1[0] + "\t" + studentlist1[1]+ "\t");
        }
    }
    
    public static boolean isCorrectInput(String words){
        String greeting = "[A-Z]*[\\s]*[A-Z]*";
        boolean result;
        result = words.matches(greeting);
        return result;
    }
    
    public static ArrayList<Student> fillStudent(){
        ArrayList<Student> news = new ArrayList<>();
        System.out.println("Register new students (Write with UPPERCASE)");
        String Lastnames;
        do{
            Lastnames = StandarReading.readString("Enter the lastnames (X to exit): ");
            if(!Lastnames.equalsIgnoreCase("X")){
                if (isCorrectInput(Lastnames)){
                    news.add(new Student(Lastnames, StandarReading.readString("Enter the names: ")));
                }
            }
        }while(!Lastnames.equalsIgnoreCase("X"));
        return news;
    }
    
    public static void printListController(ArrayList<Student> list){
        for (Student news : list){
            System.out.println("New students register");
            System.out.println(news);
        }
    }
}
