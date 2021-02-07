package com.vcoelho.servicosmobile.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.vcoelho.servicosmobile.dto.request.ProductDTO;
import com.vcoelho.servicosmobile.exception.InformationNotFoundException;
import com.vcoelho.servicosmobile.service.ProductService;

/**
 *
 * @author vinicius
 */
@RestController
@RequestMapping("/api/v1/produtc")
@AllArgsConstructor(onConstructor = @__(
		@Autowired))
public class ProductController {

	private final ProductService produtcService;

	@PostMapping
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ProductDTO create(@Valid @RequestBody ProductDTO produtcDTO) {
		return produtcService.create(produtcDTO);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ProductDTO update(@PathVariable Long id, @RequestBody @Valid ProductDTO produtcDTO) throws InformationNotFoundException {
		return produtcService.update(id, produtcDTO);
	}

	@GetMapping
	public List<ProductDTO> listAll() {
		return produtcService.listAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ProductDTO findById(@PathVariable Long id) throws InformationNotFoundException {
		return produtcService.findById(id);
	}

	@GetMapping("/name/{name}")
	@ResponseStatus(HttpStatus.OK)
	public List<ProductDTO> findByName(@PathVariable String name) {
		return produtcService.findByNameIgnoreCaseContaining(name);
	}
}
