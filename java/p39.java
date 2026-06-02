class Test {

    public void show() {
        System.out.println("Reflection Method Called");
    }
}

class p39 {

    public static void main(String[] args) {

        try {

            Class<?> cls = Class.forName("Test");

            Object obj = cls.getDeclaredConstructor().newInstance();

            java.lang.reflect.Method method =
                    cls.getDeclaredMethod("show");

            method.invoke(obj);

            java.lang.reflect.Method[] methods =
                    cls.getDeclaredMethods();

            for (java.lang.reflect.Method m : methods) {

                System.out.println("Method Name: "
                        + m.getName());
            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}