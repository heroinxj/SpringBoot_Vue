package cn.edu.shu.xj.ser.entity;

/**
 * @author Heroin X
 * @date 2020/3/11 19:52
 */
public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
