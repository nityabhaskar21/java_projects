class Test {
    public static void main(String[] args) {
    Test t = new  Test();
    t.stringTest();
    
    System.out.println(String.valueOf(System.currentTimeMillis()));
    }

    public void stringTest() {
        stringTest1();
        System.out.println("test");
    }

    public void stringTest1() {
        System.out.println("test1");
    }
}
