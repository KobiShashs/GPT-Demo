package com.jb.demogpt.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kobis on 22 Jun, 2023
 */
public class Usage {

    @JsonProperty("prompt_tokens")
    private int promptTokens;

    @JsonProperty("completion_tokens")
    private int completionTokens;

    @JsonProperty("total_tokens")
    private int totalTokens;
}
