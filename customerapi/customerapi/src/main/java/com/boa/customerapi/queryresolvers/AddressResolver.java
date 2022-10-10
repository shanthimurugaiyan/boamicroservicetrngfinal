package com.boa.customerapi.queryresolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boa.customerapi.models.Address;
import com.boa.customerapi.services.AddressService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
@Component
public class AddressResolver implements GraphQLQueryResolver{
	@Autowired
	private AddressService addressService;
	
	public List<Address> findAllAddresses(){
		return this.addressService.viewAllAddresses();
	}
	public List<Address> findAddress(long customerId){
		return this.addressService.viewAddressById(customerId);
	}

}
