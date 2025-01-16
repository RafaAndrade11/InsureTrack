package application.service;

import com.insuretrack.domain.model.Client;

public interface ClientService {
    Client createClient (Client client);
    void deleteClient (Long id);
}
