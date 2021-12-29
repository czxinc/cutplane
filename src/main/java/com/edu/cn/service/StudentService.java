package com.edu.cn.service;

import com.edu.cn.beans.Student;

import java.util.List;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */
public interface StudentService {
    int insertStudent(Student student);

    int deleteStudent(String studentID);

    int updateStudent(Student student);

    List<Student> selectStudent();
}
