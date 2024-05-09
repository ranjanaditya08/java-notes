package basics;

public class ClassLoaderExample {

    public static void main(String[] args) {

        //Bootstrap(java standard edition) -> Extension($JAVA_HOME) -> Application(classpath)

        Class c = ClassLoaderExample.class;

        System.out.println(c.getClassLoader()); //Application lassLoader

        //String is an in-build class so it's loaded by Bootstrap ClassLoader
        System.out.println(String.class.getClassLoader());

        /*
        * ClassLoader ->
        * 1.Bootstrap = loads rt.jar files of java standard edition
        * (java.lang.package, java.utils.package, java.io.package etc) classes.
        *
        * 2.Extension = loads jar files located inside $JAVA_HOME/jre/lib/..
        *
        * 3.Application = loads claasfiles from classpath.
        * */
    }
}
