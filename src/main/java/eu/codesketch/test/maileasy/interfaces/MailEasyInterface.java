package eu.codesketch.test.maileasy.interfaces;

import eu.codesketch.test.maileasy.infrastructure.message.MailMessage;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = { "/mails" }, produces = { "application/json" })
public abstract interface MailEasyInterface {
	public abstract List<MailMessage> search(Map<String, String> paramMap);
}
