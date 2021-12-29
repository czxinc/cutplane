package com.edu.cn.service.impl;

import com.edu.cn.beans.Student;
import com.edu.cn.mapper.StudentMapper;
import com.edu.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public int deleteStudent(String studentID) {
        return studentMapper.deleteStudent(studentID);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public List<Student> selectStudent() {
        return studentMapper.selectStudent();
    }
}
