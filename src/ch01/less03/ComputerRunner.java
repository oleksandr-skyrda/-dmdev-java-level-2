package ch01.less03;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();

        Computer computer2 = new Computer(1024);
        computer2.printState();

        Computer computer3 = new Computer(1024, 2048);
        computer3.printState();
    }
}
