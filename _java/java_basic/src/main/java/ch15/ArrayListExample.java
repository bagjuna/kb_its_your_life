package ch15;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
    static int a = 0;
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성
        List<Board> list = new ArrayList<>();
        //객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));
        Board board = new Board("제목6", "내용6", "글쓴이6");
        System.out.println(board.subject);

        //저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }

    static class Board {
        String subject;
        String content;
        String writer;

        public Board(String subject, String content, String writer) {
            this.subject = subject;
            this.content = content;
            this.writer = writer;

        }



        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }
    }

}

