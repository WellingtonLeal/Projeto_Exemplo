package br.edu.iesp.address.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("address")
@RefreshScope
@Getter
@Setter
public class AddressProperty {
	
	private String messageNotFound;

	
}
