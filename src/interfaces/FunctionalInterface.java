
@FunctionalInterface  // To define an interface with only one abstract method, Java 8 introduced the @FunctionalInterface annotation.
interface abc{
    void show();
}

interface def{
    int add(int i, int j);
}

public static void main(String[] args) {
    abc a1 = new abc() {
        @Override
        public void show() {
            System.out.println("in show method of anonymous class");
        }
    };

    a1.show();  // Output: in show method of anonymous class

    abc a2 = () -> System.out.println("in show method of lambda expression");  // Lambda expression can also be used as an implementation of an interface
     a2.show();  // Output: in show method of lambda expression

    def d1 = (i, j) ->  i+j;

    int result = d1.add(5, 10);  // Output: 15
    System.out.println("Addition result: " + result);  // Output: Addition result: 15

}
