package hhyingzi.novelweb;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRestController {
    private OverviewRepository overviewRepository;

    @Autowired
    public TestRestController(OverviewRepository overviewRepository){
        this.overviewRepository = overviewRepository;
    }

    @RequestMapping(value = "/testrest")
    public void test(HttpServletResponse response) throws IOException {
        response.sendRedirect("redirect:/overview");
    }
}
