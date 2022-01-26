package view;

import java.util.Scanner;

import controller.MenuController;

public class Output {

    public Scanner scanner;
    

    public Output(){

    }

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
