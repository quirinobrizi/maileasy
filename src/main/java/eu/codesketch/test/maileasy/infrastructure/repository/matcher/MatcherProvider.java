package eu.codesketch.test.maileasy.infrastructure.repository.matcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MatcherProvider {
	private List<Matcher> matchers;

	@Autowired
	public MatcherProvider(List<Matcher> matchers) {
		this.matchers = matchers;
	}

	public List<Matcher> getAllMatchers(Map<String, String> filters) {
		List<Matcher> answer = new ArrayList<>();
		for (Entry<String, String> entry : filters.entrySet()) {
			for (Matcher matcher : matchers) {
				if (matcher.canMatch(entry.getKey(), entry.getValue())) {
					answer.add(matcher.cloneFor(entry.getValue()));
				}
			}
		}
		return answer;
	}
}
