package cn.law.springmvc.demo.pojo;

public class Student extends User{
    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                '}';
    }
}
