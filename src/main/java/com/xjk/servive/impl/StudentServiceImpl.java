package com.xjk.servive.impl;

import com.xjk.dao.StudentDao;
import com.xjk.modal.Student;
import com.xjk.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudent() {
        return studentDao.findAll();
    }
}
