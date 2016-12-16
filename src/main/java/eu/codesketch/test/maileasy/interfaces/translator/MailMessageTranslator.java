/*    */ package eu.codesketch.test.maileasy.interfaces.translator;

/*    */
/*    */ import eu.codesketch.test.maileasy.domain.model.Mail;
/*    */ import eu.codesketch.test.maileasy.infrastructure.message.MailMessage;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.springframework.stereotype.Component;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ @Component
/*    */ public class MailMessageTranslator
/*    */ {
	/*    */ public List<MailMessage> translate(List<Mail> mails)
	/*    */ {
		/* 22 */ if (mails == null) {
			/* 23 */ return null;
			/*    */ }
		/* 25 */ List<MailMessage> answer = new ArrayList();
		/* 26 */ for (Mail mail : mails) {
			/* 27 */ if (mail != null)
			/*    */ {
				/*    */
				/* 30 */ answer.add(translate(mail));
			}
			/*    */ }
		/* 32 */ return answer;
		/*    */ }

	/*    */
	/*    */ public MailMessage translate(Mail mail) {
		/* 36 */ if (mail == null) {
			/* 37 */ return null;
			/*    */ }
		/* 39 */ return new MailMessage(mail.getTo(), mail.getCc(), mail.getBcc(), mail.getFrom(), mail.getSubject(),
				/* 40 */ mail.getBody());
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/interfaces/translator/MailMessageTranslator.class Java compiler
 * version: 8 (52.0) JD-Core Version: 0.7.1
 */