package com.goodguygregory.tymeleaf_demo.controller;

import com.goodguygregory.tymeleaf_demo.model.Record;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RecordController {

//    inject the genres values from the applications properties file
    @Value("${genres}")
    private List<String> genres;


    // add a model
    @GetMapping("/add_record")
    public String addRecordForm(Model model) {
        // create a record object
        Record newRecord = new Record();

        // add a record object ot the model
        model.addAttribute("newRecord", newRecord);

        // add data to the model so that the form can use it.
        model.addAttribute("genres", genres);

        return "addRecord";
    }

    // this post method will take all form values to be accessed from our model object

    @PostMapping("/record")
    public String createRecord(@ModelAttribute("newRecord") Record newRecord) {
        return "record-confirmation";
    }
}
