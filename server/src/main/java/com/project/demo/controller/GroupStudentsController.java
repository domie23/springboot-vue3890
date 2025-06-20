package com.project.demo.controller;

import com.project.demo.entity.GroupStudents;
import com.project.demo.service.GroupStudentsService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 小组学生：(GroupStudents)表控制层
 *
 */
@RestController
@RequestMapping("/group_students")
public class GroupStudentsController extends BaseController<GroupStudents, GroupStudentsService> {

    /**
     * 小组学生对象
     */
    @Autowired
    public GroupStudentsController(GroupStudentsService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
