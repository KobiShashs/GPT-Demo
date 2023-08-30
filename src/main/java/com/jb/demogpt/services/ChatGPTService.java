package com.jb.demogpt.services;

import com.jb.demogpt.models.ChatGPTRes;

/**
 * Created by kobis on 22 Jun, 2023
 */
public interface ChatGPTService {

    ChatGPTRes askChatGpt(String prompt);
}
