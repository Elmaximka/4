package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User getUserByCarNumberAndSeries(long number, int series) {
        return userDao.getUserByCarNumberAndSeries(number, series);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

}
