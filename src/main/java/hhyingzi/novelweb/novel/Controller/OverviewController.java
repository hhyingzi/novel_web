package hhyingzi.novelweb.novel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/overview")
public class OverviewController {
    @GetMapping
    public String showOverview(){
        return "overview";
    }
}
