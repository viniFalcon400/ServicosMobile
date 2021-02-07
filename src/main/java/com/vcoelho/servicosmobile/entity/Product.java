package com.vcoelho.servicosmobile.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vinicius
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 250, nullable = false)
	private String name;

	@Column(length = 500)
	private String description;

	@Column(nullable = false)
	private BigDecimal value;

	@Column(nullable = false)
	private LocalDateTime dateRegister;

}
