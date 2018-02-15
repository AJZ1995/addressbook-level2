package seedu.addressbook.data.person;

/**
 * Input validation purpose
 */

public class Contact {

    public final String value;
    public boolean isPrivate;

    public Contact(String _value, boolean _isPrivate) {
        value = _value;
        isPrivate = _isPrivate;
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

    @Override
    public String toString()
    {
        return value;
    }

    public boolean isPrivate()
    {
        return isPrivate;
    }
}
