package com.vcoelho.servicosmobile.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vinicius
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserSystemDTO {

	private Long id;
	@NotEmpty(message = "{validator.obrigatorio}")
	@Length(min = 5, max = 120, message = "{validator.tamanho5e120}")
	private String nome;
	@NotEmpty(message = "{validator.obrigatorio}")
	@Email(message = "{validator.emailInvalido}")
	private String email;
	@NotEmpty(message = "{validator.obrigatorio}")
	private String senha;
}
