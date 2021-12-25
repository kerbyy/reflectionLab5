package lukin;

import org.junit.jupiter.api.Test;

class InjectorTest {
    @Test
    public void testInject() {
        try {
            Bean bean = Injector.inject(new Bean());
            bean.field22.SecondDo();
        } catch (Exception ex) {}

    }
}