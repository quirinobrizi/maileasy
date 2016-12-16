package eu.codesketch.test.maileasy.app;

import eu.codesketch.test.maileasy.domain.model.Mail;
import java.util.List;
import java.util.Map;

public abstract interface MailEasyService {
	public abstract List<Mail> search(Map<String, String> paramMap);
}

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/app/MailEasyService.class Java compiler version: 8 (52.0) JD-Core
 * Version: 0.7.1
 */