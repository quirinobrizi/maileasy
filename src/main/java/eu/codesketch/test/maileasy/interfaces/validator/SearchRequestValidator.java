package eu.codesketch.test.maileasy.interfaces.validator;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import eu.codesketch.test.maileasy.infrastructure.config.MailEasyConfig;
import eu.codesketch.test.maileasy.infrastructure.exception.BadRequestException;

@Component
public class SearchRequestValidator {
	@Autowired
	private MailEasyConfig mailEasyConfig;

	public void validate(Map<String, String> filters) {
		if ((filters == null) || (filters.isEmpty())) {
			throw new BadRequestException("filters must be provided for search");
		}

		List<String> filtersAllowed = this.mailEasyConfig.getFiltersAllowed();
		List<String> filtersMatchers = this.mailEasyConfig.getFiltersMatchers();
		for (Map.Entry<String, String> entry : filters.entrySet()) {
			if (!filtersAllowed.contains(entry.getKey())) {
				throw new BadRequestException(
						String.format("filter %s is not allowed", new Object[] { entry.getKey() }));
			}
			String value = entry.getValue();
			String[] parts = value.split(":");
			if (parts.length < 2) {
				throw new BadRequestException("filter should be provided in the form <matcher>:<value>");
			}
			if (!filtersMatchers.contains(parts[0])) {
				throw new BadRequestException(String.format("matcher %s is not allowed", new Object[] { parts[0] }));
			}
			if (!StringUtils.hasText(parts[1])) {
				throw new BadRequestException("matcher value must be provided <matcher>:<value>");
			}
		}
	}
}
