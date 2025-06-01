package commend;

public class FileService {

    String filename;

    void open(){
        filename = "test.txt";
        System.out.println(filename + "열었습니다.");

    }

    void print(){
        System.out.println(filename + "프린트 합니다.");
    }


}
