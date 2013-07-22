package com.kerz.cxf;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface PersonService {
	@WebResult(name = "person") Person get(@WebParam(name = "id") String id);
}
