package eu.codesketch.test.maileasy.infrastructure.repository.matcher;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.stereotype.Component;
import org.subethamail.wiser.Wiser;
import org.subethamail.wiser.WiserMessage;

@Component
public class SubjectContainsMatcher extends AbstractMatcher {
	public SubjectContainsMatcher() {
		super("subject", "contains");
	}

	@Override
	public List<WiserMessage> match(Wiser wiser) {
		List<WiserMessage> answer = new ArrayList<>();
		List<WiserMessage> messages = wiser.getMessages();
		for (WiserMessage message : messages) {
			try {
				if (message.getMimeMessage().getSubject().contains(getValue())) {
					answer.add(message);
				}
			} catch (MessagingException localMessagingException) {
			}
		}

		return answer;
	}

	@Override
	public Matcher cloneFor(String filter) {
		SubjectContainsMatcher answer = new SubjectContainsMatcher();
		answer.setValue(filter.split(":")[1]);
		return answer;
	}

}