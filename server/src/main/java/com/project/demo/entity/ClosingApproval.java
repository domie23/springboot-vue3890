package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 结项审批：(ClosingApproval)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ClosingApproval")
public class ClosingApproval implements Serializable {

    // ClosingApproval编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "closing_approval_id")
    private Integer closing_approval_id;

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
    // 结项附件
    @Basic
    private String closing_attachment;
    // 结项时间
    @Basic
    private Timestamp closing_time;



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
