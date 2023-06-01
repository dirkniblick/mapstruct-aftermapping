package com.example.mapstruct.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecificEntity implements CommonEntity {

    Long number;

    String name;

    Boolean positive = false;
}
