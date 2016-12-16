package eu.codesketch.test.maileasy.infrastructure.repository.translator;

import java.util.ArrayList;
import java.util.List;

import javax.mail.Address;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;
import org.subethamail.wiser.WiserMessage;

import eu.codesketch.test.maileasy.domain.model.Mail;

@Component
public class MailTranslator {
	public List<Mail> translate(List<WiserMessage> messages) {
		List<Mail> answer = new ArrayList<>();
		for (WiserMessage message : messages) {
			answer.add(translate(message));
		}
		return answer;
	}

	public Mail translate(WiserMessage message) {
		try {
			MimeMessage mimeMessage = message.getMimeMessage();
			return new Mail(getAddresses(mimeMessage, RecipientType.TO), getAddresses(mimeMessage, RecipientType.CC),
					getAddresses(mimeMessage, RecipientType.BCC), getFrom(mimeMessage), mimeMessage.getSubject(), null);
		} catch (MessagingException e) {
		}
		return null;
	}

	private String getAddresses(MimeMessage mimeMessage, RecipientType recipientType) {
		try {
			Address[] addresses = mimeMessage.getRecipients(recipientType);
			if (addresses == null) {
				return null;
			}
			StringBuilder builder = new StringBuilder();
			Address[] arrayOfAddress1;
			int j = (arrayOfAddress1 = addresses).length;
			for (int i = 0; i < j; i++) {
				Address address = arrayOfAddress1[i];
				InternetAddress ia = (InternetAddress) address;
				builder.append(ia.getAddress()).append(";");
			}
			return builder.substring(0, builder.length() - 1);
		} catch (MessagingException e) {
		}
		return "";
	}

	private String getFrom(MimeMessage mimeMessage) {
		try {
			Address[] addresses = mimeMessage.getFrom();
			StringBuilder builder = new StringBuilder();
			Address[] arrayOfAddress1;
			int j = (arrayOfAddress1 = addresses).length;
			for (int i = 0; i < j; i++) {
				Address address = arrayOfAddress1[i];
				InternetAddress ia = (InternetAddress) address;
				builder.append(ia.getAddress()).append(";");
			}
			return builder.substring(0, builder.length() - 1);
		} catch (MessagingException e) {
		}
		return "";
	}
}
