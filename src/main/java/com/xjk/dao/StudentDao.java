package com.xjk.dao;

import com.xjk.modal.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {

    public List<Student> findAll(){
        List<Student> all = new ArrayList<Student>();
        all.add(new Student("1", "tom", 18, true));
        all.add(new Student("2", "cat", 28, true));
        all.add(new Student("3", "lxk", 18, true));
        all.add(new Student("4", "cms", 18, true));
        return all;
    }
    
}
