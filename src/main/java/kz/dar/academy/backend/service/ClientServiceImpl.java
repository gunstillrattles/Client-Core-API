package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService{
    private static final HashMap<String, ClientModel> postMap = new HashMap<>();

    static {
        ClientModel clientModel1 = new ClientModel(UUID.randomUUID().toString(), "Liam", "Smith", "liamsmith@buzzle.com");
        ClientModel clientModel2 = new ClientModel(UUID.randomUUID().toString(), "Olivia", "Johnson", "oliviajohnson@abcd.com");
        ClientModel clientModel3 = new ClientModel(UUID.randomUUID().toString(), "Noah", "Williams", "ITservicedesk@bournemouthcollege.ac.uk");
        postMap.put(clientModel1.getClientId(), clientModel1);
        postMap.put(clientModel2.getClientId(), clientModel2);
        postMap.put(clientModel3.getClientId(), clientModel3);
    }
    @Override
    public void createClient(ClientModel clientModel) {
        clientModel.setClientId(UUID.randomUUID().toString());
        postMap.put(clientModel.getClientId(), clientModel);
    }

    @Override
    public List<ClientModel> getAllClients() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public ClientModel getClientById(String clientId) {
        return postMap.get(clientId);
    }

    @Override
    public void updateClientById(String clientId, ClientModel clientModel) {
        clientModel.setClientId(clientId);
        postMap.put(clientId, clientModel);
    }

    @Override
    public void deleteClientById(String clientId) {
        postMap.remove(clientId);
    }
}