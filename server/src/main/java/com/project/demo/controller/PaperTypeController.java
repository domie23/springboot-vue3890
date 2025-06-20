package com.project.demo.controller;

import com.project.demo.entity.PaperType;
import com.project.demo.service.PaperTypeService;
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
 * 论文类型：(PaperType)表控制层
 *
 */
@RestController
@RequestMapping("/paper_type")
public class PaperTypeController extends BaseController<PaperType, PaperTypeService> {

    /**
     * 论文类型对象
     */
    @Autowired
    public PaperTypeController(PaperTypeService service) {
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
