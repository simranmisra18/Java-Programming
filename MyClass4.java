package JP;

class MyClass4 {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
