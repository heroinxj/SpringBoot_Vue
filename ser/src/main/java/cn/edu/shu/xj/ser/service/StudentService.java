package cn.edu.shu.xj.ser.service;


import cn.edu.shu.xj.ser.entity.Student;
import cn.edu.shu.xj.ser.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Heroin X
 * @date 2020/3/12 0:28
 */
@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student findOneStudent(Integer sid){
        return studentMapper.findOneStudent(sid);
    }

}
