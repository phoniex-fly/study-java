package org.study.JVM.lambda;

public class LambdaInterface {
}

/**
 * 无返回无参数
 */
@FunctionalInterface
interface NoReturnNoParam{
    void method();
}

/**
 * 无返回有一个参数
 */
@FunctionalInterface
interface NoReturnOneParam{
    void method(int a);
}

/**
 * 无返回有多个参数
 */
@FunctionalInterface
interface NoReturnMultiParam{
    void method(int a,int b);
}

/**
 * 有返回无参数
 */
@FunctionalInterface
interface ReturnNoParam{
    int method();
}

/**
 * 有返回有一个参数
 */
@FunctionalInterface
interface ReturnOneParam{
    int method(int a);
}

/**
 * 有返回有多个参数
 */
@FunctionalInterface
interface ReturnMultiParam{
    int method(int a,int b);
}
