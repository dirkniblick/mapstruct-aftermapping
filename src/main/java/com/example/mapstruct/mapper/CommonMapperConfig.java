package com.example.mapstruct.mapper;

import com.example.mapstruct.payload.CommonPayload;
import com.example.mapstruct.entity.CommonEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        uses = CommonMapper.class,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CommonMapperConfig<P extends CommonPayload, E extends CommonEntity> extends CommonMapper<P, E> {

    @AfterMapping
    default void foobar(@MappingTarget E commonEntity, P payload) {
        System.out.println(commonEntity.getId());
    }
}
