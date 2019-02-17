package ru.javawebinar.topjava.repository.inmemory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.util.UserUtil;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryUserRepositoryImpl implements UserRepository {
    private static final Logger log = LoggerFactory.getLogger(InMemoryUserRepositoryImpl.class);
    private Map<Integer, User> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        UserUtil.Users.forEach(this::save);
    }

    @Override
    public boolean delete(int id) {
        log.info("delete {}", id);
        if (repository.get(id)!=null){
            repository.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public User save(User user) {
        if (user.isNew()){
            log.info("save {}", user);
            user.setId(counter.incrementAndGet());
            repository.put(user.getId(), user);
            return user;
        }
        return repository.put(user.getId(), user);
    }

    @Override
    public User get(int id) {
        log.info("get {}", id);
        return repository.get(id);
    }

    @Override
    public Collection<User> getAll() {
        log.info("getAll");
        return repository.values();
    }

    @Override
    public User getByEmail(String email) {
        log.info("getByEmail {}", email);
        for (Map.Entry<Integer, User> entry : repository.entrySet()) {
            if (entry.getValue().getEmail().equals(email)) return entry.getValue();
        }
        return null;
    }
}
