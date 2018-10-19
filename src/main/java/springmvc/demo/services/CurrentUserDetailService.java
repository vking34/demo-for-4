package springmvc.demo.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrentUserDetailService implements UserDetailsService {

//    @Autowired
//    private UsersRepository usersRepository;

    private static final String pwd = "$2a$10$uIk9FzWNL3jTL238rO3p0uPvGD.edyUpK1vZPJixHoCUTkigOj8N2";
    private static final String username = "vking34";
    private static final List<GrantedAuthority> grantedAuthorities = AuthorityUtils.createAuthorityList("ROLE_USER");

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {


        return new org.springframework.security.core.userdetails.User(username, pwd, grantedAuthorities);
    }
}
