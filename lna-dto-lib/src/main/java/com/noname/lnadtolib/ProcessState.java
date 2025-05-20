package com.noname.lnadtolib;

import com.noname.lnadtolib.enumerated.Agent;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.UUID;

@Data
@Builder
@Jacksonized
public class ProcessState {
    private UUID sessionUUID;
    private String message;
    private Agent agent;
}