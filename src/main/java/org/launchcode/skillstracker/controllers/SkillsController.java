package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skillTracker() {
        return "<html>" +
                "<body>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String selectSkills() {
        String html;
        return "<html>" +
                "<body>" +
                "<form action='form-submit' method='post'>" +
                "<label for='name'>Name: </label><br>" +
                "<input type='text' id='name' name='name'><br>" +
                "<label for='fL1'>My favorite language: </label><br>" +
                "<select id='fL1' name='select1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='fL2'>My second favorite language: </label><br>" +
                "<select id='fL2' name='select2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>"+
                "<label for='fL3'>My third favorite language: </label><br>" +
                "<select id='fL3' name='select3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>"+
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="form-submit", method = {RequestMethod.GET,RequestMethod.POST})
    public String formSubmit(@RequestParam String name, @RequestParam String select1, @RequestParam String select2, @RequestParam String select3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name+
                "</h1>" +
                "<ol>" +
                "<li>"+select1+"</li>"+ "<li>"+select2+"</li>"+"<li>"+select3+"</li>"+
                "</ol>" +
                "</body>" +
                "</html>";

    }

}
