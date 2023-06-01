package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.SpecificEntity;
import com.example.mapstruct.payload.SpecificPayload;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapperConfig.class)
public interface SpecificMapper extends CommonMapperConfig<SpecificPayload, SpecificEntity> {

}
