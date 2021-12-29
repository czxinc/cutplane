package com.edu.cn.controller;

import com.edu.cn.beans.Student;
import com.edu.cn.service.StudentService;
import com.edu.cn.utils.LogFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */
@RestController
@RequestMapping("/student")
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private StudentService studentService;

    @LogFilter(description = "学生插入")
    @RequestMapping(value = "insertStudent", method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student) {
        log.info("请求参数=" + student.toString());
        int sign = studentService.insertStudent(student);
        log.info("返回参数=" + sign);
    }

    @LogFilter(description = "学生删除")
    @RequestMapping(value = "deleteStudent", method = RequestMethod.POST)
    public void deleteStudent(@RequestBody String studentID) {
        log.info("请求参数=" + studentID);
        int sign = studentService.deleteStudent(studentID);
        log.info("返回参数=" + sign);
    }

    @LogFilter(description = "学生更改")
    @RequestMapping(value = "updateStudent", method = RequestMethod.POST)
    public void updateStudent(@RequestBody Student student) {
        log.info("请求参数=" + student.toString());
        int sign = studentService.updateStudent(student);
        log.info("返回参数=" + sign);
    }

    @LogFilter(description = "学生插入")
    @RequestMapping(value = "selectStudent", method = RequestMethod.POST)
    public void selectStudent() {
        List<Student> studentList = studentService.selectStudent();
        log.info("返回参数=" + studentList);
    }


}
