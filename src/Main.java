import arrays.ArrayObjects;
import interfaces.Calculator;
import interfaces.CalculatorImpl;
import interfaces.CalculatorWithReturn;
import staticclass.Mobile;
import string.StringBufferTest;
import arrays.Student;

import java.util.Arrays;

class Mobile1{
    static String phoneType;
    String mobile;
    String name;
}

public class Main {
    public static void main(String[] args) {

        //Interface
        Calculator calculator = new CalculatorImpl();
        calculator.show();

        Calculator newCalculator = new Calculator(){
            @Override
            public void show() {
                System.out.println("In overridden show method of Calculator interface");
            }
        };

        Calculator calculatorWithLabmda = () -> {System.out.println("Implemention from Lambda");};
        calculatorWithLabmda.show();
        newCalculator.show();

        CalculatorWithReturn calculatorWithReturn = new CalculatorWithReturn() {
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };

        CalculatorWithReturn calculatorWithReturn1 = (i,j) -> i+j;

        int addition = calculatorWithReturn.add(2,3);
        System.out.println("addition result: " + addition);
       

        // Static class and static variables
        Mobile1 mobile1 = new Mobile1();
        mobile1.mobile = "Test Mobile";
        mobile1.name = "Test Name";
        mobile1.phoneType = "Smart";

        System.out.println("Mobile Name: " + mobile1.name);
        System.out.println("Mobile Type: " + mobile1.phoneType);
        System.out.println("Phone: " + Mobile1.phoneType);

        // String Practice
        String str = "Hello, world!";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 6: " + str.charAt(6));
        System.out.println("Index of 'world': " + str);
        
        
        String str1 = "Hello, world!";
        String str2 = "world";

        // Array of Obejcts Practice
        ArrayObjects arrayObjects = new ArrayObjects();
        Student[] students = arrayObjects.createArrayOfStudents();

        arrayObjects.displayArrayOfStudents(students);

        arrayObjects.displayArrayOfStudentsWithEnhancedForLoop(students);


        //String Buffer
        StringBufferTest sft = new StringBufferTest();

        StringBuffer sb1 = sft.createString("Test String");
        sft.appendStringBuffer(sb1);

        // static classes and static variables

        Mobile mobile = new Mobile();

        mobile.setMobileNumber("7337224978");
        mobile.setName("Test Name");

        mobile.setBrand("samsung");
        Mobile.setPhone("Smart");

        Mobile mobile2 = new Mobile();

        mobile2.setBrand("Apple");
        mobile2.setMobileNumber("878977");
        Mobile.setPhone(" Samsung Smart");

        mobile.show();






//        if(str2.contains(str1)){
//            System.out.println("str2 contains str1");
//        }else {
//            System.out.println("not matching");
//        }
//
//
//        if (str1.contains(str2)) {
//            System.out.println("The string contains the substring.");
//        } else {
//            System.out.println("The string does not contain the substring.");
//        }
//
//
//        System.out.println("Hello world!");
//
//        verifyIncrement();
//        terinaryValidate();
    }

     static void verifyIncrement(){
        int num = 5;
        num++;
        //System.out.println(num++);

        int result = num++;
         System.out.println(result);
         System.out.println(num);
    }

    static void terinaryValidate(){
        System.out.println("terinary validation");
        int x=10;
        int y=15;

        int result = (x>y)?x:y;

        System.out.println(result);

        String name = "suman";

        name = (name != null )? name : "unknown";

        System.out.println(name);

        //nested
        //verifyswitch();
        Arrays();

    }

    static void verifyswitch(){
        int var = 1;
        String dayName ;
        switch (var) {
            case 1:
                dayName = "Sunday";
                System.out.println(dayName);
                break;
            case 2:
                dayName = "Monday";
                System.out.println(dayName);
                break;
            default:
                dayName ="Tuesday";
                System.out.println(dayName);
        }

        switch (var) {
            case 1 -> {dayName="MONDAY";
                       int number = 10;
                System.out.println("multiple statements in case");
                  }
            case 2 -> dayName="TUESDAY";
            default -> dayName="WEDNESDAY";}
        System.out.println(dayName);

        dayName = switch (var){
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            default -> "WEDNESDAY";
        };

        System.out.println(dayName);
    }

    static void Arrays(){
        int[] i = new int[2];
        int[] j = new int[2];

       j[0]= 20;
       j[1]=30;
        for (int k=0; k<2; k++){
            System.out.println(j[k]);
        }

        System.out.println("printing from array");
        for(int n: j){
            System.out.println(n);
        }

        //two dimensional array
        int num[][]= new int[2][2];
        num[0][0]= 20;
        num[0][1]=30;

        num[1][0]= 40;
        //num[1][1]=50;

        // hard coded array lengh
        for (int p=0;p<2;p++){
            for (int q=0; q<2; q++){
                System.out.print(num[p][q] + " ");
            }
            System.out.println();
        }

        // dymanic  array lengh
        for (int p=0;p< num.length;p++){
            for (int q=0; q<num[p].length; q++){
                System.out.print(num[p][q] + " ");
            }
            System.out.println();
        }
        System.out.println("printing using enhanced for loop");
        for(int a[]: num){
            for(int b: a){
                System.out.print(b + " ");
            }
            System.out.println(" ");
        }
    }
}