package com.goodguygregory.tymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {


    // need a controller method to show initial HTML form

    @RequestMapping("/show_form")
    public String showForm() {
        // return our thymeleaf template
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    // this method allows for data to be passed via a parameter attribute
    @GetMapping("/process_form")
    public String processForm() {
        return "helloworld";
    }


    // this method allows data to be read from a form request
    // kind of corny but this will return an all capitalized version of the data being passed...
    @GetMapping("/shout_form")
    public String shoutForm(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theMessage = request.getParameter("message");
        String sender = request.getParameter("sender");

        // convert the data to all caps
        theMessage = theMessage.toUpperCase();

        // add model attributes
        model.addAttribute("message", theMessage);
        model.addAttribute("sender", sender);


        return "helloworld";

    }

//    with the request param it will automagically grab the name for us.
//     @GetMapping("/send_message")
//    public String sendMessage(@RequestParam("senderName") String sender, Model model) {
//
//
//        // convert the data to all caps
//        String theMessage = sender + " is sending you a message.";
//
//        // add model attributes
//        model.addAttribute("receiverName", receiverName);
//        model.addAttribute("message", theMessage);
//
//
//        return "messageParams";
//
//    }




}
