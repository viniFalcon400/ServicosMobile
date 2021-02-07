package com.vcoelho.servicosmobile.mapper;

import com.vcoelho.servicosmobile.dto.request.UserSystemDTO;
import com.vcoelho.servicosmobile.entity.UserSystem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author vinicius
 */
@Mapper(componentModel = "spring")
public interface UserSystemMapper {
		UserSystemMapper INSTANCE = Mappers.getMapper(UserSystemMapper.class);

//    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
	UserSystem toModel(UserSystemDTO userSystemDTO);

	@Mapping(target = "senha", ignore = true)
	UserSystemDTO toDTO(UserSystem userSystem);
}