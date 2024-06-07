package br.com.cmts.usecase;

public interface UserAuthenticateUseCase {
    Boolean authenticate(String username, String password);
}
