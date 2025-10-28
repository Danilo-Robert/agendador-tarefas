package com.danilo.agendadortarefas.business.mapper;

import com.danilo.agendadortarefas.business.dto.TarefasDTO;
import com.danilo.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
