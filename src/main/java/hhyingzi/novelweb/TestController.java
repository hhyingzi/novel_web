package hhyingzi.novelweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TestController {
    private OverviewRepository overviewRepository;

    @Autowired
    public TestController(OverviewRepository overviewRepository){
        this.overviewRepository = overviewRepository;
    }

    @GetMapping("/testapp")
    public String test(){
        return "redirect:/overview";
    }
}
