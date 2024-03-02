package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bindings.LoginRequest;
import com.ashokit.constants.AppConstants;
import com.ashokit.entities.UserEntity;
import com.ashokit.props.AppProperties;
import com.ashokit.repositories.UserRepository;

@Service 
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userrepo;
	
	@Autowired
	private AppProperties props;
	
	@Override
	public String login(LoginRequest request) {
		UserEntity user = userrepo.findByUserEmailandUserPwd(request.getEmail(),request.getPwd());
		if (user == null) {
       return props.getMessages().get(AppConstants.INVALID_CREDENTIALS);
		}
		
		if (user.getUserAccStatus().equals(AppConstants.LOCKED)) {
			return  props.getMessages().get(AppConstants.ACC_LOCKED);
		}
		return AppConstants.SUCCESS;
	}

}
