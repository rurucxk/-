package com.example.yuangong;

import com.example.yuangong.mapper.EmpMapper;
import com.example.yuangong.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class YuangongApplicationTests {

    @Autowired
    public EmpMapper empMapper;


    @Test
    void contextLoads() {
        System.out.println(empMapper.delete(15));
//        empMapper.inster();
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("lihua");
        emp.setName("李");
        emp.setGender((short) 1);
        emp.setImage("1.jpg");
        emp.setEntrydate(LocalDate.of(2001,9,22));
//        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);
//        empMapper.update(emp);
//        empMapper.inster(emp);
//        System.out.println(emp.getId());
        List<Emp> emps = empMapper.list(null, "李");
        System.out.println(emps);

    }

    @Test
    public void TestUpdate(){
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("xiaoli");
        emp.setName("小李");
        emp.setGender((short) 1);
        emp.setEntrydate(LocalDate.of(2001,9,22));
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update2(emp);

    }

    @Test
    public void TestDelete(){
        List<Integer> list = Arrays.asList(15,18,20);
        empMapper.delete2(list);
    }
}
