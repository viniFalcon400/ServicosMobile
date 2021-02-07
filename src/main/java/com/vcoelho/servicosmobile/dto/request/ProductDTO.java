package com.vcoelho.servicosmobile.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author vinicius
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

	private Long id;

	@NotEmpty(message = "{validator.obrigatorio}")
	@Length(min = 5, max = 120, message = "{validator.tamanho5e250}")
	private String name;

	@Length(max = 500, message = "{validator.tamanho500}")
	private String description;

	@DecimalMin(value = "0.01", message = "{validator.deveInformarValorMaiorZero}")
	private Double value;

	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@NotEmpty(message = "{validator.obrigatorio}")
	private String dateRegister;

}
