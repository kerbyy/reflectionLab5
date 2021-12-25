package lukin;

import lukin.interfaces.FirstIntf;
import lukin.interfaces.SecondIntf;

public class Bean {

    @AutoInjectable
    private FirstIntf field1;

    @AutoInjectable
    private SecondIntf field2;

    public SecondIntf field22;

    public void foo() {
        field1.FirstDo();
        field2.SecondDo();
    }
}
