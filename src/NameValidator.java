public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws ValidateNameException {
        if (value == null || value.trim().isEmpty()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}