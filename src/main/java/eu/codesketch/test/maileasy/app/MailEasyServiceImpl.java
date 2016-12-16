/*    */ package eu.codesketch.test.maileasy.app;

/*    */
/*    */ import eu.codesketch.test.maileasy.domain.model.Mail;
/*    */ import eu.codesketch.test.maileasy.domain.repository.MailEasyRepository;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;

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
/*    */ @Service
/*    */ public class MailEasyServiceImpl/*    */ implements MailEasyService
/*    */ {
	/*    */ @Autowired
	/*    */ private MailEasyRepository mailEasyRepository;

	/*    */
	/*    */ public List<Mail> search(Map<String, String> filters)
	/*    */ {
		/* 33 */ return this.mailEasyRepository.getAllMatchingMails(filters);
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/app/MailEasyServiceImpl.class Java compiler version: 8 (52.0)
 * JD-Core Version: 0.7.1
 */