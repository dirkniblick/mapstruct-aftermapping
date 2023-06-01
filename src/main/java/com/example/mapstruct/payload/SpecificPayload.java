package com.example.mapstruct.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecificPayload implements CommonPayload {

    Long number;

    String name;
}
