package br.edu.iesp.address.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iesp.address.entity.Address;
import br.edu.iesp.address.property.AddressProperty;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags={"addrres"})
@RestController
@RequestMapping("query") 
public class AdressController {
	@Autowired
	private AddressProperty addressProperty;

	@ApiOperation(value = "show viacep address by code", response=Iterable.class)
	@GetMapping(path = "{code}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Address getDefaultAddress(@PathVariable("code") String code) {
		System.out.println(addressProperty.getMessageNotFound());
		
		return new Address();
		
	}
}
