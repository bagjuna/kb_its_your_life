package ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        Member m1 = person.getMember1(Member::new);
        person.getMember1(new Creatable1() {
            @Override
            public Member create(String id) {
                return new Member(id);
            }
        });
        System.out.println(m1);
        System.out.println();
        Member m2 = person.getMember2(Member::new);
        Member m2Lamda = person.getMember2((id, name) -> new Member(id, name));
        System.out.println(m2);
        System.out.println(m2Lamda);
    }
}