package controller;

import java.util.Scanner;

public class MenuController {
    
    public Scanner scanner;


    public MenuController(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Eingaben überprüfen");
    
        String auswahl = getScanner().nextLine();

        System.out.println("Deine Wahl ist: " + auswahl);


        if(auswahl.equals("1")){

        }   
        else if(auswahl.equals("2")){

        }
        else if(auswahl.equals("3")){

        }
        else if(auswahl.equals("4")){

        }
        else{
            System.out.println("Falsche Eingabe");
        }
    
        
    }
    
    


    /**
     * 
     * 
     * 
     * NORMALE AUSGABE 
     */

    public void printData(String data){
        System.out.println(data);
         
    }


    /**
     * 
     * 
     * SETTER UND GETTER 
     */

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }


}
