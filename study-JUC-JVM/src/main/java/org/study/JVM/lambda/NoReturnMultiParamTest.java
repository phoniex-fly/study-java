package org.study.JVM.lambda;

public class NoReturnMultiParamTest implements Test{
    @Override
    public void old() {
        NoReturnMultiParam noReturnMultiParam = new NoReturnMultiParam() {
            @Override
            public void method(int a, int b) {
                System.out.println(a+b);
            }
        };
        noReturnMultiParam.method(2,3);
    }

    @Override
    public void lambda() {
        NoReturnMultiParam noReturnMultiParam = (int a,int b)->{
            System.out.println(a+b);
        };
        noReturnMultiParam.method(4,5);
    }

    /**
     * 1、简化参数类型，可以不写参数类型
     */
    @Override
    public void better() {
        NoReturnMultiParam noReturnMultiParam = (a,b)-> System.out.println(a+b);
        noReturnMultiParam.method(2,3);
    }
}
