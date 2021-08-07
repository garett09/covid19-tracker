package garett09.tech.covid19tracker.controllers;

import garett09.tech.covid19tracker.services.CoronaVirusDataServices;
import garett09.tech.covid19tracker.services.models.LocationStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataServices coronaVirusDataServices;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataServices.getAllStats();
        model.addAttribute("locationStats", allStats);
        return "home";

    }
}
