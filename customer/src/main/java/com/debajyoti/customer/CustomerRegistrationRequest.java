package com.debajyoti.customer;

public record CustomerRegistrationRequest (
    String firstName,
    String lastName,
    String email) {
}
