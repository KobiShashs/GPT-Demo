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
public class ChatGPTRes {

    private String di;
    private String object;
    private long created;
    private String model;
    private List<Choice> choices = new ArrayList<>();
    private Usage usage;
}
