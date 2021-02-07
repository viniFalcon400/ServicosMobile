package com.vcoelho.servicosmobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.vcoelho.servicosmobile.entity.Product;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.vcoelho.servicosmobile.dto.request.ProductDTO;
import com.vcoelho.servicosmobile.exception.InformationNotFoundException;
import com.vcoelho.servicosmobile.mapper.ProductMapper;
import com.vcoelho.servicosmobile.repository.ProductRepository;

/**
 *
 * @author vinicius
 */
@Service
@AllArgsConstructor(onConstructor = @__(
		@Autowired))
public class ProductService {

	private final ProductRepository productRepository;

	@Autowired
	private final ProductMapper productMapper;

	public ProductDTO create(ProductDTO productDTO) {
		Product product = productMapper.toModel(productDTO);
		Product savedProduct = productRepository.save(product);
		return productMapper.toDTO(savedProduct);
	}

	public ProductDTO update(Long id, ProductDTO productDTO) throws InformationNotFoundException {
		productRepository.findById(id).orElseThrow(() -> new InformationNotFoundException(id));

		Product updatedProduct = productMapper.toModel(productDTO);
		Product savedProduct = productRepository.save(updatedProduct);

		return productMapper.toDTO(savedProduct);
	}

	public ProductDTO findById(Long id) throws InformationNotFoundException {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new InformationNotFoundException(id));

		return productMapper.toDTO(product);
	}

	public List<ProductDTO> listAll() {
		List<Product> product = productRepository.findAll();
		return product.stream()
				.map(productMapper::toDTO)
				.collect(Collectors.toList());
	}

	public List<ProductDTO> findByNameIgnoreCaseContaining(String name) {
		List<Product> products = productRepository.findByNameIgnoreCaseContaining(name);

		return products.stream()
				.map(productMapper::toDTO)
				.collect(Collectors.toList());
	}

}
