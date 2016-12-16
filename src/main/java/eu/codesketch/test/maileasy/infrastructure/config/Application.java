/*    */ package eu.codesketch.test.maileasy.infrastructure.config;

/*    */
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.boot.SpringApplication;
/*    */ import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
/*    */ import org.springframework.boot.context.properties.EnableConfigurationProperties;
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.ComponentScan;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ import org.subethamail.wiser.Wiser;

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
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ @Configuration
/*    */ @EnableAutoConfiguration
/*    */ @ComponentScan(basePackages = { "eu.codesketch.test.maileasy" })
/*    */ @EnableConfigurationProperties
/*    */ public class Application
/*    */ {
	/*    */ @Autowired
	/*    */ private MailEasyConfig mailEasyConfig;

	/*    */
	/*    */ public static void main(String[] args)
	/*    */ {
		/* 44 */ SpringApplication.run(Application.class, args);
		/*    */ }

	/*    */
	/*    */ @Bean(initMethod = "start", destroyMethod = "stop")
	/*    */ Wiser wiser() {
		/* 49 */ Wiser answer = new Wiser();
		/* 50 */ answer.setPort(this.mailEasyConfig.getSmtpPort());
		/* 51 */ answer.setHostname(this.mailEasyConfig.getSmtpHost());
		/* 52 */ return answer;
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/infrastructure/config/Application.class Java compiler version: 8
 * (52.0) JD-Core Version: 0.7.1
 */