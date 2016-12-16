/*    */ package eu.codesketch.test.maileasy.infrastructure.repository.matcher;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.mail.MessagingException;
/*    */ import javax.mail.internet.MimeMessage;
/*    */ import org.springframework.stereotype.Component;
/*    */ import org.subethamail.wiser.Wiser;
/*    */ import org.subethamail.wiser.WiserMessage;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ @Component
/*    */ public class SubjectEqualsMatcher/*    */ extends AbstractMatcher
/*    */ {
	/*    */ public SubjectEqualsMatcher()
	/*    */ {
		/* 23 */ super("subject", "equals");
		/*    */ }

	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */
	/*    */ public List<WiserMessage> match(Wiser wiser)
	/*    */ {
		/* 35 */ List<WiserMessage> answer = new ArrayList();
		/* 36 */ List<WiserMessage> messages = wiser.getMessages();
		/* 37 */ for (WiserMessage message : messages) {
			/*    */ try {
				/* 39 */ if (message.getMimeMessage().getSubject().equals(getValue())) {
					/* 40 */ answer.add(message);
					/*    */ }
				/*    */ }
			/*    */ catch (MessagingException localMessagingException) {
			}
			/*    */ }
		/*    */
		/* 46 */ return answer;
		/*    */ }

	/*    */
	/*    */ public Matcher cloneFor(String filter)
	/*    */ {
		/* 51 */ SubjectEqualsMatcher answer = new SubjectEqualsMatcher();
		/* 52 */ answer.setValue(filter.split(":")[1]);
		/* 53 */ return answer;
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/infrastructure/repository/matcher/SubjectEqualsMatcher.class Java
 * compiler version: 8 (52.0) JD-Core Version: 0.7.1
 */