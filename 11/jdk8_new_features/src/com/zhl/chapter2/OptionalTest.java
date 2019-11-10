package com.zhl.chapter2;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        Student student = new Student("郑磊", 22);
        //构造optional类，若传入null，则抛出异常
        Optional<Student> optionalStudent = Optional.of(student);
        //此时可以传入null
        Student noneStudent = null;
        Optional<Student> optionalNone = Optional.ofNullable(noneStudent);

        //判断对象是否有值
        if (optionalStudent.isPresent()){
            Student s = optionalStudent.get();
            System.out.println(s.getName());
        }
        if (optionalNone.isPresent()){
            Student s = optionalStudent.get();
            System.out.println(s.getName());
        } else {
            System.out.println("对象值为空。");
        }

        //兜底函数
        Student defaultStudent = new Student("默认账户", 18);
        Student result1 = optionalStudent.orElse(defaultStudent);
        System.out.println(result1.getName());
        int result2 = optionalNone.map(obj -> obj.getAge()).orElse(18);
        System.out.println(result2);

    }
}
