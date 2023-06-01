package com.example.mapstruct.mapper;

import com.example.mapstruct.EntityContext;
import com.example.mapstruct.entity.CommonEntity;
import com.example.mapstruct.payload.CommonPayload;
import org.mapstruct.Context;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

@MapperConfig
public interface CommonMapper<P extends CommonPayload, E extends CommonEntity> {

    P toPayload(E entity);

    E toNewEntity(P payload);

    E toUpdatedEntity(P payload, @MappingTarget E entity, @Context EntityContext context);
}
