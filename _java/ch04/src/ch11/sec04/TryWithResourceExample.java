package ch11.sec04;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (MyResource res = new MyResource("A")){
            String data = res.read1();
            int value = Integer.parseInt(data);
        }catch (Exception e){
            System.out.println("예외 발생: " + e.getMessage());
        }
        System.out.println();
        try (MyResource res = new MyResource("A")) {
            String data = res.read2();
            int value = Integer.parseInt(data);
        }catch (Exception e){
            System.out.println("예외 발생: " + e.getMessage());
        }
        System.out.println();

        try (MyResource res1 = new MyResource("A");
             MyResource res2 = new MyResource("B")) {
                String data1 = res1.read1();
                String data2 = res2.read1();
        }catch (Exception e){
            System.out.println("예외 발생: " + e.getMessage());
        }


    }
}