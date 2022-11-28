package org.example.strategy;

public class GiftMail implements MailCode {
    private static final String TEMPLATE = "Hi %NAME, Happy Monday!";
    public String generate(Client client) {

        return TEMPLATE.replaceAll("%NAME", client.getName());
    }

}
