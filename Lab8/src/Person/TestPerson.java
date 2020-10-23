package Person;

public class TestPerson {
    public static void main(String[] args) {
        Person objPerson = new Person("Phan","Nam Dinh");
        objPerson.getName();
        objPerson.getAddress();
        objPerson.toString();

        Person std = new Student("Hai","ha Noi","java",2020,10000);
        std.toString();

        Staff stf=new Staff("Tuan","Nam Dinh","SQl",2020);
        stf.getPay();
    }
}
