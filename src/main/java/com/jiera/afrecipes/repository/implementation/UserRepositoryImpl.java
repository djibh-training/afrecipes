package com.jiera.afrecipes.repository.implementation;

import java.util.Collection;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.jiera.afrecipes.domain.Role;
import com.jiera.afrecipes.domain.User;
import com.jiera.afrecipes.enumeration.RoleType;
import com.jiera.afrecipes.exception.ApiException;
import com.jiera.afrecipes.repository.RoleRepository;
import com.jiera.afrecipes.repository.UserRepository;
import com.jiera.afrecipes.query.UserQuery;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository<User> {

    private final NamedParameterJdbcTemplate jdbc;
    private final RoleRepository<Role> roleRepository;

    @Override
    public User create(User user) {
        // check the email is unique
        if (getEmailCount(user.getEmail().trim().toLowerCase()) > 0)
            throw new ApiException("Email déjà enregistré.");
        // save new user
        try {
            KeyHolder holder = new GeneratedKeyHolder();
            SqlParameterSource parameters = getSqlParameterSource(user);
            jdbc.update(UserQuery.INSERT_USER_QUERY, parameters, holder);
            user.setId(holder.getKey().longValue());
            // add role to user
            roleRepository.addRoleToUser(user.getId(), RoleType.ROLE_USER.name());
            // send verification url
            // save url in verification table
            // send email to user with verification url
            // return newly created user
            // if any errors, throw exception with proper message
        } catch (EmptyResultDataAccessException exception) {

        } catch (Exception exception) {
        }

        return null;
    }

    @Override
    public Collection<User> list(int page, int pageSize) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'list'");
    }

    @Override
    public User get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public User update(User data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Boolean delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    private int getEmailCount(String email) {
        return jdbc.queryForObject(UserQuery.COUNT_USER_EMAIL_QUERY, Map.of("email", email), Integer.class);
    }

    private SqlParameterSource getSqlParameterSource(User user) {
        return null;
    }

}
