package view;

import java.util.Scanner;

//import java.util.Scanner;

public class Output {

    public Scanner scanner;

    public Output(){
        setScanner(new Scanner(System.in));
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
