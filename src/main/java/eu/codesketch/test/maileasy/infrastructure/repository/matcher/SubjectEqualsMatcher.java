package eu.codesketch.test.maileasy.infrastructure.repository.matcher;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.stereotype.Component;
import org.subethamail.wiser.Wiser;
import org.subethamail.wiser.WiserMessage;

@Component
public class SubjectEqualsMatcher extends AbstractMatcher {
	public SubjectEqualsMatcher() {
		super("subject", "equals");
	}

	@Override
	public List<WiserMessage> match(Wiser wiser) {
		List<WiserMessage> answer = new ArrayList<>();
		List<WiserMessage> messages = wiser.getMessages();
		for (WiserMessage message : messages) {
			try {
				if (message.getMimeMessage().getSubject().equals(getValue())) {
					answer.add(message);
				}
			} catch (MessagingException localMessagingException) {
			}
		}

		return answer;
	}

	@Override
	public Matcher cloneFor(String filter) {
		SubjectEqualsMatcher answer = new SubjectEqualsMatcher();
		answer.setValue(filter.split(":")[1]);
		return answer;
	}
}
