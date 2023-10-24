public class methods {
    public static void main(String[] args) {
        methods m = new methods();
        m.sayHello();
        m.add(1, 2);
        int k = (m.multply(4, 4));
        System.out.print(k);
    }

    void sayHello() {
        System.out.println("Hi");
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    int multply(int a, int b) {
        int x = a * b;
        return x;
    }
}