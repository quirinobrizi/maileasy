package eu.codesketch.test.maileasy.interfaces;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eu.codesketch.test.maileasy.app.MailEasyService;
import eu.codesketch.test.maileasy.domain.model.Mail;
import eu.codesketch.test.maileasy.infrastructure.message.MailMessage;
import eu.codesketch.test.maileasy.interfaces.translator.MailMessageTranslator;
import eu.codesketch.test.maileasy.interfaces.validator.SearchRequestValidator;

@Component
public class MailEasyInterfaceImpl implements MailEasyInterface {
	@Autowired
	private MailEasyService mailEasyService;
	@Autowired
	private SearchRequestValidator searchRequestValidator;
	@Autowired
	private MailMessageTranslator mailMessageTranslator;

	@Override
	@RequestMapping({ "/" })
	public List<MailMessage> search(@RequestParam @NotNull Map<String, String> filters) {
		this.searchRequestValidator.validate(filters);
		List<Mail> mails = this.mailEasyService.search(filters);
		return this.mailMessageTranslator.translate(mails);
	}
}
