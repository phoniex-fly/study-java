package org.study.JVM.lambda;

public class ReturnNoParamTest implements Test{
    @Override
    public void old() {
        ReturnNoParam returnNoParam = new ReturnNoParam() {
            @Override
            public int method() {
                return 0;
            }
        };
        returnNoParam.method();
    }

    @Override
    public void lambda() {
        ReturnNoParam returnNoParam = ()->{
            return 100;
        };
        returnNoParam.method();
    }

    /**
     * 当方法体只有一行语句且是return语句，可以省略大括号和return
     */
    @Override
    public void better() {
        ReturnNoParam returnNoParam = ()->100;
        returnNoParam.method();
    }
}
