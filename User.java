package dev.selenium.getting_started;

public class User {
    private String name_;
    private String surname_;
    private String login_;
    private String password_;
    User(String name, String login, String password)
    {
        name_ = name;
        login_ = login;
        password_ = password;
    }

    public String getName()
    {
        return name_;
    }

    public String getLogin()
    {
        return login_;
    }

    public String getPassword()
    {
        return password_;
    }
}
