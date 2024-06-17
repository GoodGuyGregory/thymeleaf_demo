package com.goodguygregory.tymeleaf_demo.controller;

import com.goodguygregory.tymeleaf_demo.model.Record;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecordController {

    // add a model
    @GetMapping("/add_record")
    public String addRecordForm(Model model) {
        // create a record object
        Record newRecord = new Record();

        // add a record object ot the model
        model.addAttribute("newRecord", newRecord);

        return "addRecord";
    }

    // this post method will take all form values to be accessed from our model object

    @PostMapping("/record")
    public String createRecord(@ModelAttribute("newRecord") Record newRecord) {
        return "record-confirmation";
    }
}
