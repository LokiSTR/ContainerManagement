package controller;

//import MainSceneController;
import view.Output;

public class MainController {
    
    Output output;
    GueterController gc;
//    MainSceneController msc;
    PersonenController pc;
    VerschiffenController vc;

    public MainController() {
        setGc(new GueterController(this));
//        setMsc(new MainSceneController(this));
        setPc(new PersonenController(this));
        setVc(new VerschiffenController(this));
        setOutput(new Output());

        gc.createDemodata();
        gc.printAllObjects();
    }

    /**
     * 
     * SETTER UND GETTER
     */

     public void setOutput(Output output) {
         this.output = output;
     }
     public Output getOutput() {
         return output;
     }
     public void setGc(GueterController gc) {
         this.gc = gc;
     }
     public GueterController getGc() {
         return gc;
     }
//     public void setMsc(MainSceneController msc) {
 //        this.msc = msc;
  //   }
    // public MainSceneController getMsc() {
    //     return msc;
    // }
     public void setPc(PersonenController pc) {
         this.pc = pc;
     }
     public PersonenController getPc() {
         return pc;
     }
     public void setVc(VerschiffenController vc) {
         this.vc = vc;
     }
     public VerschiffenController getVc() {
         return vc;
     }
}
