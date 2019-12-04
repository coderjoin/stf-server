package cn.fudan.stfserver.controller;

import cn.fudan.stfserver.utils.RethinkDBConnectionFactory;
import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Cursor;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qiaoying
 * @date 2019/11/22 15:20
 */
@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    private static final RethinkDB r = RethinkDB.r;

    @Autowired
    private RethinkDBConnectionFactory connectionFactory;


    @RequestMapping("/api/v1/devices")
    @ResponseBody
    public String home() {

        Map<String, String> map = new HashMap<>();

        List<Object> devices = r.db("atxserver2").table("devices").run(connectionFactory.createConnection());


        System.out.println(devices.size());

        String result = JSONObject.fromObject(map).toString();
        return "success";
    }

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        return modelAndView;
    }


}
