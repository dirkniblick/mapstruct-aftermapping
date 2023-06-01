package com.example.mapstruct.payload;

import com.example.mapstruct.payload.CommonPayload;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecificPayload implements CommonPayload {

    Long id;

    String name;
}
