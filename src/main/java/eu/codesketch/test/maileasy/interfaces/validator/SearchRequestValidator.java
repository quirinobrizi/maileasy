/*    */ package eu.codesketch.test.maileasy.interfaces.validator;

/*    */
/*    */ import eu.codesketch.test.maileasy.infrastructure.config.MailEasyConfig;
/*    */ import eu.codesketch.test.maileasy.infrastructure.exception.BadRequestException;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Component;
/*    */ import org.springframework.util.StringUtils;

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
/*    */ public class SearchRequestValidator
/*    */ {
	/*    */ @Autowired
	/*    */ private MailEasyConfig mailEasyConfig;

	/*    */
	/*    */ public void validate(Map<String, String> filters)
	/*    */ {
		/* 28 */ if ((filters == null) || (filters.isEmpty())) {
			/* 29 */ throw new BadRequestException("filters must be provided for search");
			/*    */ }
		/*    */
		/* 32 */ List<String> filtersAllowed = this.mailEasyConfig.getFiltersAllowed();
		/* 33 */ List<String> filtersMatchers = this.mailEasyConfig.getFiltersMatchers();
		/* 34 */ for (Map.Entry<String, String> entry : filters.entrySet()) {
			/* 35 */ if (!filtersAllowed.contains(entry.getKey())) {
				/* 36 */ throw new BadRequestException(
						String.format("filter %s is not allowed", new Object[] { entry.getKey() }));
				/*    */ }
			/* 38 */ String value = (String) entry.getValue();
			/* 39 */ String[] parts = value.split(":");
			/* 40 */ if (parts.length < 2) {
				/* 41 */ throw new BadRequestException("filter should be provided in the form <matcher>:<value>");
				/*    */ }
			/* 43 */ if (!filtersMatchers.contains(parts[0])) {
				/* 44 */ throw new BadRequestException(
						String.format("matcher %s is not allowed", new Object[] { parts[0] }));
				/*    */ }
			/* 46 */ if (!StringUtils.hasText(parts[1])) {
				/* 47 */ throw new BadRequestException("matcher value must be provided <matcher>:<value>");
				/*    */ }
			/*    */ }
		/*    */ }
	/*    */ }

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/interfaces/validator/SearchRequestValidator.class Java compiler
 * version: 8 (52.0) JD-Core Version: 0.7.1
 */