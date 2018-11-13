package ir.mftvanak.library.bistAban;

public class VariablesScope {

    //global
    final static int c = 30;
    public static void main(String[] args) {
        //local
//        int a = 10;


//        We cant change the value of a final variable
//        c=60;

//        CameraClass cameraClass = new CameraClass();

        MachineClass machineClass = new CameraClass();
//        ((CameraClass) machineClass).takePicture();
    }


    public static void printAge(){

        //just in time
        for (int a =30;a<100;a++){

        }

        //Getter and Setter
        GetterAndSetterExamples examples = new GetterAndSetterExamples();
        examples.getAge();
        examples.setAge(50);
    }
}
