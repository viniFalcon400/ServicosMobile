package com.vcoelho.servicosmobile.messages;

import java.util.Objects;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 *
 * @author vinicius
 */
@Component
public class Messages {

	@Autowired
	private MessageSource messageSource;
	private MessageSourceAccessor accessor;

	public static final String KEY_ID_ENUM = "enum.";

	@PostConstruct
	private void init() {
		accessor = new MessageSourceAccessor(messageSource, LocaleContextHolder.getLocale());
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource);
		return bean;
	}

	@Bean
	@Order(Ordered.HIGHEST_PRECEDENCE)
	CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}

	public String get(String code, String... args) {
		return accessor.getMessage(code, args);
	}

	public String get(String code) {
		return accessor.getMessage(code);
	}

	public String getDescription(Enum<?> value) {
		if (Objects.isNull(value)) {
			return null;
		}
		return accessor.getMessage(KEY_ID_ENUM + value.getClass().getSimpleName() + "_" + value.name());
	}

}
