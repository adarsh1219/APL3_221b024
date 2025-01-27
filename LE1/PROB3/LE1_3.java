
class Mother {
    void show() {
        System.out.println("Instance method in Mother: Hello World");
    }

    static void staticShow() { 
        System.out.println("Static method in Mother: Hello World");
    }
}

class Child extends Mother {
    @Override
    void show() { 
        System.out.println("Instance method in Child: Hello JUET");
    }

    static void staticShow() { 
        System.out.println("Static method in Child: Hello JUET");
    }
}

class LE1_3 {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 
        Mother m1 = new Child();
        m1.show(); 
        Mother.staticShow(); 
        Child.staticShow();  
        Mother m2 = new Child();
        m2.staticShow(); 
    }
}
