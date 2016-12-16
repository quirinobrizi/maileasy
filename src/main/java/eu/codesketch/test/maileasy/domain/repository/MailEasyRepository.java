package eu.codesketch.test.maileasy.domain.repository;

import eu.codesketch.test.maileasy.domain.model.Mail;
import java.util.List;
import java.util.Map;

public abstract interface MailEasyRepository {
	public abstract List<Mail> getAllMatchingMails(Map<String, String> paramMap);
}

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/domain/repository/MailEasyRepository.class Java compiler version: 8
 * (52.0) JD-Core Version: 0.7.1
 */