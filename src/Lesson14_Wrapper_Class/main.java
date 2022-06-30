package Lesson14_Wrapper_Class;

public class main {
    public static void main(String[] args) {
       
        //wrapper class = provides a way to use primitive data types as reference data types
        //                reference data types contain useful methods 
        //                can be used with collections (ex.ArrayList)

        //primitive data examples below     //wrapper 
        //---------                         //--------
        //boolean                           Boolean 
        //char                              Character 
        //int                               Integer 
        //double                            Double 

        // autoboxing = the automatic conversion that the java compiler makes between the primtitive type and their corresponding object wrapper classes  
        // unboxing = the reverse of autoboxing. Automatic converstion of wrapper class to primitive 

        Boolean a = true; 
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bryan";

        if(a==true){
            System.out.println("This is true");
        }

        //primitive data type are a lot faster 

    }
}
