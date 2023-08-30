package com.jb.demogpt.services;

import com.jb.demogpt.models.ChatGPTReq;
import com.jb.demogpt.models.ChatGPTRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kobis on 22 Jun, 2023
 */
@Service
public class ChatGPTServiceImpl implements ChatGPTService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.api.url}")
    private String apiURL;

    @Value("${openai.model}")
    private String model;

    @Override
    public ChatGPTRes askChatGpt(String prompt) {
        ChatGPTReq req = new ChatGPTReq(model, prompt);
        ChatGPTRes res = restTemplate.postForObject(apiURL, req, ChatGPTRes.class);
        return res;
    }
}
