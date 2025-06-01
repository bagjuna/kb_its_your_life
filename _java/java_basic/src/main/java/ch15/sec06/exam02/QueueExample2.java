package ch15.sec06.exam02;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class QueueExample2 {

    public static void main(String[] args) {

        Map<String, Message> messagesQueue = new HashMap<>();
        // 메시지 보내기
        Message msg1 = new Message("sendMail", "홍길동");
        Message msg2 = new Message("sendSMS", "신용권");
        Message msg3 = new Message("sendKakaotalk", "감자바");

        messagesQueue.put(msg1.command, msg1);
        messagesQueue.put(msg2.command, msg2);
        messagesQueue.put(msg3.command, msg3);
        // 메시지 처리하기
        while (!messagesQueue.isEmpty()) {
            Message message = null;
            for (String s : messagesQueue.keySet()) {
                message = messagesQueue.remove(s);
            }
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
