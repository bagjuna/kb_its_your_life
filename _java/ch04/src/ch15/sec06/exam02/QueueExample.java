package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<Message>();
        //메시지 푸시
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKakaotalk", "감자바"));
        //큐에서 메시지 꺼내기
        while(!queue.isEmpty()) {
            Message message = queue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}