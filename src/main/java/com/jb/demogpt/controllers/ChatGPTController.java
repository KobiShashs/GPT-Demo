package com.jb.demogpt.controllers;

import com.jb.demogpt.models.ChatGPTRes;
import com.jb.demogpt.services.ChatGPTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kobis on 22 Jun, 2023
 */
@RestController
@RequestMapping("gpt")
public class ChatGPTController {


    @Autowired
    private ChatGPTService chatGPTService;

    // http://localhost:8080/gpt/ask?prompt=what+is+the+captial+city+of+the+uas
    @GetMapping("ask")
    public ChatGPTRes askGPT(@RequestParam("prompt") String prompt) {
        return chatGPTService.askChatGpt(prompt);
    }

    // http://localhost:8080/gpt/ask/short?prompt=what+is+the+captial+city+of+the+uas
    @GetMapping("ask/short")
    public String askGPTShot(@RequestParam("prompt") String prompt) {
        return chatGPTService.askChatGpt(prompt).getChoices().get(0).getMessage().getContent();
    }

}
