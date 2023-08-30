package com.jb.demogpt.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kobis on 22 Jun, 2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Choice {

    private int index;
    private Message message;
    @JsonProperty("finish_reason")
    private String finishReason;
}
