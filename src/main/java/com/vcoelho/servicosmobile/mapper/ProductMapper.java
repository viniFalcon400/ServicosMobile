package com.vcoelho.servicosmobile.mapper;

import com.vcoelho.servicosmobile.dto.request.ProductDTO;
import com.vcoelho.servicosmobile.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author vinicius
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {

	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	/**
	 *
	 * @param productDTO
	 * @return
	 */
	@Mapping(target = "dateRegister", source = "dateRegister", dateFormat = "dd/MM/yyyy HH:mm:ss")
	Product toModel(ProductDTO productDTO);

	ProductDTO toDTO(Product product);
}
