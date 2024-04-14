package Demo01;
class Student{
    int no;
    String name;
    int age;
    String address;
    public Student(int sno, String sname, int sage,String saddress){
        this.no = sno;
        this.name = sname;
        this.age = sage;
        this.address = saddress;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        return "no:"+no+",name:"+name+",age:"+age+",address:"+address;
    }
}

public class Test {public static void main(String[] args) {

Student A= new Student(110,"张三",18,"工商");
System.out.println(A);
    A.setNo(2023);
    System.out.println("学号:"+A.getNo());
    A.setName("啊锋");
    System.out.println("姓名:"+A.getName());
    A.setAge(18);
    System.out.println("年龄:"+A.getAge());
    A.setAddress("地址:"+"四川工商学院");
    System.out.println(A.getAddress());
}
}
