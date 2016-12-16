package eu.codesketch.test.maileasy.domain.repository;

import java.util.List;
import java.util.Map;

import eu.codesketch.test.maileasy.domain.model.Mail;

/**
 * 
 * @author quirino
 *
 */
public abstract interface MailEasyRepository {
	public abstract List<Mail> getAllMatchingMails(Map<String, String> paramMap);
}
