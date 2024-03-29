package com.jiera.afrecipes.query;

public class UserQuery {
    public static final String INSERT_USER_QUERY = "INSERT INTO Users (first_name, last_name, username, email, password) VALUES (:firstName, :lastName, :username, :email, :password)";
    public static final String COUNT_USER_EMAIL_QUERY = "SELECT COUNT(*) FROM Users WHERE email = :email";
    public static final String INSERT_ACCOUNT_VERIFICATION_URL_QUERY = "INSERT INTO AccountVerifications (user_id, url) VALUES (:userId, :url)";
}
