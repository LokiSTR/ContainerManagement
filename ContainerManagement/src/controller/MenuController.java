package controller;

import java.util.Scanner;

public class MenuController {

    MainController mc;
    public Scanner scanner;

    public MenuController(MainController mc) {
        setMc(mc);
    }

    public void startMenu(){
        //Auswahlmöglichkeiten
        sendOutput("(1) Neues Gut");
        sendOutput("(2) Neue Verschiffung");
        sendOutput("(3) Etwas ausgeben");
    
        String auswahl = "1"; //getMc().getOutput()

        sendOutput("Ihre Auswahl ist: " + auswahl);


        if(auswahl.equals("1")){
            createGutMenu();
        }   
        else if(auswahl.equals("2")){
            sendOutput("Noch nicht implementiert!");
        }
        else if(auswahl.equals("3")){
            sendOutput("Noch nicht implementiert!");
        }
        else{
            sendOutput("Falsche Eingabe");
        }
    }

    public void createGutMenu() {
        sendOutput("Sie wollen ein neues Gut erstellen, bitte Wählen sie den Typ");
        sendOutput("(1) Frischware");
        sendOutput("(2) Gefahrengut");
        sendOutput("(3) Normalgut");
        sendOutput("(4) Tiere");
        sendOutput("(5) Wertgegenstände");

       String auswahl = "1"; //getMc().getOutput()

       sendOutput("Ihre Auswahl ist: " + auswahl);


       if(auswahl.equals("1")){
           createFrischware();
       }   
       else if(auswahl.equals("2")){
           createGefahrengut();
       }
       else if(auswahl.equals("3")){
           createNormalgut();
       }
       else if(auswahl.equals("4")){
           createTiere();
       }
       else if(auswahl.equals("5")){
            createWertgegenstaende();
       }
       else{
           sendOutput("Falsche Eingabe");
       }
    }

    public void showMenu() {
        String auswahl = "1"; //getMc().getOutput()

        sendOutput("Ihre Auswahl ist: " + auswahl);


        if(auswahl.equals("1")){
            createGutMenu();
        }   
        else if(auswahl.equals("2")){
            sendOutput("Noch nicht implementiert!");
        }
        else if(auswahl.equals("3")){
            sendOutput("Noch nicht implementiert!");
        }
        else{
            sendOutput("Falsche Eingabe");
        }
    }

    /**
     * 
     * 
     * Create Methoden:
     * 
     * 
     */

     public void createFrischware() {

        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "Tomaten";
        sendOutput("Haltbarkeit (dd.MM.yyyy): ");
        String haltbarkeit = "22.03.2022";
         getMc().getGc().addNewFrischware(gewicht, inhalt, haltbarkeit);
     }

     public void createGefahrengut() {
         
        sendOutput("Benötigtes Sichterheitslevel: ");
        String sicherheitslevel = "25";
        sendOutput("Inhalt: ");
        String inhalt = "Tomaten";
        getMc().getGc().addNewGefahrengut(sicherheitslevel, inhalt);
     }

     public void createNormalgut() {
         
        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "Tomaten";
        getMc().getGc().addNewNormalgut(gewicht, inhalt);
     }

     public void createTiere() {
         
        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "5";
        sendOutput("Tierart: ");
        String tierart = "Hund";
        getMc().getGc().addNewTiere(gewicht, inhalt, tierart);
     }

     public void createWertgegenstaende() {
         
        sendOutput("Benötigtes Sichterheitslevel: ");
        String sicherheitslevel = "25";
        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "5";
        sendOutput("Wert: ");
        String wert = "2000";
        getMc().getGc().addNewWertgegenstaende(sicherheitslevel, gewicht, inhalt, wert);
     }

     

    public void sendOutput(String data) {
        getMc().getOutput().printData(data);
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
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }


}
