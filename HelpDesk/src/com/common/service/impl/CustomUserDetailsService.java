package com.common.service.impl;


import com.common.entity.Role;
import com.common.entity.User;
import com.common.service.RoleService;
import com.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String ssoId)
			throws UsernameNotFoundException {
		User user = userService.findByLogin(ssoId);
		//System.out.println("User : "+user);
		if(user==null){
			//System.out.println("User not found");
			throw new UsernameNotFoundException("Username not found");
		}
			return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), 
				 true, true, true, true, getGrantedAuthorities(user));
	}

	
	private List<GrantedAuthority> getGrantedAuthorities(User user){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		//for(UserProfile userProfile : user.getUserProfiles()){
			//System.out.println("UserProfile : "+userProfile);
		String role = "";
		List<Role> roleList = roleService.getAll();
		for(Role roles : roleList) {
            System.out.println(roles.getIdRole() + "   " + roles.getNameRole() + "  " + user.getRoleIdRole());
            if(roles.getIdRole() == user.getRoleIdRole())role = roles.getNameRole();
        }
        System.out.println(role);
        authorities.add(new SimpleGrantedAuthority("ROLE_"+role));
		//}
		//System.out.print("authorities :"+authorities);
		return authorities;
	}
	
}
