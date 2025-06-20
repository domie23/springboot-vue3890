package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 论文检验：(PaperVerification)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PaperVerification")
public class PaperVerification implements Serializable {

    // PaperVerification编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paper_verification_id")
    private Integer paper_verification_id;

    // 小组名称
    @Basic
    private String group_name;
    // 小组类型
    @Basic
    private String group_type;
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
    // 论文名称
    @Basic
    private String paper_title;
    // 论文类型
    @Basic
    private String paper_type;
    // 检验附件
    @Basic
    private String inspection_attachments;
    // 检验时间
    @Basic
    private Timestamp inspection_time;
    // 检验备注
    @Basic
    private String inspection_remarks;



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
