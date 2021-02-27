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
import com.vcoelho.servicosmobile.service.UserSystemService;
import com.vcoelho.servicosmobile.dto.request.UserSystemDTO;
import com.vcoelho.servicosmobile.dto.response.MessageResponseDTO;
import com.vcoelho.servicosmobile.exception.InformationNotFoundException;

/**
 *
 * @author vinicius
 */
@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor(onConstructor = @__(
		@Autowired))
public class UserSystemController {

	private final UserSystemService userSystemService;

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public UserSystemDTO create(@Valid @RequestBody UserSystemDTO userSystemDTO) {
		return userSystemService.create(userSystemDTO);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UserSystemDTO update(@PathVariable Long id, @RequestBody @Valid UserSystemDTO userSystemDTO)  throws InformationNotFoundException{
		return userSystemService.update(id, userSystemDTO);
	}

	@GetMapping
	public List<UserSystemDTO> listAll() {
		return userSystemService.listAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UserSystemDTO findById(@PathVariable Long id) throws InformationNotFoundException {
		return userSystemService.findById(id);
	}
}
