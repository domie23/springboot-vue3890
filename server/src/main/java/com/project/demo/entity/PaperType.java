package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 论文类型：(PaperType)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PaperType")
public class PaperType implements Serializable {

    // PaperType编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paper_type_id")
    private Integer paper_type_id;

    // 论文类型
    @Basic
    private String paper_type;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
