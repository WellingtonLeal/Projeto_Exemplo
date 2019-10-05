package br.edu.iesp.address.proxy.fallback;

import br.edu.iesp.address.entity.Address;

public interface AddressProxyFallback{
	
	public Address getAddressbyCode(String code) {
		return new Address();
		
	}
	

}
