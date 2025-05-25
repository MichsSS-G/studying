public class getCallerClassAndMethodNameDemo {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
        m1();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        if (stackTraceElements.length < 3) {
            return null;
        }
        return stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
    }

    public static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    public static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    public static void m3() {
        System.out.println(getCallerClassAndMethodName());
    }
}
