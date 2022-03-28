package hhyingzi.novelweb.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hhyingzi.novelweb.novel.Entity.Overview;
import hhyingzi.novelweb.novel.Repository.OverviewRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRestController {
    private OverviewRestRepository overviewRestRepository;

    @Autowired
    public TestRestController(OverviewRestRepository overviewRestRepository){
        this.overviewRestRepository = overviewRestRepository;
    }

    @RequestMapping(value = "/testrest", produces = "application/json;charset=UTF-8")
    public String test(@RequestParam(value = "title", defaultValue="all") String title) throws JsonProcessingException {
        List<Overview> overviewList = new ArrayList<>();
        overviewRestRepository.findAll().forEach(i->overviewList.add(i));


        ObjectMapper objectMapper = new ObjectMapper();
        String prettyJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(overviewList);
        return "test rest\n" + prettyJsonString;
    }

    @RequestMapping(value = "/testredirect")
    public void testRedirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/overviewrest");
    }
}
