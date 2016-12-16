package eu.codesketch.test.maileasy.infrastructure.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

@JsonInclude(content = JsonInclude.Include.NON_NULL)
public abstract interface Message extends Serializable {
}

/*
 * Location:
 * /home/quirino/Projects/maileasy/maileasy/target/classes/!/eu/codesketch/test/
 * maileasy/infrastructure/message/Message.class Java compiler version: 8 (52.0)
 * JD-Core Version: 0.7.1
 */