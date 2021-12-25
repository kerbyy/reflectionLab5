package lukin;

public class Main {
    /**
     * try to do foo method from Bean class
     */
    public static void main(String[] args) throws Exception {
        Bean bean = Injector.inject(new Bean());
        bean.foo();
    }
}
