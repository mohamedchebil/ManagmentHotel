        package com.example.springp.service.serviceImpl;


        import com.example.springp.entity.Client;
        import com.example.springp.repository.ClientRepo;
        import com.example.springp.service.ClientService;
        import org.antlr.v4.runtime.misc.LogManager;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.dao.DataAccessException;
        import org.springframework.stereotype.Service;

        import java.util.List;
        import java.util.Optional;
        import java.util.logging.Level;

        @Service
        public class ClientServ implements ClientService {

            @Autowired
            private ClientRepo clientRepo;



            @Override
            public Client save(Client client) {
                return clientRepo.save(client);
            }


            @Override
            public List<Client> findAll() {
                return (List<Client>) clientRepo.findAll();
            }

            @Override
            public void delete(Long id) {
                clientRepo.deleteById(id);
            }


            @Override
            public Client findClientByUsername(String username) {

                try {
                    return clientRepo.findClientByUsername(username);
                } catch (DataAccessException e) {
                    throw  e ;

                } catch (Exception e) {
                    throw  e ;

                }

            }

            @Override
            public Client findClientByEmail(String email) {

                try {
                    return clientRepo.findClientByEmail(email);
                } catch (Exception e ){

                    throw  e ;
                }
            }
            @Override
            public long getTotalClients() {
                return clientRepo.count();
            }

            @Override
            public List<Object[]> getMostSavedAddresses() {
                return clientRepo.findMostSavedAddresses();
            }







        }
