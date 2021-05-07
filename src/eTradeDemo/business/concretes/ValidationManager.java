package eTradeDemo.business.concretes;

import java.util.regex.Pattern;

import eTradeDemo.business.abstracts.ValidationService;
import eTradeDemo.entities.concretes.User;

public class ValidationManager implements ValidationService {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public boolean validate(User user) {
		boolean isValid = (isEmailFormatValid(user) && isPasswordLengthValid(user) && isFirstNameLengthValid(user)
				&& isLastNameLengthValid(user));
		return isValid;
	}

	public boolean isEmailFormatValid(User user) {
		if (!user.getEmail().isEmpty()) {
			return VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail()).find();
		}
		return false;
	}

	private boolean isPasswordLengthValid(User user) {
		return user.getPassword().length() >= 6;
	}

	private boolean isFirstNameLengthValid(User user) {
		return user.getFirstName().length() > 2;
	}

	private boolean isLastNameLengthValid(User user) {
		return user.getLastName().length() > 2;

	}

}
