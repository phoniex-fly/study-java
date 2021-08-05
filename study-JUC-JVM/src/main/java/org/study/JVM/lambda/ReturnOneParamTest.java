package org.study.JVM.lambda;

public class ReturnOneParamTest implements Test {
    @Override
    public void old() {
        ReturnOneParam returnOneParam = new ReturnOneParam() {
            @Override
            public int method(int a) {
                return a;
            }
        };
        returnOneParam.method(2);
    }

    @Override
    public void lambda() {
        ReturnOneParam returnOneParam = (int a) -> {
            return a;
        };
        returnOneParam.method(3);
    }

    @Override
    public void better() {
        ReturnOneParam returnOneParam = a -> a;
        returnOneParam.method(2);
    }
}
