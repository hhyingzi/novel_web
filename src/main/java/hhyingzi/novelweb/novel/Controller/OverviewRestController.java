package hhyingzi.novelweb.novel.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hhyingzi.novelweb.novel.Entity.Overview;
import hhyingzi.novelweb.novel.Repository.OverviewRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OverviewRestController {
    private OverviewRestRepository overviewRestRepository;

    @Autowired
    public OverviewRestController(OverviewRestRepository overviewRestRepository){
        this.overviewRestRepository = overviewRestRepository;
    }

    @GetMapping(value = "/overviewrest", produces = "application/json;charset=UTF-8")
    public String getOverviewList(@RequestParam(value = "title", defaultValue="all") String title) throws JsonProcessingException {
        List<Overview> overviewList = new ArrayList<>();
        overviewRestRepository.findAll().forEach(i->overviewList.add(i));
        ObjectMapper objectMapper = new ObjectMapper();
        String prettyJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(overviewList);
        return prettyJsonString;
    }
}
