package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 实验数据：(ExperimentalData)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ExperimentalData")
public class ExperimentalData implements Serializable {

    // ExperimentalData编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experimental_data_id")
    private Integer experimental_data_id;

    // 实验名称
    @Basic
    private String experiment_name;
    // 实验类型
    @Basic
    private String experiment_type;
    // 实验时间
    @Basic
    private Timestamp experimental_time;
    // 实验附件
    @Basic
    private String experimental_attachments;
    // 学生用户
    @Basic
    private Integer student_users;
    // 学院名称
    @Basic
    private String college_name;
    // 实验描述
    @Basic
    private String experimental_description;
    // 实验内容
    @Basic
    private String experimental_content;
    // 教师评语
    @Basic
    private String teachers_comments;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
