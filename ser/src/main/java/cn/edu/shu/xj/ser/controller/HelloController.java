package cn.edu.shu.xj.ser.controller;


import cn.edu.shu.xj.ser.entity.Student;
import cn.edu.shu.xj.ser.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Heroin X
 * @date 2020/3/11 19:51
 */
@Api(tags = "测试接口")
@RestController
public class HelloController {

    @Autowired
    StudentService studentService;

    @ApiOperation(value = "查询学生")
    @GetMapping("/query")
    public Student queryStudent(Integer sid){
        Student oneStudent = studentService.findOneStudent(sid);
        return oneStudent;

    }

}
