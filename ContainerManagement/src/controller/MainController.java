package controller;

//import MainSceneController;
import view.Output;

public class MainController {
    
    Output output;
    GueterController gc;
//    MainSceneController msc;
    PersonenController pc;
    VerschiffenController vc;
    RouteController rc;
    SchiffController sc;


    public MainController() {
        setGc(new GueterController(this));
//        setMsc(new MainSceneController(this));
        setPc(new PersonenController(this));
        setVc(new VerschiffenController(this));
        setSc(new SchiffController(this));
        setRc(new RouteController(this));
        setOutput(new Output());

        createAllDemodata();

        getPc().printAllObjects();
        getRc().printAllObjects();
        getSc().printAllObjects();
    }

    public void createAllDemodata() {
        getGc().createDemodata();
        getPc().createDemodata();
        getRc().createDemodata();
        getSc().createDemodata();
        //getVc().createDemodata();
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
     public void setRc(RouteController rc) {
         this.rc = rc;
     }
     public RouteController getRc() {
         return rc;
     }
     public void setSc(SchiffController sc) {
         this.sc = sc;
     }
     public SchiffController getSc() {
         return sc;
     }
}
