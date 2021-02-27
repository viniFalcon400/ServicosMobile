package com.vcoelho.servicosmobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.vcoelho.servicosmobile.repository.UserSystemRepository;
import com.vcoelho.servicosmobile.mapper.UserSystemMapper;
import com.vcoelho.servicosmobile.dto.response.MessageResponseDTO;
import com.vcoelho.servicosmobile.entity.UserSystem;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.vcoelho.servicosmobile.dto.request.UserSystemDTO;
import com.vcoelho.servicosmobile.exception.InformationNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author vinicius
 */
@Service
@AllArgsConstructor(onConstructor = @__(
		@Autowired))
public class UserSystemService {

	private final UserSystemRepository userSystemRepository;

	@Autowired
	private final UserSystemMapper userSystemMapper;

	@Autowired
	private BCryptPasswordEncoder pe;

	public UserSystemDTO create(UserSystemDTO userSystemDTO) {
		UserSystem userSystem = userSystemMapper.toModel(userSystemDTO);
		userSystem.setSenha(pe.encode(userSystemDTO.getSenha()));
		UserSystem savedUserSystem = userSystemRepository.save(userSystem);

//		MessageResponseDTO messageResponse = createMessageResponse("User successfully created with ID ", savedUserSystem.getId());

		return userSystemMapper.toDTO(savedUserSystem);
	}

	public UserSystemDTO update(Long id, UserSystemDTO userSystemDTO) throws InformationNotFoundException {
		userSystemRepository.findById(id).orElseThrow(() -> new InformationNotFoundException(id));

		UserSystem updatedUserSystem = userSystemMapper.toModel(userSystemDTO);
		updatedUserSystem.setSenha(pe.encode(userSystemDTO.getSenha()));
		UserSystem savedUserSystem = userSystemRepository.save(updatedUserSystem);

//		MessageResponseDTO messageResponse = createMessageResponse("User successfully updated with ID ", savedUserSystem.getId());

		return userSystemMapper.toDTO(savedUserSystem);
	}

	public UserSystemDTO findById(Long id) throws InformationNotFoundException {
		UserSystem userSystem = userSystemRepository.findById(id)
				.orElseThrow(() -> new InformationNotFoundException(id));

		return userSystemMapper.toDTO(userSystem);
	}

	public List<UserSystemDTO> listAll() {
		List<UserSystem> userSystem = userSystemRepository.findAll();
		return userSystem.stream()
				.map(userSystemMapper::toDTO)
				.collect(Collectors.toList());
	}

//	private MessageResponseDTO createMessageResponse(String message, Long id) {
//		return MessageResponseDTO.builder()
//				.message(message + id)
//				.build();
//	}
}
