/*    */ package eu.codesketch.test.maileasy.infrastructure.repository;

/*    */
/*    */ import eu.codesketch.test.maileasy.domain.model.Mail;
/*    */ import eu.codesketch.test.maileasy.infrastructure.repository.matcher.Matcher;
/*    */ import eu.codesketch.test.maileasy.infrastructure.repository.matcher.MatcherProvider;
/*    */ import eu.codesketch.test.maileasy.infrastructure.repository.translator.MailTranslator;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Repository;
/*    */ import org.subethamail.wiser.Wiser;
/*    */ import org.subethamail.wiser.WiserMessage;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ @Repository
/*    */ public class MailEasyRepository
		/*    */ implements eu.codesketch.test.maileasy.domain.repository.MailEasyRepository
/*    */ {
	/*    */ @Autowired
	/*    */ private MatcherProvider matcherProvider;
	/*    */ @Autowired
	/*    */ private MailTranslator mailTranslator;
	/*    */ @Autowired
	/*    */ private Wiser wiser;

	/*    */
	/*    */ public List<Mail> getAllMatchingMails(Map<String, String> filters)
	/*    */ {
		/* 42 */ List<WiserMessage> messages = new ArrayList();
		/* 43 */ for (Matcher matcher : this.matcherProvider.getAllMatchers(filters)) {
			/* 44 */ messages.addAll(matcher.match(this.wiser));
			/*    */ }
		/* 46 */ return this.mailTranslator.translate(messages);
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/infrastructure/repository/MailEasyRepository.class Java compiler
 * version: 8 (52.0) JD-Core Version: 0.7.1
 */