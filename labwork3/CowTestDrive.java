public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.setAge(4);
        cow.moo();
    }

}

class Cow {
    private String name;
    private boolean breed;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void moo() {
        System.out.println("Moo...!");
    }

}