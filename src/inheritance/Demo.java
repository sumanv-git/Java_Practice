package inheritance;

import java.util.logging.Logger;

class A {

    Logger logger = Logger.getLogger(A.class.getName());

    public A(){
        logger.info("in Constructor of A");
    }

    public A(int a){
        logger.info("in Constructor of A with parameter: " + a);
    }

    public void show() {
        logger.info("in show method of A");
    }
}

class B extends A {
   Logger logger = Logger.getLogger(B.class.getName());
    public B(){
        logger.info("in Constructor of B");
    }

    public B(int b){
        //super(b); // calling constructor of A with parameter b
        this();
        logger.info("in Constructor of B with parameter: " + b);
    }
}

public class Demo {
    public static void main(String[] args) {
        //B obj = new B();
        B obj1 = new B(10);
        //B obj2 = new B();
        //obj.show();
    }
}
