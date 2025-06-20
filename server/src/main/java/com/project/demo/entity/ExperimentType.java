package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 实验类型：(ExperimentType)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ExperimentType")
public class ExperimentType implements Serializable {

    // ExperimentType编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experiment_type_id")
    private Integer experiment_type_id;

    // 实验类型
    @Basic
    private String experiment_type;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
