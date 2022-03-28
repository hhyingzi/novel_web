package hhyingzi.novelweb.test;

import hhyingzi.novelweb.novel.Repository.OverviewRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    private OverviewRestRepository overviewRestRepository;

    @Autowired
    public TestController(OverviewRestRepository overviewRestRepository){
        this.overviewRestRepository = overviewRestRepository;
    }

    @GetMapping("/test")
    public String test(){
        return "redirect:/overview";
    }

    @GetMapping("/testredirect")
    public String testRedirect(){
        return "redirect:/overview";
    }
}
