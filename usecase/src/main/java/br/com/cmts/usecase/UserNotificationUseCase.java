package br.com.cmts.usecase;

import br.com.cmts.core.domain.Transaction;

public interface UserNotificationUseCase {
    Boolean notificate(Transaction transaction, String email);
}
