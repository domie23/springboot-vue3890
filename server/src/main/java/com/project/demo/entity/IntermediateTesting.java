package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 中期检测：(IntermediateTesting)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "IntermediateTesting")
public class IntermediateTesting implements Serializable {

    // IntermediateTesting编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intermediate_testing_id")
    private Integer intermediate_testing_id;

    // 小组名称
    @Basic
    private String group_name;
    // 小组教师
    @Basic
    private Integer group_teacher;
    // 教师姓名
    @Basic
    private String teachers_name;
    // 学生用户
    @Basic
    private Integer student_users;
    // 学生姓名
    @Basic
    private String student_name;
    // 学院名称
    @Basic
    private String college_name;
    // 项目名称
    @Basic
    private String entry_name;
    // 项目级别
    @Basic
    private String project_level;
    // 所属学院
    @Basic
    private String affiliated_college;
    // 学科名称
    @Basic
    private String discipline_name;
    // 检测附件
    @Basic
    private String testing_attachments;
    // 检测时间
    @Basic
    private Timestamp detection_time;



    // 审核状态
    @Basic
    private String examine_state;











    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
