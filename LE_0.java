class JUET {
    static String name;
    static int age;
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        //int x = Integer.parseInt(args[0]);
        int x = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.print(x);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(x * i);
        }

        JUET obj = new JUET();
        obj.setName("Rahul");
        obj.setAge(20);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
