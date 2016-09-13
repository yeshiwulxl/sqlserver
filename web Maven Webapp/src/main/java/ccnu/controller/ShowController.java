package ccnu.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowController {
	
	@ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "He0.aallo NowCoder";
    }
	
	@RequestMapping("/admin")
    public String admin() {  
        return "admin"; 
    }  
	
	@RequestMapping("/createTable")
    public String createTable() {  
        return "createTable"; 
    } 
	
	@RequestMapping("/modifyTable")
    public String modifyTable() {  
        return "modifyTable"; 
    } 
}
