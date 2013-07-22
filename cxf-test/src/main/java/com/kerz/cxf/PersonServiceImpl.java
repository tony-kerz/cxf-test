package com.kerz.cxf;

import javax.jws.WebService;

@WebService
public class PersonServiceImpl implements PersonService {
	public Person get(String id) {
		Person p = new Person();
		p.setFirstName("fred");
		p.setLastName("flintstone");
		return p;
	}
}
