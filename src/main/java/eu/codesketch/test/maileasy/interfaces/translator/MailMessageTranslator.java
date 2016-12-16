package eu.codesketch.test.maileasy.interfaces.translator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import eu.codesketch.test.maileasy.domain.model.Mail;
import eu.codesketch.test.maileasy.infrastructure.message.MailMessage;

@Component
public class MailMessageTranslator {
	public List<MailMessage> translate(List<Mail> mails) {
		if (mails == null) {
			return null;
		}
		List<MailMessage> answer = new ArrayList<>();
		for (Mail mail : mails) {
			if (mail != null) {

				answer.add(translate(mail));
			}
		}
		return answer;
	}

	public MailMessage translate(Mail mail) {
		if (mail == null) {
			return null;
		}
		return new MailMessage(mail.getTo(), mail.getCc(), mail.getBcc(), mail.getFrom(), mail.getSubject(),
				mail.getBody());
	}
}