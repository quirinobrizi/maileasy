package eu.codesketch.test.maileasy.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.subethamail.wiser.Wiser;
import org.subethamail.wiser.WiserMessage;

import eu.codesketch.test.maileasy.domain.model.Mail;
import eu.codesketch.test.maileasy.domain.repository.MailEasyRepository;
import eu.codesketch.test.maileasy.infrastructure.repository.matcher.Matcher;
import eu.codesketch.test.maileasy.infrastructure.repository.matcher.MatcherProvider;
import eu.codesketch.test.maileasy.infrastructure.repository.translator.MailTranslator;

@Repository
public class MailEasyRepositoryImpl implements MailEasyRepository {
	@Autowired
	private MatcherProvider matcherProvider;
	@Autowired
	private MailTranslator mailTranslator;
	@Autowired
	private Wiser wiser;

	@Override
	public List<Mail> getAllMatchingMails(Map<String, String> filters) {
		List<WiserMessage> messages = new ArrayList<>();
		for (Matcher matcher : this.matcherProvider.getAllMatchers(filters)) {
			messages.addAll(matcher.match(this.wiser));
		}
		return this.mailTranslator.translate(messages);
	}
}
