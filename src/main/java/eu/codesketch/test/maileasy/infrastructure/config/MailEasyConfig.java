package eu.codesketch.test.maileasy.infrastructure.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@ConfigurationProperties(prefix = "maileasy")
public class MailEasyConfig {
	private int smtpPort;
	private String smtpHost;
	private String filtersAllowed;
	private String filtersMatchers;

	public int getSmtpPort() {
		return this.smtpPort;
	}

	public void setSmtpPort(int smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getSmtpHost() {
		return this.smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public List<String> getFiltersAllowed() {
		if (!StringUtils.hasText(this.filtersAllowed)) {
			return new ArrayList<>();
		}
		return Arrays.asList(this.filtersAllowed.split(","));
	}

	public void setFiltersAllowed(String filtersAllowed) {
		this.filtersAllowed = filtersAllowed;
	}

	public List<String> getFiltersMatchers() {
		if (!StringUtils.hasText(this.filtersMatchers)) {
			return new ArrayList<>();
		}
		return Arrays.asList(this.filtersMatchers.split(","));
	}

	public void setFiltersMatchers(String filtersMatchers) {
		this.filtersMatchers = filtersMatchers;
	}
}
