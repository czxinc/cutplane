package com.edu.cn.mapper;

import com.edu.cn.beans.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */
@Repository
public interface StudentMapper {
    int insertStudent(Student student);

    int deleteStudent(String studentID);

    int updateStudent(Student student);

    List<Student> selectStudent();
}
