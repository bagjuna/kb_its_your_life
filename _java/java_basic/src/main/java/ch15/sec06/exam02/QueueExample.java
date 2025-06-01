package ch15.sec06.exam02;

import java.util.LinkedList;

public class QueueExample {

    public static void main(String[] args) {
        LinkedList<Message> messagesQueue = new LinkedList<>();

        // 메시지 보내기
        Message msg1 = new Message("sendMail", "홍길동");
        Message msg2 = new Message("sendSMS", "신용권");
        Message msg3 = new Message("sendKakaotalk", "감자바");

        messagesQueue.add(msg1);
        messagesQueue.add(msg2);
        messagesQueue.add(msg3);
        // 메시지 처리하기
        while (!messagesQueue.isEmpty()) {
            Message message = messagesQueue.poll(); // 큐에서 메시지 꺼내기
            switch (message.command){
                case "sendMail"
                    -> System.out.println(message.to + "님에게 메일을 보냅니다.");
                case "sendSMS"
                    -> System.out.println(message.to + "님에게 문자메세지를 보냅니다.");
                case "sendKakaotalk"
                    -> System.out.println(message.to + "님에게 카카오톡 메세지를 보냅니다.");
                default
                    -> System.out.println(message.to + "님에게 알 수 없는 메세지를 보냅니다.");
            }


        }
    }
}
