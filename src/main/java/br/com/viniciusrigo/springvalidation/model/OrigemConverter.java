package br.com.viniciusrigo.springvalidation.model;

import java.util.Arrays;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.viniciusrigo.springvalidation.exception.BadRequestExceptiom;

@Component
public class OrigemConverter implements Converter<String, OrigemEnum> {

	@Override
	public OrigemEnum convert(String s) {
		return  Arrays.asList(OrigemEnum.values()).stream()
												  .filter(o -> o.getCodigo().equalsIgnoreCase(s))
												  .findFirst().orElseThrow( () -> new BadRequestExceptiom("origem","Valor inválido"));
		
	}



}
