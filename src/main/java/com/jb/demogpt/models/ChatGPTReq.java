package com.jb.demogpt.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobis on 22 Jun, 2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatGPTReq {

    private String model;
    private List<Message> messages = new ArrayList<>();
    private double temperature;

    public ChatGPTReq(String model, String prompt) {
        this.model = model;
        this.messages.add(Message.builder().role("user").content(prompt).build());
    }
}
