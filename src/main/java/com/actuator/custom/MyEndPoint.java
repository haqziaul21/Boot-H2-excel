package com.actuator.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class MyEndPoint {

	@ReadOperation
	public MyEndPointResponse myEndPointResponse() {
		return new MyEndPointResponse(1000, "My custom endpoint", "UP");
	}
}
