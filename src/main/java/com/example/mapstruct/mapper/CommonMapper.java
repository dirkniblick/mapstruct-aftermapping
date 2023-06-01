package com.example.mapstruct.mapper;

import com.example.mapstruct.EntityContext;
import com.example.mapstruct.payload.CommonPayload;
import com.example.mapstruct.entity.CommonEntity;
import org.mapstruct.Context;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

@MapperConfig
public interface CommonMapper<P extends CommonPayload, E extends CommonEntity> {

    P toPayload(E commonEntity);

    E toNewEntity(P payload);

    E toUpdatedEntity(P payload, @MappingTarget E commonEntity, @Context EntityContext entityContext);
}
