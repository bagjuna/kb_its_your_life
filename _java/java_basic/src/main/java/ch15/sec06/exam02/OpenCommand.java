package ch15.sec06.exam02;

public class OpenCommand implements Command {
    @Override
    public void execute() {
        System.out.println("===============");
        System.out.println("Open command");
        System.out.println("===============");
        System.out.println();
    }


}