package eu.codesketch.test.maileasy.infrastructure.repository.matcher;

import java.util.List;

import org.subethamail.wiser.Wiser;
import org.subethamail.wiser.WiserMessage;

public abstract interface Matcher {
	public abstract List<WiserMessage> match(Wiser paramWiser);

	public abstract boolean canMatch(String paramString1, String paramString2);

	public abstract Matcher cloneFor(String paramString);
}
