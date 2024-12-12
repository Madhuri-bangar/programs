package variables;

class methodscope {
    // Variables created as static in class 
    static int a = 10; // static variable creates single memory scope

    void fun() {
        int b = 10; // local variable destroy itself // method scope
        System.out.println(a + " " + b);
        ++a;
        ++b;
    }

    public static void main(String[] args) {
        methodscope r = new methodscope();
        r.fun();
        r.fun();
    }
}
