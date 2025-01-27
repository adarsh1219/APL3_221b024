
class Mother {
    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}

class LE1_2 {
    public static void main(String args[]) {

        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 

        Mother poly = new Child();
        poly.show(); 
    }
}
