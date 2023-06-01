package com.example.mapstruct.entity;

import com.example.mapstruct.entity.CommonEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecificEntity implements CommonEntity {

    Long id;

    String name;
}
