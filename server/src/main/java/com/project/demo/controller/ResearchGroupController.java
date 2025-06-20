package com.project.demo.controller;

import com.project.demo.entity.ResearchGroup;
import com.project.demo.service.ResearchGroupService;
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
 * 课题小组：(ResearchGroup)表控制层
 *
 */
@RestController
@RequestMapping("/research_group")
public class ResearchGroupController extends BaseController<ResearchGroup, ResearchGroupService> {

    /**
     * 课题小组对象
     */
    @Autowired
    public ResearchGroupController(ResearchGroupService service) {
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
