package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 教师用户：(TeacherUsers)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TeacherUsers")
public class TeacherUsers implements Serializable {

    // TeacherUsers编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_users_id")
    private Integer teacher_users_id;

    // 教师姓名
    @Basic
    private String teachers_name;
    // 教师性别
    @Basic
    private String gender_of_teachers;
    // 教师年龄
    @Basic
    private String age_of_teachers;
    // 学院名称
    @Basic
    private String college_name;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
