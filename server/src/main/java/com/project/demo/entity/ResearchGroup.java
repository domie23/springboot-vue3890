package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课题小组：(ResearchGroup)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ResearchGroup")
public class ResearchGroup implements Serializable {

    // ResearchGroup编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "research_group_id")
    private Integer research_group_id;

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
    // 小组描述
    @Basic
    private String group_description;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
