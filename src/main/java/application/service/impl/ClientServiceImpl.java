package application.service.impl;

import application.service.ClientService;
import com.insuretrack.domain.model.Client;
import com.insuretrack.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {

        return client;
    }

    @Override
    public void deleteClient(Long id) {

    }
}
