package com.vcoelho.servicosmobile.entity;

import org.codehaus.jackson.annotate.JsonIgnore;
import java.io.Serializable;
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
public class UserSystem implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 250)
	private String nome;

	@Column(unique = true, nullable = false)
	private String email;

	@JsonIgnore
	private String senha;

}
