package com.example.mapstruct.mapper;

import com.example.mapstruct.entity.CommonEntity;
import com.example.mapstruct.payload.CommonPayload;
import org.mapstruct.AfterMapping;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = CommonMapper.class
)
public interface CommonMapperConfig<P extends CommonPayload, E extends CommonEntity> extends CommonMapper<P, E> {

    @AfterMapping
    default void afterMapping(@MappingTarget E entity, P payload) {
        if (entity.getNumber() > 0) {
            entity.setPositive(true);
        }
    }
}
