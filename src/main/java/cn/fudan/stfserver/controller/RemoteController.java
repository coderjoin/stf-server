package cn.fudan.stfserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiaoying
 * @date 2019/11/22 16:33
 */
@Controller
public class RemoteController {

    @RequestMapping(value = "/remote/{id}")
    public String remote(@PathVariable String id) {


        return "remotecontrol_android";
    }
}
