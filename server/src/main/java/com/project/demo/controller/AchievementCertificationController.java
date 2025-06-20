package com.project.demo.controller;

import com.project.demo.entity.AchievementCertification;
import com.project.demo.service.AchievementCertificationService;
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
 * 成果认证：(AchievementCertification)表控制层
 *
 */
@RestController
@RequestMapping("/achievement_certification")
public class AchievementCertificationController extends BaseController<AchievementCertification, AchievementCertificationService> {

    /**
     * 成果认证对象
     */
    @Autowired
    public AchievementCertificationController(AchievementCertificationService service) {
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
