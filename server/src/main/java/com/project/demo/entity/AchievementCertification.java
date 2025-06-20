package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 成果认证：(AchievementCertification)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AchievementCertification")
public class AchievementCertification implements Serializable {

    // AchievementCertification编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_certification_id")
    private Integer achievement_certification_id;

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
    // 成果名称
    @Basic
    private String result_name;
    // 成果类型
    @Basic
    private String result_type;
    // 成果附件
    @Basic
    private String achievement_attachment;
    // 认证时间
    @Basic
    private Timestamp certification_time;
    // 成果内容
    @Basic
    private String content_of_achievements;



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
