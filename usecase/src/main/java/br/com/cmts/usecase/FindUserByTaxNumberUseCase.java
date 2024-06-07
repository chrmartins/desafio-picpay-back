package br.com.cmts.usecase;

import br.com.cmts.core.domain.User;

public interface FindUserByTaxNumberUseCase {
    User findByTaxNumber(String taxNumber);
}
