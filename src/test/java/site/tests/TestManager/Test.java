package site.tests.TestManager;

import site.tests.CreateFileTests;

import java.lang.reflect.Method;

/**
 * Created by Lena on 25.02.2020.
 */
public class Test {

    public static void main(String[] args) {
        Class<TestBase> clazz=TestBase.class;
        Class<CreateFileTests> clazz1=CreateFileTests.class;
        TestBase testBase=new TestBase();
        CreateFileTests createFileTests=new CreateFileTests();
        try {
            Method method=clazz.getDeclaredMethod(args[0]);
            Method method1=clazz1.getDeclaredMethod(args[1],DataProviders.class);
            method.setAccessible(true);
            method.invoke(testBase);
           method1.setAccessible(true);
            method1.invoke(createFileTests,args[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
