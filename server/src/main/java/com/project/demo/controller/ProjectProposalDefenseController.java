package com.project.demo.controller;

import com.project.demo.entity.ProjectProposalDefense;
import com.project.demo.service.ProjectProposalDefenseService;
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
 * 立项答辩：(ProjectProposalDefense)表控制层
 *
 */
@RestController
@RequestMapping("/project_proposal_defense")
public class ProjectProposalDefenseController extends BaseController<ProjectProposalDefense, ProjectProposalDefenseService> {

    /**
     * 立项答辩对象
     */
    @Autowired
    public ProjectProposalDefenseController(ProjectProposalDefenseService service) {
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
