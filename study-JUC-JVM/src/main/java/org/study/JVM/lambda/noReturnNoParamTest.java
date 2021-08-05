package org.study.JVM.lambda;

public class noReturnNoParamTest implements Test{

    @Override
    public void old() {
        NoReturnNoParam noReturnNoParam = new NoReturnNoParam() {
            @Override
            public void method() {
                System.out.println("ok");
            }
        };
        noReturnNoParam.method();
    }

    @Override
    public void lambda() {
        NoReturnNoParam noReturnNoParam = ()->{
            System.out.println("ok");
        };
        noReturnNoParam.method();
    }

    /**
     * 当方法体只有一行时，可以不写大括号
     */
    @Override
    public void better() {
        NoReturnNoParam noReturnNoParam = ()-> System.out.println("ok");
        noReturnNoParam.method();
    }
}
