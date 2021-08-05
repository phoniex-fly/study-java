package org.study.JVM.lambda;

public class ReturnMultiParamTest implements Test{
    @Override
    public void old() {
        ReturnMultiParam returnMultiParam = new ReturnMultiParam() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };
        returnMultiParam.method(2,3);
    }

    @Override
    public void lambda() {
        ReturnMultiParam returnMultiParam = new ReturnMultiParam() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };
        returnMultiParam.method(2,3);
    }

    @Override
    public void better() {
        ReturnMultiParam returnMultiParam = (a,b)->a+b;
        returnMultiParam.method(2,3);
    }
}
