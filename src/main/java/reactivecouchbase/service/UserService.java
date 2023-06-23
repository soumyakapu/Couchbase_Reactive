package reactivecouchbase.service;


import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Service;
import reactivecouchbase.model.User;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    private final CouchbaseTemplate couchbaseTemplate;
    public UserService(final  CouchbaseTemplate cuCouchbaseTemplate){
        this.couchbaseTemplate = cuCouchbaseTemplate;
    }
//    @Autowired
//    private UserRepo couchRepo;
    public Mono<User> create(User user){
        return Mono.just(couchbaseTemplate.save(user));
    }
}
