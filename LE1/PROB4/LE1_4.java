
class One {
    int x;
    One(int x) {
        this.x = x;
        System.out.println("One's constructor called. x = " + x);
    }
}
class Two extends One {
    Two(int x) {
        super(x); 
        System.out.println("Two's constructor called. x = " + x);
    }
}
class LE1_4{
    public static void main(String[] args) {
        Two obj = new Two(10); 
    }
}
