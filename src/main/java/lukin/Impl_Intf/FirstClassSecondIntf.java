package lukin.Impl_Intf;

import lukin.interfaces.SecondIntf;

public class FirstClassSecondIntf implements SecondIntf {
    @Override
    public void SecondDo() {
        System.out.println("1.2");
    }
}
