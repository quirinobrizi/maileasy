package eu.codesketch.test.maileasy.infrastructure.repository.matcher;

public abstract class AbstractMatcher implements Matcher {
	private final String property;

	private final String matcher;

	private String value;

	public AbstractMatcher(String property, String matcher) {
		this.property = property;
		this.matcher = matcher;
	}

	@Override
	public boolean canMatch(String filter, String matcher) {
		String[] parts = matcher.split(":");
		return (getProperty().equals(filter)) && (getMatcher().equals(parts[0]));
	}

	public String getMatcher() {
		return this.matcher;
	}

	public String getProperty() {
		return this.property;
	}

	public String getValue() {
		return this.value;
	}

	protected void setValue(String value) {
		this.value = value;
	}
}
