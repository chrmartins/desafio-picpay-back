package br.com.cmts.usecase;

import br.com.cmts.core.domain.Transaction;

public interface TransferUseCase {
    Boolean transfer(Transaction transaction);
}
