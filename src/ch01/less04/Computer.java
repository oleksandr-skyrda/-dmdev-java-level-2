package ch01.less04;

public class Computer {

    int ssd = 500;
    int ram;

    public Computer() {
        System.out.println("Constructor is created");
    }

    public Computer(int ssd) {
        this.ssd = ssd;
    }

    public Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open){
        System.out.println("I am loaded");
        if (open){
            System.out.println("I opened cover");
        }
    }
    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
