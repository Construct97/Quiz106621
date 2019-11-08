package quiz;

import java.util.Scanner;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.io.File;
import java.util.List;


public class Data {
    List<Model> list;
    Data(){
    			list = new ArrayList<Model>();
    				CreateData();
    }

    public void CreateData() {
        		File file =
                new File("C:\\Users\\Admin\\eclipse-workspace\\quiz\\pytania");
        Scanner cv;

        {
            try {
                cv = new Scanner(file);
            } 	catch (FileNotFoundException e ) {
                		System.out.println("Cos jest nie tak ze sciezka do pliku " + e.getLocalizedMessage());
                System.out.println("Koniec !!!jestes okrutny");
                return;
            }
        }
         int count = 0;
         			while (cv.hasNextLine()) {
            count++;
            String linia = cv.nextLine();
            		String[] lineArray = linia.split("\\|");
            if(lineArray.length != 6){
            			System.out.println("Nie uzupe³ni³eœ wszystkich opcji w linii " + count);
                System.out.println("zepsules cos w pliku tekstowym wroc do mnie jak poprawisz!");
                return;
            }
                Model question = new Model(lineArray[0],lineArray[1],lineArray[2],lineArray[3],lineArray[4],lineArray[5].charAt(0),count);
                list.add(question);
        }

    }
}