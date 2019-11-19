package com.actuator;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class OverrideHealth implements HealthIndicator {

	private static final String SUCCESS_CODE = "success code";

	@Override
	public Health health() {
		return checkInternet() ? Health.up().withDetail(SUCCESS_CODE, "Internet active").build()
				: Health.down().withDetail(SUCCESS_CODE, "Internet in-active").build();
	}

	private boolean checkInternet() {
		boolean flag = false;
		try {
			URL url = new URL("https://www.google.in");
			URLConnection connection = url.openConnection();
			connection.connect();
			flag = true;
		} catch (IOException e) {
			flag = false;
		}
		return flag;
	}

}
