package commend;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        Command[] commands = {
//                new AddCommand(),
                () -> System.out.println("Add Command"),
//                new OpenCommand(),
//                new PrintCommand(),
                fileService::open,
                fileService::print,
//                new ExitCommand()
                Main::exit
        };

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.print("선택: ");
            int sel = scanner.nextInt();
            commands[sel - 1].execute();
        }
    }

    public static void exit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("종료할까요?(Y/n) ");
        String answer = scanner.nextLine();

        scanner.close();
        if (answer.isEmpty() || answer.equalsIgnoreCase("Y")) {
            System.exit(0);
        }

    }
}