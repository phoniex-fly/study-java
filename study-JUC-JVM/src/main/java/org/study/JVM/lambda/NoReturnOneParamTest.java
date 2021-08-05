package org.study.JVM.lambda;

public class NoReturnOneParamTest implements Test {
    @Override
    public void old() {
        NoReturnOneParam noReturnOneParam = new NoReturnOneParam() {
            @Override
            public void method(int a) {
                System.out.println(a);
            }
        };
        noReturnOneParam.method(2);
    }

    @Override
    public void lambda() {
        NoReturnOneParam noReturnOneParam = (int a) -> {
            System.out.println(a);
        };
        noReturnOneParam.method(3);
    }

    /****
     * 当只有一个参数时，可以省略小括号
     */
    @Override
    public void better() {
        NoReturnOneParam noReturnOneParam = a-> System.out.println(a);
        noReturnOneParam.method(2);
    }
}
