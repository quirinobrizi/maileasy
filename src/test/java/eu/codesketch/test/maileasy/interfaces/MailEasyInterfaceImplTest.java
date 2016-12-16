package eu.codesketch.test.maileasy.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import eu.codesketch.test.maileasy.infrastructure.config.Application;
import eu.codesketch.test.maileasy.infrastructure.message.MailMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { Application.class })
@WebAppConfiguration
public class MailEasyInterfaceImplTest {

	@Autowired
	private MailEasyInterfaceImpl testObj;

	@Test
	public void testSearch() {
		String subject = UUID.randomUUID().toString();
		sendMessage(subject);
		Map<String, String> filters = new HashMap<>();
		filters.put("subject", "equals:" + subject);
		// act
		List<MailMessage> messages = testObj.search(filters);
		// assert
		Assert.assertEquals(1, messages.size());
		Assert.assertEquals(subject, messages.get(0).getSubject());
	}

	@Test
	public void testSearch_nt_found() {
		String subject = UUID.randomUUID().toString();
		sendMessage(subject);
		Map<String, String> filters = new HashMap<>();
		filters.put("subject", "equals:abcd");
		// act
		List<MailMessage> messages = testObj.search(filters);
		// assert
		Assert.assertEquals(0, messages.size());
	}

	private void sendMessage(String subject) {
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setPort(8025);
		sender.setHost("localhost");
		SimpleMailMessage message = new SimpleMailMessage();
		message.setText("abcd");
		message.setSubject(subject);
		message.setFrom("mail@maileasy.org");
		message.setTo("to@maileasy.org");
		sender.send(message);
	}
}
